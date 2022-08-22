package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Menu {

    public void PlayerTurn2(Scanner scanner) {
        Win win = new Win();
        CheckSymbol checkSymbol = new CheckSymbol();
        String[][] array = new String[3][3];
        FillingArray.fillingArray(array);                                          // заполнение пустого массива точками
        OUTER:
        for (int i = 0; i < 15; i++) {                                             // запуск общего цикла подбора значений массива
            INNER1:
            for (int i1 = 0; i1 < 15; i1++) {                                      // запуск цикла первого игрока
                System.out.println("Ход первого игрока: ");
                System.out.println("Введите команду по горизонтали от 1 до 3");
                String PlayerOne1 = scanner.nextLine();
                System.out.println("Введите команду по вертикали от 1 до 3");
                String PlayerOne2 = scanner.nextLine();
                if (!checkSymbol.checkSymbol(PlayerOne1, PlayerOne2)) {                                    // проверка введенных команд на допустимые
                    System.out.println("Ошибка ввода, повторите попытку ");
                    continue;
                }
                if ((array[Integer.parseInt(PlayerOne1) - 1][Integer.parseInt(PlayerOne2) - 1].equals("."))) {
                    array[Integer.parseInt(PlayerOne1) - 1][Integer.parseInt(PlayerOne2) - 1] = "x";    //проверка клетки и установка
                    System.out.println(Arrays.deepToString(array));
                    if (win.winСonditions(array)){
                        break OUTER;}//проверка на победу игрока
                    break;
                } else {
                    System.out.println("Клетка занята, введите номер клетки снова");
                    continue;
                }
            }
            INNER2:
            for (int i2 = 0; i2 < 15; i2++) {
                System.out.println("Ход второго игрока: ");
                System.out.println("Введите команду по горизонтали от 1 до 3");
                String PlayerTwo1 = scanner.nextLine();

                System.out.println("Введите команду по вертикали от 1 до 3");
                String PlayerTwo2 = scanner.nextLine();

                if (!checkSymbol.checkSymbol(PlayerTwo1, PlayerTwo2)) {
                    System.out.println("Ошибка ввода, повторите попытку ");
                    continue;
                }

                if (array[Integer.parseInt(PlayerTwo1) - 1][Integer.parseInt(PlayerTwo2) - 1].equals(".")) {
                    array[Integer.parseInt(PlayerTwo1) - 1][Integer.parseInt(PlayerTwo2) - 1] = "0";
                    System.out.println(Arrays.deepToString(array));
                    if (win.winСonditions(array)){
                        break OUTER;}
                    break;

                } else {
                    System.out.println("Клетка занята, введите номер клетки снова");
                    continue;
                }
            }
        }
    }


}










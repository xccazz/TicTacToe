package com.company;

import java.util.Scanner;

public class Menu {

    public void playerTurn2(Scanner scanner) {
        CheckSymbol checkSymbol = new CheckSymbol();
        OutPut outPut = new OutPut();
        String[][] array = new String[3][3];
        checkSymbol.fillingArray(array);                                          // заполнение пустого массива точками
        OUTER:
        for (int i = 0; i < 15; i++) {                                             // запуск общего цикла подбора значений массива
            INNER1:
            for (int i1 = 0; i1 < 15; i1++) {                                      // запуск цикла первого игрока
                System.out.println("Ход первого игрока: ");
                System.out.println("Введите команду по горизонтали от 1 до 3");
                String PlayerOne1 = scanner.nextLine();
                System.out.println("Введите команду по вертикали от 1 до 3");
                String PlayerOne2 = scanner.nextLine();
                if (!checkSymbol.checkSymbolUsers(PlayerOne1, PlayerOne2)) {                                    // проверка введенных команд на допустимые
                    System.out.println("Ошибка ввода, повторите попытку ");
                    continue;
                }
                if (".".equals(array[Integer.parseInt(PlayerOne1) - 1][Integer.parseInt(PlayerOne2) - 1])) {
                    array[Integer.parseInt(PlayerOne1) - 1][Integer.parseInt(PlayerOne2) - 1] = "x";    //проверка клетки и установка
                    outPut.outPut(array);
                    if (outPut.winСonditions(array)) { //проверка на победу игрока
                        break OUTER;
                    }
                    if (outPut.draw(array)) {
                        break OUTER;
                    }
                    break;
                } else {
                    System.out.println("Клетка занята, введите номер клетки снова");
                    outPut.outPut(array);
                }
            }
            INNER2:
            for (int i2 = 0; i2 < 15; i2++) {
                System.out.println("Ход второго игрока: ");
                System.out.println("Введите команду по горизонтали от 1 до 3");
                String PlayerTwo1 = scanner.nextLine();
                System.out.println("Введите команду по вертикали от 1 до 3");
                String PlayerTwo2 = scanner.nextLine();

                if (!checkSymbol.checkSymbolUsers(PlayerTwo1, PlayerTwo2)) {
                    System.out.println("Ошибка ввода, повторите попытку ");
                    continue;
                }
                if (".".equals(array[Integer.parseInt(PlayerTwo1) - 1][Integer.parseInt(PlayerTwo2) - 1])) {
                    array[Integer.parseInt(PlayerTwo1) - 1][Integer.parseInt(PlayerTwo2) - 1] = "0";
                    outPut.outPut(array);
                    if (outPut.winСonditions(array)) {
                        break OUTER;
                    }
                    if (outPut.draw(array)) {
                        break OUTER;
                    }
                    break;
                } else {
                    System.out.println("Клетка занята, введите номер клетки снова");
                    outPut.outPut(array);
                }
            }
        }
    }
}
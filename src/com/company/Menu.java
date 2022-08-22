package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Menu {

    public void PlayerTurn2(Scanner scanner) {
        Win win = new Win();
        String[][] array = new String[3][3];
        FillingArray.fillingArray(array);
        for (int i = 0; i < 15; i++) {
            for (int i1 = 0; i1 < 15; i1++) {
                System.out.println("Ход первого игрока: ");
                System.out.println("Введите команду по горизонтали от 1 до 3");
                int PlayerOne1 = Integer.parseInt(scanner.nextLine());

                System.out.println("Введите команду по вертикали от 1 до 3");
                int PlayerOne2 = Integer.parseInt(scanner.nextLine());
                //asd
                if ((array[PlayerOne1 - 1][PlayerOne2 - 1].equals("."))) {
                    array[PlayerOne1 - 1][PlayerOne2 - 1] = "x";
                    System.out.println(Arrays.deepToString(array));
                    win.winСonditions(array);
                    break;
                } else {
                    System.out.println("Клетка занята, введите номер клетки снова");
                    continue;
                }
            }
                for (int i2 = 0; i2 < 15; i2++) {
                System.out.println("Ход второго игрока: ");
                System.out.println("Введите команду по горизонтали от 1 до 3");
                int PlayerTwo1 = scanner.nextInt();

                System.out.println("Введите команду по вертикали от 1 до 3");
                int PlayerTwo2 = scanner.nextInt();
                if (array[PlayerTwo1 - 1][PlayerTwo2 - 1].equals(".")) {
                    array[PlayerTwo1 - 1][PlayerTwo2 - 1] = "0";
                    System.out.println(Arrays.deepToString(array));
                    win.winСonditions(array);
                    break;
                } else {
                    System.out.println("Клетка занята, введите номер клетки снова");
                    continue;
                }
            }
                }
            }
    public boolean checkSymbol(int a) {
        if (a == 1 || a == 2 || a == 3) {
            return true;
        } else {
            return false;
        }
    }

    public void input (Scanner scanner) {
        System.out.println("Введите команду по горизонтали от 1 до 3");
        for (int i = 0; i < 100; i++) {
        String PlayerOne1 = scanner.nextLine();
        Дальше проверка на строку, повторите попытку, тоже самое второму пользователю

        System.out.println("Введите команду по вертикали от 1 до 3");
        int PlayerOne2 = Integer.parseInt(scanner.nextLine());
    }
        }




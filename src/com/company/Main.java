package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Menu menu = new Menu();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            menu();
            String userResponse = scanner.nextLine();
            if ("1".equals(userResponse)) {
                menu.playerTurn2(scanner);
            } else if ("2".equals(userResponse)) {
                System.out.println("Выход.");
                break;
            } else {
                System.out.println("Неверная команда, повторите попытку");

            }
        }
    }
    public static void menu() {
        System.out.println("Вы хотите сыграть в игру?");
        System.out.println("1 - играть, 2 - выйти.");
    }

}


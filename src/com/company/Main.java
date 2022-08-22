package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Menu Menu = new Menu();
        Scanner scanner = new Scanner(System.in);
        menu();
        while (true) {
            String userResponse = scanner.nextLine();
            if (userResponse.equals("1")) {
                Menu.PlayerTurn2(scanner);
            } else if (userResponse.equals("2")) {
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


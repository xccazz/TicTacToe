package com.company;

public class OutPut {
    public void outPut(String[][] array) {
        System.out.print("|");
        for (int i = 0; i < 3; i++) {
            String a = array[0][i];
            System.out.print(a + "|");
        }
        System.out.println();
        System.out.println("——————");
        System.out.print("|");
        for (int j = 0; j < 3; j++) {
            String b = array[1][j];
            System.out.print(b + "|");
        }
        System.out.println();
        System.out.println("——————");
        System.out.print("|");
        for (int l = 0; l < 3; l++) {
            String c = array[2][l];
            System.out.print(c + "|");
        }
        System.out.println();
    }

    public boolean winСonditions(String[][] array) {
        if ((array[0][0].equals("x") && array[1][1].equals("x") && array[2][2].equals("x")) || (array[0][2].equals("x") && array[1][1].equals("x") && array[2][0].equals("x"))) {
            System.out.println("Победил первый игрок");
            return true;
        }
        if ((array[0][0].equals("0") && array[1][1].equals("0") && array[2][2].equals("0")) || (array[0][2].equals("0") && array[1][1].equals("0") && array[2][0].equals("0"))) {
            System.out.println("Победил второй игрок");
            return true;
        }
        for (int i = 0; i < 3; i++) {
            if ((array[i][0].equals("x") && array[i][1].equals("x") && array[i][2].equals("x")) || (array[0][i].equals("x") && array[1][i].equals("x") && array[2][i].equals("x"))) {
                System.out.println("Победил первый игрок");
                return true;
            } else if ((array[i][0].equals("0") && array[i][1].equals("0") && array[i][2].equals("0")) || (array[0][i].equals("0") && array[1][i].equals("0") && array[2][i].equals("0"))) {
                System.out.println("Победил второй игрок");
                return true;
            }
        }
        return false;
    }

    public boolean draw(String[][] array) {
        int a = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (!".".equals(array[i][j])) {
                    a++;
                }
            }
        }
        if (a == 9) {
            System.out.println("Ничья");
            return true;
        }
        return false;
    }
}

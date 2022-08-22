package com.company;

public class Win {
    public boolean winСonditions(String[][] array) {
        for (int i = 0; i < 31; i++) {
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
}

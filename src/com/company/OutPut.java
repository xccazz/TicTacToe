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

        //    System.out.println(a + "|" + b + "|" + c + "\n" + "——————");

    }
}

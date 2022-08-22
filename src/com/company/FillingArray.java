package com.company;

public class FillingArray {
    public static void fillingArray(String[][] array) {
        for (int i = 0; i < 3; i++) {
            array[i][i] = ".";

            for (int j = 0; j < 3; j++) {
                array[i][j] = ".";
            }
        }
    }
}

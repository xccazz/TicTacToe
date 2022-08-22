package com.company;

public class Draw {
    public boolean fieldIsFilled(String[][] array) {
        for (int i = 0; i < 3; i++) {


            for (int j = 0; j < 3; j++) {
                while (!array[i][i].equals("x") || !array[i][i].equals("0")) ;
                return false;
            }
        }return false;

    }
}

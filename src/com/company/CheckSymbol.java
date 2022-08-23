package com.company;

public class CheckSymbol {
    public  boolean checkSymbolUsers(String a, String b) {
        return a.equals("1") || a.equals("2") || a.equals("3") && (b.equals("1") || b.equals("2") || b.equals("3"));
    }
    public  void fillingArray(String[][] array) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = ".";
            }
        }
    }
}


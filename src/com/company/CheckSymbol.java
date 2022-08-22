package com.company;

public class CheckSymbol {
    public boolean checkSymbol(String a, String b) {
        if (a.equals("1") || a.equals("2") || a.equals("3") && (b.equals("1") || b.equals("2") || b.equals("3"))) {
            return true;
        } else {
            return false;
        }
    }
}


package com.company;

public class Convert {
    public static int convertToArab(String roman) throws Exception {
        String[] romans = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        for (int i = 0; i <= 9; i++) {
            if (romans[i].equals(roman)) return i + 1;
        }
        throw new Exception();
    }

    public static String convertToRom(int arab) {
        String[] romans = {"C", "LC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] arabians = {100, 90, 50, 40, 10, 9, 5, 4, 1};
        String rez = "";
        for (int i = 0; i < 9; i++) {
            if (arabians[i] <= arab) {
                rez += romans[i];
                arab -= arabians[i];
                i--;
            }
        }
        return rez;
    }

}

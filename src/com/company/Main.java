package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        int a, b;
        boolean isRomam = false;
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String[] parts = input.split(" ");
        if (parts.length != 3) {
            throw new Exception();
        }
        try {
            a = Integer.parseInt(parts[0]);
            b = Integer.parseInt(parts[2]);
            if (a < 1 || a > 10 || b < 1 || b > 10) throw new Exception();
        } catch (NumberFormatException e) {
            a = Convert.convertToArab(parts[0]);
            b = Convert.convertToArab(parts[2]);
            isRomam = true;
        }
        int rez = Calculator.calculate(a, b, parts[1]);
        if (isRomam) {
            if (rez <= 0) throw new Exception();
            else System.out.println(Convert.convertToRom(rez));
        }
        else System.out.println(rez);


    }
}

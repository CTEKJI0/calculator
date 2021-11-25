package com.company;

public class Calculator {
    public static int calculate (int a, int b, String op) throws Exception {
        switch (op) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "/":
                return a / b;
            case "*":
                return a * b;
        }
        throw new Exception();
    }
}

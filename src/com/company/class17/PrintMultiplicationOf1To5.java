package com.company.class17;

// Write a program to print multiplication of 1 to 5

public class PrintMultiplicationOf1To5 {

    public static void main(String[] args) {

        // 1 * 2 * 3 * 4 * 5
        int i;
        int mul = 1;
        for (i = 1; i <= 5; i++) {
            mul = mul * i;
        }
        System.out.println(mul);
    }
}
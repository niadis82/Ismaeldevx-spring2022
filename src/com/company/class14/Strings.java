package com.company.class14;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String color1 = "bleu";
        String color2 = "bleu";
        String color3 = sc.nextLine();

        if (color1 == color2) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        if (color2 == color3) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        if (color1.equals(color3)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }


}

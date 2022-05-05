package com.company.class17;

import java.util.Scanner;
public class StringPracticeWordsCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String str = sc.nextLine();

        String[] parts = str.split(" ");

        System.out.println(parts.length);
    }



}

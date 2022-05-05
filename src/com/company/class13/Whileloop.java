package com.company.class13;

import java.util.Scanner;

public class
Whileloop{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        int i = 1;

        while(i<=limit && i % 3 == 0){
            System.out.println(i);

        }
        i++;

    }
}

package com.company.class22;

import java.util.Scanner;

public class PrintNumberInArray {
    // int num = 25343
    // output
    //2
    //5
    //3
    //4
    //3
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        int somme = 0;
        while(num!=0) {

            somme = somme + num%10;
            num = num / 10;


        }
        System.out.println(somme);


    }


}

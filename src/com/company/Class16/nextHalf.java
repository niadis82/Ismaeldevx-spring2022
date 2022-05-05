package com.company.Class16;
import java.util.Scanner;
// Write a program to print 2nd half of String
public class nextHalf {
    public static void main(String[] args) {
        System.out.println("Enter any string");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if(str.length() % 2 == 0 ) {

            System.out.println("1. Second Half is: " + str.substring(str.length() / 2));

        }else{
            System.out.println("1. Second Half is: " + str.substring(str.length() / 2 + 1));
        }

    }

}

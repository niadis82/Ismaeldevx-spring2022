package com.company.Class19;

//Write a program to check given String is palindrome or not

import java.util.Scanner;

public class Method2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String rev = printReverse(str);
        System.out.println(rev);

        if(str.equals(rev)){
            System.out.println("It's palindrome");
        }else{
            System.out.println("Not palindrome");
        }

    }



    static String printReverse(String str){
        String rev = "";
        // looping from 1 to length -1
        for(int i = str.length()-1; i>=0; i--){
            rev = rev + str.charAt(i);
        }
        return rev;
    }
}

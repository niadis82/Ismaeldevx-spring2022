package com.company.Class19;

public class Method1 {

    public static void main(String[] args) {
        welcome();
add(5,6);
add(45,78);
multiplication(5,8);
division(78,45);
    }
    public static void welcome(){
        System.out.println("Welcome to our calculator!");

    }

    public static void multiplication(int a, int b){
        System.out.println(a*b);
    }
    public static void division(int a, int b){
        System.out.println(a/b);
    }


    public static void add(int a, int b){
        int sum = a + b;
        System.out.println(sum);
    }

}



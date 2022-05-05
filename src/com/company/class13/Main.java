package com.company.class13;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hooray my first java app");

        Scanner sc = new Scanner(System.in);

        System.out.println ("Enter Jake`s collection");
        double jake = sc.nextDouble();
        System.out.println ("Enter phil`s collection");
        double phil = sc.nextDouble();
        System.out.println ("Enter ryan`s collection");
        double ryan = sc.nextDouble();
        System.out.println ("Enter tom`s collection");
        double tom = sc.nextDouble();
        System.out.println ("Enter bill`s collection");
       double bill = sc.nextDouble();
        double totalProfit = jake + phil + ryan + tom + bill;
        double eachDailyProfit = totalProfit / 5;
        System.out.println ("The daily profit per performer is " + eachDailyProfit);
    }
}

package com.company.Class16;
// Take a full name from use and print initials of it
import java.util.Scanner;
public class PrintInitial {
    public static void main(String[] args) {
        System.out.println(" Enter your full name");
        Scanner sc = new Scanner(System.in);
        String fullName = sc.nextLine() ;
        String parts[] = fullName.split("");

        String firstName = parts[0];
        String middleName = parts[1];
        String lastName = parts[2];

        System.out.println(firstName.charAt(0) + "."
        + middleName.charAt(0) + "."
        + lastName.charAt(0) + ".");
    }
}

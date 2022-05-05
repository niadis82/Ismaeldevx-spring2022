package com.company.Class16;
// write a program to print each component of String into separate line
public class ExamplesStrings {
    public static void main(String[] args) {
        String address = "4949,Manitoba drive, Apt 702, Alexandria, VA, 22312";
        System.out.println("1. Street number: " + address.substring(0,4));
        System.out.println("2. Street name: " + address.substring(4,19));
        System.out.println("3. Apartment number: " + address.substring(21,28));
        System.out.println("4. City: " + address.substring(30,41));
        System.out.println("5. State: " + address.substring(42,44));
        System.out.println("6. Zip code: " + address.substring(46,51));

        System.out.println("=====================================================");

        String [] words = address.split(",");
        System.out.println(words[0].trim());
        System.out.println(words[1].trim());
        System.out.println(words[2].trim());
        System.out.println(words[3].trim());
        System.out.println(words[4].trim());
        System.out.println(words[5].trim());

        System.out.println("=========================================================");



    }
}

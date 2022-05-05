package com.company.Class16;

import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {
        String str1 = "Hello World";
        String str2 = "hello World";
        String str3 = "Hello World! Welcome to Devx!";

        // 1. Check equality of two String
        System.out.println("1. Equality: " + str1.equals(str2));
        System.out.println("======================================================");

        // 2. Check equality of two String ignoring case ( upper or lower case )
        System.out.println("1. Equality: " + str1.equalsIgnoreCase(str2));
        System.out.println("=======================================================");

        // 3. Check one String contains another String
        System.out.println("2. Contains: " + str1.contains(str2));
        System.out.println("========================================================");

//        If we want check one String contains another String ignoring case then we have to change
//        both String in same case and then check contains, so it'll check only content of both String
        String str2LowerCase = str2.toLowerCase();
        String str3LowerCase = str3.toLowerCase();
        System.out.println("3.1 Contains  " + str2LowerCase.contains(str3LowerCase));
        System.out.println("============================================================");

        //4. Changing the case of String
        System.out.println("4. Upper Case: " + str1.toUpperCase());
        System.out.println("4. Upper case: " + str2.toUpperCase());
        System.out.println("4. Lower case: " + str3.toLowerCase());
        System.out.println("==============================================================");

        // 5 Find index of character
        str1 = "Hello World";
        str3 = "Hello World! Welcome to Devx!";
        System.out.println("5. Index of Char: " + str1.indexOf('l'));
        System.out.println("5. Last Index of Char: " + str3.lastIndexOf('l'));
        System.out.println("================================================================");

        // 6. Find character at index
        str1 = "Hello World";
        System.out.println("6. Char at index: " + str1.charAt(0));
        System.out.println("====================================");

        // 7. Length of String
        str1 = "Hello World";
        str3 = "Hello World! Welcome to Devx";
        System.out.println("7. Length Of String: " + str1.length());
        System.out.println("7. Length Of String: " + str3.length());
        System.out.println("==============================================================");

        // 8. Empty and Blank
        str1 = "             ";
        str3 = "";
        System.out.println("8. Empty: " + str1.isEmpty());
        System.out.println("8. Empty: " + str3.isEmpty());
        System.out.println("8. Blank: " + str1.isBlank());
        System.out.println("8. Blank: " + str3.isBlank());
        System.out.println("==============================================================");

        // 9. Replace & ReplaceAll
        str1 = "The price is right";
        str2 = "Wrong";
        System.out.println("9. Replace: " + str1.replace("right", str2));
        System.out.println("9. ReplaceAll: " + str1.replaceAll("e", "a"));
        System.out.println("==============================================================");

        // 10. Format
        str1 = "Welcome %s, %s";
        System.out.println("10. Format: " + String.format(str1, "Niada", "Ismael"));
        System.out.println("==============================================================");

        // 11. SubString
        str1 = "My name is Ismael Niada";
        System.out.println("11. Substring: " + str1.substring(8));
        System.out.println("11. SubString: " + str1.substring(0, 8));
        System.out.println("==============================================================");

        // 12. Split
        str1 = "4949 Manitoba Drive, Apt 702, Alexandria, VA, 22304";
        String parts[] = str1.split(",");
        int i;
        for (i = 0; i < parts.length; i++) {
            System.out.println(parts[i]);

         // 12. Split
            str1 = "Welcome to java class";
            String[] words = str1.split(" ");
            System.out.println("12. Split: ");
            // Find length of String
            System.out.println(str1.length());



        }


    }
}

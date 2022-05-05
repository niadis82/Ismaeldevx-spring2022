package com.company.class15;

public class Index1 {
    public static void main(String[] args) {

        //1.
        String str1 = "Hello World";
        String str2 = "";
        String str3 = "Hello World! Welcome to Devx";


        //2.


        //3.


        //4.


        //5.


        //6.


        //7.


        //8. Empty and Blank
        str1 = "              ";
        str2 = "";
        System.out.println("8. Epmty:"+ str1.isEmpty());
        System.out.println("8. Empty:"+ str2.isEmpty());
        System.out.println("8. Blank:"+ str1.isBlank());
        System.out.println("8. Blank:"+ str2.isBlank());

        //9. Replace & ReplaceAll
        str1 = "Welcome User";
        str2 = "Devx";
        System.out.println("9. Replace: " + str1.replace("User", "Devx"));
        System.out.println("==============================================================");

        // 10. Format
        str1 = "Welcome %s, %s";
        System.out.println("10. Format:"+String.format(str1,"Niada","Ismael"));
        System.out.println("================================================================");

        // 11. SubString
        str1 = "Welcome to java class. Today is fun day";
        System.out.println("11. SubString: " + str1.substring(7));
        System.out.println("11. Substring: " + str1.substring(0,7));
        System.out.println("==================================================================");

        //12. Split
        str1 = "Welcome to java class";
        System.out.println("");
        System.out.println("");


    }


}

package com.company.Class19;

import java.util.Scanner;

public class MergeTwoWords {

    public static void main(String[] args) {
        /**
         * Merge two words with three characters one by one and print them
         * if words have more than three characters print Error message "Incorrect input! Cannot merge".
         *
         * ex
         * "ice", "sea"
         *
         *
         * output:
         * isceae
         *
         * ex2:
         * "Hot", "Day"
         *
         * output:
         * HDoaty
         *
         */
/*

        String word1 = "ice";
        String word2 = "sea";
        System.out.println("Merging words: " + word1 + ", " + word2);
        new MergeTwoWords().printMerge(word1, word2);


}

        static String printMerge (String word1, String word2) {
            System.out.println();
        }

    }

*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first word");
        String str1 = sc.nextLine();
        System.out.println("Enter second word");
        String str2 = sc.nextLine();
        String str = str1 + str2;
        if(str1.length() <=3 & str2.length() <=3){
            System.out.println(str);
        }else{
            System.out.println("Incorrect input! Cannot merge");
        }

    }
}
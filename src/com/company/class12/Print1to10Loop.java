package com.company.class12;

public class Print1to10Loop {
    public static void main(String[] args) {
// print 1 2 3 4 5 6 7 8 9
        for (int i = 1; i <= 10; ++i) {
            System.out.println(i);

        }
        System.out.println("========================================");
        // print 10 9 8 7 6 5 4 3 2 1
        for (int i = 1; i <= 10; ++i) {
            System.out.println(11 - i);
        }
        System.out.println("========================================");
        for (int i = 10; i >=1; --i) {
            if(i%2 != 0)
            System.out.println(i);
        }
        System.out.println("========================================");
// print 9 7 5 3 1
        for (int i = 10; i >= 1; i--) {
            if (i % 2 != 0)
                System.out.println(i);
        }
        System.out.println("========================================");
        // print the sum of 1+2+3+4+5+6+7+8+9+10
        int result = 0;
        for (int i = 1; i <= 10; ++i) {
            result = result + i;
        }
        System.out.println(result);
        System.out.println("========================================");
// print 1*2*3*4*5
        int sum = 1;
        for (int i = 1; i <= 5; ++i) {
            sum = sum * i;
        }
        System.out.println(sum);
    }

}

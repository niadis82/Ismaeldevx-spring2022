package com.company.class22;


public class Patern1 {

    public static void main(String[] args) {

        for (int i=1; i<=10; i++){
            for(int s=1; s<=10-i; s++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            // decrement of for(int e=1; e<=i-1; e++ )
            for(int e =i-1; e>=1; e--){
                System.out.print(e);
            }
            System.out.println();
        }

       // i  j  e
       // 1
        for (int i=1; i<=5; i++) {
            for (int s = 1; s <= 5 - i; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for(int e=i-1; e>=1; e--){
                System.out.print("*");
            }

            System.out.println();
        }

    }

}

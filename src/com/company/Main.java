package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int a = 115;
        int b = 114;
        int c = 112;
        int d = 231;
        int e = 121;
        int f = 154;


        if (b > a) {
            System.out.println("b");
        }
        if(d>b){
            System.out.println("B is Greater then D");
            System.out.println("------------------------------------------------------------");
            for (int i=a; a<125 ; a++){
                System.out.println(a);
                System.out.println("Daval saheb");
                for (int j = b; b<a;) {
                    System.out.println("azeer");
                    b++;

                }
            }
            System.out.println("------------------------------------------------------------");
        }
        if(e<a){
            System.out.println("f is greater then e");
        }
        else{
            System.out.println(a+b);
        }
        System.out.print(a*b+c/d*e+f+384762.0987);
    }
}
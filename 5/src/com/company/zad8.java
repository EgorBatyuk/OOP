package com.company;

import java.util.Scanner;

public class zad8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        int x4 = num / 1000;
        int x3 = num % 1000/100;
        int x2 = num % 100/10;
        int x1 = num % 10;

            System.out.println((x3*1000) + (x2*100) + (x1*10) + (x4));


    }
}

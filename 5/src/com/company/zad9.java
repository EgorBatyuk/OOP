package com.company;

import java.util.Scanner;

public class zad9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        int x4 = num / 1000;
        int x3 = num % 1000/100;
        int x2 = num % 100/10;
        int x1 = num % 10;

        System.out.println((x1*1000) + (x4*100) + (x3*10) + (x2));
    }
}

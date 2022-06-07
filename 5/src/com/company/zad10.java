package com.company;

import java.util.Scanner;

public class zad10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt(), num_1 = in.nextInt();
        //System.out.println(num);

        int x1 = num % 10;
        num = num / 10;
        int x2 = num_1 % 10;
        num_1 = num_1 / 10;

        System.out.println(num*10 + x2);
        System.out.println(num_1*10 + x1);

    }
}

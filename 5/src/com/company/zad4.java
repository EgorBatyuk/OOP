package com.company;

import java.util.Scanner;

public class zad4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num_2 = in.nextInt(), a,b,c;
        System.out.println(num_2);

        a = num_2 % 10;
        num_2 = num_2 /10;
        b = num_2 % 10;
        num_2 = num_2 /10;
        c = num_2 % 10;
        num_2 = num_2 /10;

        System.out.println("Сумма: " + (a+c+b));

    }
}

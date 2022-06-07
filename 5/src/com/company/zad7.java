package com.company;

import java.util.Scanner;

public class zad7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        int reversed = 0;

        while(num != 0) {

            int digit = num % 10;

            reversed = reversed * 10 + digit;

            num /= 10;
        }

        System.out.println(reversed);
    }
}

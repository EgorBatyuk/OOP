package com.company;

import java.util.Scanner;

public class zad6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int count = 0, i;

        while (num != 0) {
            i = num % 10;

            if (i % 2 == 0){
                count+=1;
            }

            num /= 10;
        }

        System.out.println(count);
    }
}



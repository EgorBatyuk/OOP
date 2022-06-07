package com.company;

import java.util.Scanner;

public class zad3 {
    public static void main(String[] args) {


    Scanner in = new Scanner(System.in);
    int num = in.nextInt(), a,b,c;
    System.out.println(num);

    a = num % 10;
    num = num /10;
    b = num % 10;
    num = num /10;
    c = num % 10;
    num = num /10;

    System.out.println(c*100 + "+" + b*10 + "+" + a);
}}


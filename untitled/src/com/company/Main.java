package com.company;

import java.awt.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("Zoo");

        Lion lion = new Lion(1.2f, 50, Lion.Colors.ORANGE);

        System.out.println(lion.getWeight());
        System.out.println(lion.getColor());
    }
}

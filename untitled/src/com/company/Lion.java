package com.company;

import java.awt.*;

public class Lion {
    public float height;

    public float getHeight() {
        return height;
    }

    public float getWeight() {
        return weight;
    }

    public float weight;

    public Colors getColor() {
        return color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }

    public Colors color;

    public enum Colors {RED, ORANGE, WHITE};

    Lion(float height, float weight, Colors color) {
        this.height = height;
        this.weight = weight;
        this.color = color;
    }

    private void growe(){
        System.out.println("RRR");
    }

    private void eat(float food) {
        weight += food;
    }
}

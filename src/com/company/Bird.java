package com.company;
import static java.lang.System.out;

public class Bird {

    private String name;
    private String color;
    private int size;

    public Bird(String name, String color, int size) {
        this.name = name;
        this.color = color;
        this.size = size;
    }

    public void fly() {
        out.println("Bird is flying");
    };

    public void eat() {
        out.println("Bird is eating");
    }

    public String toString() {
        return "name: " +this.name + " color: " + this.color + " weight: " + this.size;
    }
}

package com.company;
import static java.lang.System.out;

public class Duck implements Drawable, Countable{

    private String name;
    private String color;
    private int size;

    public Duck(String name, String color, int size){
        this.name = name;
        this.color = color;
        this.size = size;

    }

    public void fly() {
        out.println("Duck is flying");
    };

    public void eat() {
        out.println("Duck is eating");
    }


    public void swim() {

        out.println("Duck is swimming");
    }
    @Override
    public void draw() {
        out.println("I drew a duck");
    }
    @Override
    public void count() {
        out.println("I have 1 duck");
    }

    public static void main(String[] args) {
        Duck myDuck = new Duck("Mallard", "green", 1);
        myDuck.fly();
        myDuck.eat();
        myDuck.swim();
        out.println(myDuck);
        myDuck.draw();
    }
}

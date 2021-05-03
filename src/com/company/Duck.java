package com.company;
import static java.lang.System.out;

public class Duck extends Bird implements Drawable, Countable{

    private String name;
    private String color;
    private int size;


    public Duck(String name, String color, int size) {
        super(name, color, size);
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
        myDuck.count();
    }
}

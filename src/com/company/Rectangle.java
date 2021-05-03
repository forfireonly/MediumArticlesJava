package com.company;
import static java.lang.System.out;
public class Rectangle implements Drawable {
    @Override
    public void draw() {
        out.println("rectangle");
    }

    public String toString() {
        return "I am a rectangle";
    }
}

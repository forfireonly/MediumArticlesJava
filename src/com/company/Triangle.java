package com.company;
import static java.lang.System.out;

public class Triangle implements Drawable {
    @Override
    public void draw() {
        out.println("triangle");
    }

    public String toString() {
        return "I am a triangle";
    }
}

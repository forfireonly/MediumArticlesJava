package com.company;
import static java.lang.System.out;

public class Circle implements Drawable {
    @Override
    public void draw() {
        //we want concern ourself with actual implementation of this method
        out.println("circle");
    }

    public String toString() {
        return "I am a circle";
    }

    public static void main(String[] args) {
        //instantiate class Circle
        Circle myCircle = new Circle();
        //reassign the refference variable my circle to refference variable type Drawable
        Drawable circleToDraw = myCircle;


        //for the next line static import was done
       // out.println(circleToDraw);

        Drawable myRectangle = new Rectangle();
       // out.println(myRectangle);

        Drawable myTriangle = new Triangle();
        //out.println();
        circleToDraw.draw();
        myRectangle.draw();
        myTriangle.draw();

    }
}

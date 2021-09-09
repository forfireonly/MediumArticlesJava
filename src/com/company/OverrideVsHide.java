package com.company;

public class OverrideVsHide {
    public int number;
    //String name;

    /*protected int returnNumber() {
        return number;
    }*/

    /*void printGreeting() {
        System.out.println("Hi");
    }*/

    /*void calculateSum(int a, int b) {
        System.out.println("result of addition is " + (a + b));
    }*/

    static void calculateSum(int a, int b) {
        System.out.println("result of addition is " + (a + b));
    }

    void printResult() {
        calculateSum(1, 1);
    }


}

class ChildClass extends OverrideVsHide {

    public static void main(String... input) {

        ChildClass example = new ChildClass();

        //inheriting instance variable
        // System.out.println("number = "  + (example.number));

        //Inheriting instance method
        //System.out.println("Result of method = " + example.returnNumber());

        //inheriting default method in the same package
        //example.printGreeting();

        //inheriting default variable in the same package
        //System.out.println(example.name);

        //calling overriden method
        //example.calculateSum(1,1);

        //method call by the method in parent
        //example.printResult();


        //calling static child method
        calculateSum(1, 1);

        //calling hiden method
        example.printResult();


        //reference variable of type Parent

        //calling overriden method


        //calling hidden method

    }

    //Overriding method calculateSum declaread in parent class
    /*void calculateSum(int a, int b) {
        System.out.println("binary result of addition is " + Integer.toBinaryString(a + b));
    }*/

    static void calculateSum(int a, int b) {
        System.out.println("binary result of addition is " + Integer.toBinaryString(a + b));
    }
}

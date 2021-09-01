package com.company;

public class OverrideVsHide {
    public int number;
    String name;

    protected int returnNumber() {
        return number;
    }

    void printGreeting() {
        System.out.println("Hi");
    }

    void calculateSum(int a, int b) {
        System.out.println("result of addition is " + (a + b));
    }

    static void personalizedGreeting(String name) {
        System.out.println(name + " loves to code");
    }
}

class ChildClass extends OverrideVsHide {

    public static void main(String... input) {
        ChildClass example = new ChildClass();

        //inheriting instance variable
        System.out.println("number = "  + (example.number));

        //Inheriting instance method
        System.out.println("Result of method = " + example.returnNumber());

        //inheriting default method in the same package
        example.printGreeting();

        //inheriting default variable in the same package
        System.out.println(example.name);

        //calling overriden method
        example.calculateSum(1,1);



        //calling static parent method
       OverrideVsHide.personalizedGreeting("Anna");

        //calling hiden method
        personalizedGreeting("Anna");

        //reference variable of type Parent
        OverrideVsHide ref = example;

        //calling overriden method
        ref.calculateSum(1,1);

        //calling hidden method
        ref.personalizedGreeting("Anna");
        example.personalizedGreeting("Anna");



    }

    //Overriding method calculateSum declaread in parent class
    void calculateSum(int a, int b) {
        System.out.println("binary result of addition is " + Integer.toBinaryString(a + b));
    }

    //hiding the static parent method
    static void personalizedGreeting(String name) {
        System.out.println(name + " loves JAVA");
    }
}

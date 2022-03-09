package com.company;

public class SwitchStatement {

    public static void main(String... input){
        //String name = "Anna";
        final String name = "Anna";

        switch("Anna"){
            case "Boris":
                System.out.println("My name is " + name);
                break;
            case name:
                System.out.println("My name is " + name);
            case "John":
                System.out.println("I like JAVA!!!");
            case "Mary":
                System.out.println("Eat, sleep, code, repeat");
                break;
            case "5":
                System.out.println();
            default:
        }
    }
}

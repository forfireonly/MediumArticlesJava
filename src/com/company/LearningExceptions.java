package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class LearningExceptions {
    //method with infinite recursion
   /* static int fact(int n) {
        return n*fact(n-1);
    }
//catching stack overflow error
/*    public static void main(String... input) throws Error {
       try {
           String str = "Don't do this";
           System.out.println(str);
           fact(10);
           } catch (StackOverflowError e) {
           System.out.println("Yikes!");
       }
    }*/

    //catching IOException
    /*public static void main(String... input) {
        File file = new File("file");
        try {
            Scanner scn = new Scanner(file);
            String str = scn.nextLine();
        } catch (FileNotFoundException e) {
            System.out.println("There is no such file");
        }
    }*/

    //unchecked exception
    /*public static void main(String... input) {
        int a = 1;
        int b = 0;
       // try {
            int result = a / b;
        /*} catch (ArithmeticException e) {
            System.out.println("Please, no division by zero");
        }
    }*/
    //throw and catch error
   /* public static void main(String... input) {
        //try {
            throw new StackOverflowError();
        /*} catch (StackOverflowError e) {
            System.out.println("Throwing and catching errors pragramatically is not a good idea!");
        }
    }*/

    //throw and catch checked exception
   /* public static void main (String[] args) {
        //try {
            throw new IOException();
       /* } catch (IOException e) {
            System.out.println("I caught a checked exception");
        }
    }*/
//unchecked IllegalArgumentException

public static void main(String[] args) {
    int n = - 2;
    try {
      if (n < 0)  throw new IllegalArgumentException();
      System.out.println(n);
    } catch (IllegalArgumentException e) {
        System.out.println("n can't be negative");
    }
}
    //throwing unchecked number format excepton

    /*public static void main(String... input) {
        String numberString = "2";
        int number;
        try {
            number = Integer.parseInt(numberString);
            System.out.println(number);

        } catch (NumberFormatException e)  {
            System.out.println("We can not convert this string to integer" );
        }
    }*/
}

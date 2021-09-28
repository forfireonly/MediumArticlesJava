package Operators;

public class IncrementDecrementOperators {
    public static void main(String... args) {
        int x = 0;

        System.out.println("Workings of ++ ");
        System.out.println("We start with x=" + x);
        //when ++ placed before increases the value bu 1 right away
        System.out.println("++x=" + ++x);
        //the previous value retained until the execution of current statement, inceases by 1 for the next
        System.out.println("x++=" + x++);
        System.out.println("next statement x=" + x + "\n");

        x = 1;
        System.out.println("We start with x=" + x );
        System.out.println("Workings of -- ");
        //when -- placed before decreses the value bu 1 right away
        System.out.println("--x=" + --x);
        //the previous value retained until the execution of current statement,decreases by 1 for the next
        System.out.println("x--=" + x++);
        System.out.println("next statement x=" + x);
    }
}

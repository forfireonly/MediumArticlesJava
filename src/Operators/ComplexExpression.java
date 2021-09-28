package Operators;

public class ComplexExpression {
    public static void main(String... args){

        int x = 1;
        int y = ++x  + ++x * 5 / x-- + --x + ++x;

        System.out.println("x=" + x);
        System.out.println("y=" + y);

        x = 1;
        y = ++x  + ++x * 5 / x-- + x-- + ++x;

        System.out.println("x=" + x);
        System.out.println("y=" + y);

    }
}

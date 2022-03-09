package LogicalOperators;

public class Logic {

    public static void main(String... input) {
        int a = 1;
        int b = 2;
        System.out.println((b > 1) | (++a > 1));
        System.out.println(a);
        System.out.println(a&b);

    }
}

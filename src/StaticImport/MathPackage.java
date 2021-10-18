package StaticImport;

import static java.lang.Math.max;
import static java.lang.System.out;

public class MathPackage {
    public static void main(String... input) {

        int val1 = 10;
        int val2 = 100;

        int maxValue = max(val1, val2);

        out.println("Greater value is " + maxValue);
    }
}

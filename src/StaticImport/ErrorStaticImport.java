package StaticImport;

//import java.util.Arrays;

import static java.util.Arrays.asList;

public class ErrorStaticImport {

    public static void main(String... input) {
        int[] arr = {1,2,3};
        Arrays.asList("one");
    }
}

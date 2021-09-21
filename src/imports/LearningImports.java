package imports;

//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.HashSet;
import java.util.*;
import java.lang.*;

public class LearningImports {
    public static void main(String... input) {
        NoNeedToImport obj = new NoNeedToImport();
        System.out.println("Hi " + obj.name);
    }
}

class NoNeedToImport{
    String name = "Anna";
}

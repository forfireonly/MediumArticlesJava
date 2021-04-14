import java.util.ArrayList;
import java.util.HashMap;

public class HashMapArrayListasValue {
    //using procedural programming approach
    public static void main(String[] args) {

        //declaring a HashMap with an ArrayLists as values
        HashMap<String, ArrayList<String>> schoolSupplies = new HashMap<>();

        //declaring and initializing ArrayLists to be added to HashMap
        ArrayList<String> mathClass = new ArrayList<>();
        mathClass.add("ruler");
        mathClass.add("protractor");
        mathClass.add("calculator");

        ArrayList<String> languageClass = new ArrayList<>();
        languageClass.add("notebook");
        languageClass.add("pencil");

        ArrayList<String> physicalEducation = new ArrayList<>();
        physicalEducation.add("physical eduaction uniform");

        //putting ArraysLists into HashMap
        schoolSupplies.put("Math", mathClass);
        schoolSupplies.put("Language", languageClass);
        schoolSupplies.put("Physical Education", physicalEducation);

        System.out.println("School Supplies for the Next Year:\n");

        // printing members of ArrayLists where Array Lists are values the corresponding keys of HashMap
        for (String key : schoolSupplies.keySet()) {
            System.out.println(key + ":");

            for (String item : schoolSupplies.get(key)) {
                System.out.println(item );
            }
            System.out.println("\n");
        }

    }
}

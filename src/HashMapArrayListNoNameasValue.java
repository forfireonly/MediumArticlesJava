import java.util.ArrayList;
import java.util.HashMap;

public class HashMapArrayListNoNameasValue {
    public static void main(String[] args) {
        //declare HashMap
        HashMap<String, ArrayList<String>> schoolSupplies = new HashMap<>();

        //initialization of HashMap with empty ArrayLists as values

        schoolSupplies.put("Math", new ArrayList<>());
        schoolSupplies.put("Language Arts", new ArrayList<>());
        schoolSupplies.put("Physical Education", new ArrayList<>());

        //populating ArrayLists
        schoolSupplies.get("Math").add("ruler");
        schoolSupplies.get("Math").add("protractor");
        schoolSupplies.get("Math").add("calculator");

        schoolSupplies.get("Language Arts").add("notebook");
        schoolSupplies.get("Language Arts").add("pencil");

        schoolSupplies.get("Physical Education").add("pencil");

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

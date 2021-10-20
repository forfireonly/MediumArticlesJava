package passbyvalue;

public class StringPassByValue {
    public static void main(String... input) {

        String name = "Anna";
        System.out.println("name before - " + name);
        changeName(name);
        System.out.println("name after - " + name);
    }

    static void changeName(String someName) {
        someName = "Wayne";
    }
}


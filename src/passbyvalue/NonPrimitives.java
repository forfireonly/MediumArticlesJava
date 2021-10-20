package passbyvalue;

public class NonPrimitives {
    public static void main(String... input) {
        Person person = new Person("Anna");
        System.out.println("name of person " + person.name);
        changeName(person);
        System.out.println("name of person " + person.name);
    }
    static void changeName(Person somePerson) {
        somePerson.name = "Wayne";
    }
}

class Person{
    String name;
    Person (String name) {
        this.name = name;
    }
}

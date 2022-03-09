package attraction.zoo;
import static java.lang.System.out;

public class Human {
    void watchAnimal(){
        Animal animal = new Animal();
        animal.printType();
        out.println(animal.text);
    }
}



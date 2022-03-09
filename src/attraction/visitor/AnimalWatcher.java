package attraction.visitor;

import attraction.zoo.Animal;
import static java.lang.System.out;

public class AnimalWatcher {
    void watchAnimal() {
        Animal animal = new Animal();
        animal.printType();        //does not compile
        out.println(animal.text);  //does not compile
    }
}

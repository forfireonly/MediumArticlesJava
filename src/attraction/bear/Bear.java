package attraction.bear;

import attraction.zoo.Animal;
import static java.lang.System.out;

public class Bear extends Animal {
    void printInfo() {
        printType();
        out.println(text);
    }

    void printInfoBear() {
        Bear bear = new Bear();
        bear.printType();
        out.println(bear.text);
    }

    void printInfoAnimal() {
        Animal animal = new Animal();
        animal.printType();           //does not compile
        out.println(animal.text);     //deas not compile
    }
}

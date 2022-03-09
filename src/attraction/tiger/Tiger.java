package attraction.tiger;

import attraction.zoo.Animal;
import static java.lang.System.out;
public class Tiger extends Animal {
    void printInfo() {
        printType();
        out.print(text);
    }

    public static void main(String... input) {
        Tiger tgr =  new Tiger();
        tgr.printInfo();
    }
}

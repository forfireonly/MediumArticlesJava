import static java.lang.System.out;
import java.util.ArrayList;
public class Man extends Object {

    //instance variables
    private int numberOfLegs;
    private String colorOfCoat;
    private boolean hasArms;

    //constructor
    public Man(int numberOfLegs, String colorOfCoat, boolean hasArms) {
        this.numberOfLegs = numberOfLegs;
        this.colorOfCoat = colorOfCoat;
        this.hasArms = hasArms;
    }


    public String toString() {
        String arms = this.hasArms ? "I have arms, " : "I don't have arms, ";
        String legs = (this.numberOfLegs >= 2 ? " legs, " : " leg, ");
        String jacket = "My coat is " + this.colorOfCoat;
        return this.numberOfLegs + legs + arms  + jacket;
    }


    public void eat(double money){
        if (money > 4) {
            out.println("I will have a big Mac");
        }
    }



    public static void main(String[] args) {

        Man manOfMyDreams = new Man(2, "red", true);
        out.println("I am a man, I have " + manOfMyDreams);

        Fox fox = new Fox(4, "red", false, "bushy");
        out.println("I am a fox, " + fox);
       // out.println("I am a fox, I have " + fox);

        manOfMyDreams.eat(6);

        fox.eat(true);
        fox.eat("something", 2);

        //declare an ArrayList of objects in GIF
        ArrayList<Man> gifObjects = new ArrayList<>();

        //initializing an ArrayList
        gifObjects.add(manOfMyDreams);
        gifObjects.add(fox);

        for(Man entry: gifObjects) {
            out.println(entry);
        }

        //Instantiating the class Fox
        /*Fox fox = new Fox(4, "red", false, "bushy");
        // reassign object to different type varables
        Man manFox = fox;
        Object objectFox = fox;

        out.println(fox);
        out.println(manFox);
        out.println(objectFox);*/

    }
}

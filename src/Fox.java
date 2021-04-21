import static java.lang.System.out;
public class Fox extends Man {
    private String tail;

    //constructor
    public Fox(int numberOfLegs, String colorOfCoat, boolean hasArms, String tail) {
        super(numberOfLegs, colorOfCoat, hasArms);
        this.tail = tail;
    }

    public String toString() {
        return super.toString() + " My tail is " + this.tail;
    }

    public void eat(Boolean isHungry) {
        out.println( isHungry ? "I will hunt" : "I will sleep");
    }

    public void eat(String food, int hours) {
        out.println("I will catch " + food + " It will last me " + hours + " hours");
    }
}

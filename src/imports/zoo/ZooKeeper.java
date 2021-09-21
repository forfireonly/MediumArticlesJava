package imports.zoo;

//import imports.carnivour.Food;
//import imports.herbivore.Food;
import imports.omnivore.Food;

public class ZooKeeper {
    imports.carnivour.Food foodForCarnivour;
    imports.herbivore.Food foodForHerbivore;
    Food foodForOmnivore;

    public void eat() {
        foodForCarnivour  = new imports.carnivour.Food();
        System.out.println("Carnivour eats meat: " + foodForCarnivour.meat);
        foodForHerbivore = new imports.herbivore.Food();
        System.out.println("Herbivore eats meat: " + foodForHerbivore.meat);
        foodForOmnivore = new Food();
        System.out.println("Omnivore eats meat: " + foodForOmnivore.meat);
    }

    public static void main(String... input) {
        ZooKeeper me = new ZooKeeper();
        me.eat();
    }

}

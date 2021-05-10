package com.company;

public class NewDuck {
    private Movable babyDuck;

    public NewDuck(Movable babyDuck) {
        this.babyDuck = babyDuck;
    }
    public void move() {
        babyDuck.fly();
        babyDuck.swim();
    }

    public static void main(String[] args) {
        Movable hatchling = new GrownDuck();
        NewDuck myDuck = new NewDuck(hatchling);
        myDuck.move();
    }
}

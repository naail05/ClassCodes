package day34_abstraction.animalTask;

public class Duck extends Animal implements Playable, Flyable, Swim{
    public Duck(String name, String breed, char gender, String size, String color, int age) {
        super(name, breed, gender, size, color, age);
    }

    @Override
    public void eat() {
        System.out.println("Duck "+ getName()+" is eating worm");
    }

    @Override
    public void play() {
        System.out.println("Duck "+getName()+" enjoys playing in the water");
    }

    @Override
    public void fly() {
        System.out.println("Duck "+ getName()+ " can fly well");
    }

    @Override
    public void swim() {
        System.out.println("Duck "+ getName()+ " enjoys swimming in the river");
    }
}

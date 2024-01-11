package day34_abstraction.animalTask;

public class Parrot extends Animal implements Playable, Flyable{
    public Parrot(String name, String breed, char gender, String size, String color, int age) {
        super(name, breed, gender, size, color, age);
    }

    @Override
    public void eat() {
        System.out.println("Parrot "+getName()+" is eating seeds");
    }

    @Override
    public void play() {
        System.out.println("Parrot "+ getName()+" likes to play with kids");
    }

    @Override
    public void fly() {
        System.out.println("Parrot "+ getName()+ "enjoys flying around the house");
    }
}

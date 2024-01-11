package day34_abstraction.animalTask;

public class Dolphin extends Animal implements Playable, Swim{

    public Dolphin(String name, String breed, char gender, String size, String color, int age) {
        super(name, breed, gender, size, color, age);
    }

    @Override
    public void eat() {
        System.out.println("Dolphin "+getName()+ " is eating fish food");
    }


    @Override
    public void play() {
        System.out.println("Dolphin "+ getName()+" loves to play with humans");
    }

    @Override
    public void swim() {
        System.out.println("Dolphin "+ getName()+ " enjoy swimming in the zoo pool");
    }
}

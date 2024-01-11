package day34_abstraction.animalTask;

public class Cat extends Animal implements Playable{

    public Cat(String name, String breed, char gender, String size, String color, int age) {
        super(name, breed, gender, size, color, age);
    }

    @Override
    public void eat() {
        System.out.println("Cat "+ getName()+" is eating cat food");
    }

    @Override
    public void play() {
        System.out.println("Cat "+getName()+" enjoys playing with ball");
    }
}

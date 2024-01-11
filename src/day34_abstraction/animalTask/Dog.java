package day34_abstraction.animalTask;

public class Dog extends Animal implements Playable{

    public Dog(String name, String breed, char gender, String size, String color, int age) {
        super(name, breed, gender, size, color, age);
    }

    @Override
    public void eat() {
        System.out.println("Dog "+getName()+" is eating dog food");
    }

    @Override
    public void play() {//when we implement the interface, then we have to override the given method of the interface here
        System.out.println("Dog "+getName()+" likes to play with the stick");

    }
}

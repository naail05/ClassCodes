package day34_abstraction.animalTask;

public class Shark extends Animal implements Hunt, Swim{
    public Shark(String name, String breed, char gender, String size, String color, int age) {
        super(name, breed, gender, size, color, age);
    }

    @Override
    public void eat() {
        System.out.println("Shark "+ getName()+ " is eating fish");
    }

    @Override
    public void hunt() {
        System.out.println("Shark "+ getName()+ " hunts fishes");
    }

    @Override
    public void swim() {
        System.out.println("Shark "+ getName()+ " can swim long distances");
    }
}

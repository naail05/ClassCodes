package day34_abstraction.animalTask;

public class Eagle extends Animal implements Flyable, Hunt{
    public Eagle(String name, String breed, char gender, String size, String color, int age) {
        super(name, breed, gender, size, color, age);
    }

    @Override
    public void eat() {
        System.out.println("Eagle "+ getName()+" is eating snake");
    }

    @Override
    public void fly() {
        System.out.println("Eagle "+ getName()+ " flies high in the sky while looking for hunt");
    }

    @Override
    public void hunt() {
        System.out.println("Eagle "+ getName()+ " is good at hunting rabbits");
    }
}

package day34_abstraction.animalTask;

public class Tiger extends Animal implements Hunt{
    public Tiger(String name, String breed, char gender, String size, String color, int age) {
        super(name, breed, gender, size, color, age);
    }

    @Override
    public void eat() {
        System.out.println("Tiger "+ getName()+ " is eating buffalo");
    }

    @Override
    public void hunt() {
        System.out.println("Tiger "+ getName()+" hunts while is hungry");
    }
}

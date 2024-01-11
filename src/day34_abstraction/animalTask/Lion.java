package day34_abstraction.animalTask;

public class Lion extends Animal implements Hunt {
    public Lion(String name, String breed, char gender, String size, String color, int age) {
        super(name, breed, gender, size, color, age);
    }

    @Override
    public void eat() {
        System.out.println("Lion "+getName()+ " is eating deer");
    }

    @Override
    public void hunt() {
        System.out.println("Loin "+getName()+" hunts deer");
    }
}

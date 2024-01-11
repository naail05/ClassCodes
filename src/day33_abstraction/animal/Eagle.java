package day33_abstraction.animal;

public class Eagle extends Animal {


    public Eagle(String name, String breed, char gender, String size, String color, int age) {
        super(name, breed, gender, size, color, age);
    }

    @Override
    public void eat() {
        System.out.println("Eagle "+getName()+" is eating snake");
    }

    @Override
    public void sleep() {
        System.out.println("Eagle "+getName()+ " sleeps 6 hours a day");
    }
}

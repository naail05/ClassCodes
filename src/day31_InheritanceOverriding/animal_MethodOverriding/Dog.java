package day31_InheritanceOverriding.animal_MethodOverriding;

public class Dog extends Animal{


    public Dog(String name, String breed, char gender, String size, String color, int age) {
        super(name, breed, gender, size, color, age);
    }

    public void eat(){
        System.out.println("Dog "+ getName()+" eats dog food");
    }

    public void sleep(){
        System.out.println("Dog "+ getName()+" sleeps 8 hours a day");
    }

    public void bark (){
        System.out.println("Dog "+getName()+ " is barking every morning");
    }
}

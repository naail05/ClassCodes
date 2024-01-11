package day33_abstraction.animal;

public class Cat extends Animal {


    public Cat(String name, String breed, char gender, String size, String color, int age) {
        super(name, breed, gender, size, color, age);
    }
   @Override//if this annotation does not give compile error then means this is an override method
    public void eat(){
        System.out.println("Cat " +getName()+" is eating cat food");
        // originally this method is from animal class, we just overrode it here, by giving it a different implementation
    }

    @Override
    public void sleep() {// we overrode this method
        System.out.println("Cat "+getName()+ " sleeps 12 hours in a day");
    }

    public void scratch(){
        System.out.println("Cat "+ getName()+" is scratching");
    }// method specific/unique to cat class
}

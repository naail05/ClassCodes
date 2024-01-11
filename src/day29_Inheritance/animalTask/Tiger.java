package day29_Inheritance.animalTask;

public class Tiger extends Animal{

    // this is how the Tiger class will inherit all the common attributes and method of the Animal class, creating parent(Animal) child (Tiger) relationship 0R is-a relationship

    // now we need to define the attributes/variables and methods which are specific/unique to the child/sub-class

    public void hunt(){

        System.out.println(getName() +" is hunting the pray");
    }

    public static class Zoo {
    }
}

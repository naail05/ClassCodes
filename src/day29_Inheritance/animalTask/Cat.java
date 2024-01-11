package day29_Inheritance.animalTask;

public class Cat extends Animal {
    // this is how the Cat class will inherit all the common attributes and method of the Animal class, creating parent(Animal) child (Cat) relationship 0R is-a relationship

    // now we need to define the attributes and methods which are specific to the child/sub-class

    public void meow (){
        System.out.println( getName()+ " is meowing");
    }

    public void scratch (){
        System.out.println(getName() + " is scratching");
    }


}

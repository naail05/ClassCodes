package day29_Inheritance.animalTask;

public class Dog extends Animal {
    // this is how the dog class will inherit all the common attributes and method of the Animal class, creating parent(Animal) child (Dog) relationship 0R is-a relationship

    public void method (){//calling instance variables in the instance method

        /*

        System.out.println(name);
        System.out.println(breed);
        System.out.println(gender);
        System.out.println(age);
        System.out.println(size);
        System.out.println(color);
        System.out.println(isAnimal);
        // trying to confirm if the Dog class has all those attributes and methods

        setInfo();
        eat();
        sleep();
        toString();

        */
    }

    // now we need to define the attributes and methods which are specific to the child/sub-class

    public void bark(){
        System.out.println(getName() + " is barking");
    }






}
/*

in total 7 variables and 5 methods are inherited from the parent class and we do not need to declare them again here.
 */
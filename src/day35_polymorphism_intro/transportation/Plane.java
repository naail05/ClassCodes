package day35_polymorphism_intro.transportation;

import day34_abstraction.animalTask.Flyable;

import javax.management.ConstructorParameters;

public abstract class Plane extends Transportation implements Flyable {


    public Plane(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    public void land(){
        System.out.println("Plane "+getMake()+" "+getModel()+" is lading");

    }
}
/*
 Create an abstract sub class of Transportation named Plane that implements Flyable

				non-abstract method:
					land()
 */
package day34_abstraction;

import day34_abstraction.animalTask.Flyable;

public class Airplane implements Flyable {
    @Override
    public void fly() {
        System.out.println(" Airplane flies high in the sky");
    }

    // here airplane is not a sub-class of animal but still can implement the flyable interface( so whatever methods and variables are there, this airplane class can inherit
}

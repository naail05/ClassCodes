package day34_abstraction;

import day34_abstraction.animalTask.Playable;
import day34_abstraction.animalTask.Swim;

public class Person implements Playable, Swim {
    @Override
    public void play() {
        System.out.println("Enjoys playing with kids");
    }

    @Override
    public void swim() {

    }

    // here Person is not a sub-class of animal but still can implement the Swim and playable interfaces( so whatever methods and variables are there, this person class can inherit
}

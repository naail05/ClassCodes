package day34_abstraction.animalTask;

public interface Playable {

    // the only type of variables we can create are static and final
    boolean isFriendly = true;// as we can not have constructor and static block so we have to initialize and set it here

    // static and default methods are optional, but interface should have abstract method
    void play(); //here in interface we do not need to give the access modifier "public" abd "abstract" keywords as they are given by default
}

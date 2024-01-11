package day35_polymorphism_intro.polymorphism_intro;

import day34_abstraction.animalTask.*;

public class PolymorphismPractice {

    public static void main(String[] args) {


    Tiger tiger2 = new Tiger("Tiger", "Bengal", 'M', "Large", "Orange and Black", 4);
    tiger2.eat();
    tiger2.hunt();
    tiger2.sleep();
    tiger2.drink();//as the reference type is Tiger, no polymorphism, so we cam call all these methods

        Animal tiger1 = new Tiger("Tiger", "Bengal", 'M', "Large", "Orange and Black", 4);
        tiger1.eat();
        tiger1.sleep();
        tiger1.drink();
      //  tiger1.hunt(); we can not call this method as it is not from animal class, it is from Tiger class, so can not be called

        Animal eagle1 = new Eagle("Eddie", "Golden", 'M', "Medium", "Brown", 2);
        eagle1.sleep();
        eagle1.drink();
        eagle1.eat();
        //eagle.fly();we can not call this method as it is not from animal class, it is from Eagle class, so can not be called

        System.out.println("-------------------------------------------------");

        Dog dog = new Dog("Max","Husky", 'M', "Small", "White",4 );

        Cat cat = new Cat("Lucy","Asian", 'F', "Small", "White",2 );

        Tiger tiger = new Tiger("Tigger", "Bengal", 'M', "Large", "Orange and Black", 4);
        Eagle eagle = new Eagle("Eddie", "Golden", 'M', "Medium", "Brown", 2);
        Lion lion = new Lion("Leo", "African", 'M', "Large", "Brown", 4);
        Parrot parrot = new Parrot("Polly", "Amazon", 'F', "Small", "Green", 2);

        Shark shark = new Shark("Sharky", "Great White", 'M', "Medium", "Gray", 12);
        Dolphin dolphin = new Dolphin("Dolly", "Bottlenose", 'M', "Medium", "Gray", 8);

        Flyable[] birds = {parrot, eagle};//there is a relationship,so we can store
        Swim[] fishes = {shark, dolphin};//there is a relationship,so we can store
        Playable[] friendly = {dog, cat};

        boolean isAnimal =cat instanceof Animal;
        System.out.println(isAnimal);//The instanceof operator in Java is used to test if an object is an instance of a particular class or interface




}}

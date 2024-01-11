package day35_polymorphism_intro.polymorphism_intro;

import day33_abstraction.employeeTask.*;
import day34_abstraction.animalTask.*;
import day34_abstraction.carTask.Audi;
import day34_abstraction.carTask.Car;
import day34_abstraction.carTask.Honda;
import day34_abstraction.carTask.Tesla;

import java.util.Arrays;

public class PolymorphismIntro {

    public static void main(String[] args) {



    Dog dog = new Dog("Max","Husky", 'M', "Small", "White",4 );

    Cat cat = new Cat("Lucy","Asian", 'F', "Small", "White",2 );

    Tiger tiger = new Tiger("Tigger", "Bengal", 'M', "Large", "Orange and Black", 4);
    Eagle eagle = new Eagle("Eddie", "Golden", 'M', "Medium", "Brown", 2);
    Lion lion = new Lion("Leo", "African", 'M', "Large", "Brown", 4);
    Parrot parrot = new Parrot("Polly", "Amazon", 'F', "Small", "Green", 2);

    Shark shark = new Shark("Sharky", "Great White", 'M', "Medium", "Gray", 12);
    Dolphin dolphin = new Dolphin("Dolly", "Bottlenose", 'M', "Medium", "Gray", 8);


       // Dog [] animals = {dog,cat, tiger, eagle, lion,parrot,dolphin,shark};
        //this array doesnt not accept other objects, as they are not of Dog type or there is no is a relationship

        // all the above objects has 'is a relationship' with Animal class

        Animal [] animals = {dog,cat, tiger, eagle, lion,parrot,dolphin,shark};
        //as they all are the child class of Animal and they have 'is a relationship' so it will not give compile error

        Animal animal = new Dog("Max","Husky", 'M', "Small", "White",4 );
        animal.eat();
        animal.drink();
        animal.sleep();//as these are methods in Animal class, so we can call them here
        //animal.play():
        //animal.bark(): these are the methods of dog class, not animal class, so we can not call them in this case


        System.out.println("-------------------------------------------------");
        String str= "Java";
        Integer n = 100;
        Boolean r = false;
        Double d = 10.5;

        Honda hondaCar = new Honda("Accord", "Gray", 2020, 25000.0);
        Audi audiCar = new Audi("Q6", "Black", 2023, 40000.0);
        Tesla teslaCar = new Tesla("Model S", "White", 2023, 80000.0);

        Teacher teacher = new Teacher("Maryam", 8, 'F', "A214", "Math teacher", 120000);

        Developer developer = new Developer("Nazir", 6, 'M', "A231", "Develover", 125000,"Java");

        Driver driver = new Driver("Aaron", 36, 'M', "AC24", "Driver", 67000);

        Tester tester = new Tester("Naail", 36, 'M', "AB2343", "QA", 121000);

        //here we have different objects from different categories, now how can we apply polymorphism here to create a reference type that can reference to all
        Object[] objects = {str, n, r, d, hondaCar,audiCar, teslaCar, teacher, tester, developer, driver };// we can store all in this object array, as object is the parent class of all the classes, but this can only be used when we want the objects of different type under same reference, while in cases where objects could be of same category, then we need to used that given category type as reference for example, teacher, developer, driver and tester are all related to employee class, which has is a relationship.

        Employee[] employees = {teacher, tester, developer, driver};
        Employee employee = new Tester("Naail", 36, 'M', "AB2343", "QA", 121000);
        employee.work();// this method's implementation will based on the object type, the overridden one

        System.out.println("----------------------------------------------------");
        Tesla car1 = new Tesla("Model Y", "White", 2020, 55000);//no polymorphism till now
        car1.start();
        car1.autoPilot();
        //now if we reference to the Car class instead of Tesla then
        Car car11 = new Tesla("Model Y", "White", 2020, 55000);//no polymorphism till now
        car1.start();
        //car1.autoPilot(); we can not call this as it is related to tesla not car type



        System.out.println(Arrays.toString(objects));
}}

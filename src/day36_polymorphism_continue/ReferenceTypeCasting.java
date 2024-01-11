package day36_polymorphism_continue;

import day29_Inheritance.animalTask.Animal;
import day29_Inheritance.animalTask.Cat;
import day29_Inheritance.animalTask.Dog;
import day30_InheritanceContinue.phone.IPhone;
import day30_InheritanceContinue.phone.Nokia;
import day30_InheritanceContinue.phone.Phone;
import day33_abstraction.employeeTask.Developer;
import day33_abstraction.employeeTask.Employee;

public class ReferenceTypeCasting {

    public static void main(String[] args) {
        Dog dog = new Dog();

        //Cat cat = new Dog(); will get compile error as there is no is a relationship
        Animal animal = new Dog();// upcasting, done implicitly

        System.out.println("---------------------------DownCasting---------------------------");

        Animal animal1 = new Dog();
        animal1.setInfo("Max", "Husky", 'M', "Medium", "White", 4);
        //it is upCasting

        animal1.drink();
        animal1.eat();
        animal1.sleep();// all these methods are available in Animal class, so we can call them

       // animal1.bark(); we can not call this method which is unique to dog class, due to being referenced to Parent class Animal, so in order to be able to call the mentioned method, we need to do downCasting
        //there are two options for downCasting, assigning to a variable, or calling a mentioned method or variable of the object type just once

        ((Dog)animal1).bark();// here we are casting animal reference type to Dog

        //or create reference type and assign to a variable

        Dog dog1 = (Dog) animal1;
        dog1.bark();// no new object is created here, just downCasting is done and can be reused
        //but before downCasting we have to pay attention to "is a" relationship, else we will get classCast exception

       // ((Cat) animal1).meow();//here we are doing casting manually, now that there is no is a relationship between cat and dog objects, so we will get classCast exception

        System.out.println("-------------------------------------------------------------------");

        Phone phones= new Nokia("G10", "Medium", 99, "Black");
        phones.call(97828244874l);
        phones.text(37647236473l);
        //phones.selfDefence(); we can not call this method as it is unique to Nokia object class, so in order to call it we need to do downCasting
        ((Nokia) phones).selfDefence();//now we casted it(downCasting)

       // ((IPhone)phones).facetime(23445832l);//is this casting going to work? as it is not giving any error? now that there is no "is a " relationship between iphone and Nokia, so it will return us "ClassCast Exception" as Nokia can not be converted to Iphone

        System.out.println("-------------------------------------------------------------------");

        Employee employee = new Developer("Nazir", 6, 'M', "A231", "Developer", 125000,"Java");
        System.out.println("Programming Language = " + ((Developer) employee).getProgrammingLanguage());
        //here we did dowCasting to be able to access the unique method of developer object (which is programming language in this case), as without downCasting we were not able to access this unique method through the super class which was reference in this case


    }
}

package day32_finalKeyword.personTask;

import java.time.LocalDate;

public class Person {// as this will be a parent, so we should not make it final
    private String name;
    private final char gender;//so not to be changed

    private final LocalDate dateOfBirth;

    public static final int numberOfHead;
    private final int age;

    static {
        numberOfHead = 1;
    }

    public Person(String name, char gender,  LocalDate dateOfBirth) {
        setName(name);
        if(!(gender=='M' || gender=='F')){
            System.err.println("Invalid gender: "+ gender);
            System.exit(1);
        }// as we do not have setter for gender, so if we have any condition, we can set it here in the constructor
        this.gender = gender;


        this.dateOfBirth = dateOfBirth;
        this.age = LocalDate.now().getYear()-dateOfBirth.getYear();
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
//we are not able to generate setters for others as they are not changeable, if we try to generate them manually it will give us compile error.
    public void setName(String name) {
        this.name = name;
    }

    //now making the methods for the class

    public void eat(){
        System.out.println(name+" is eating");
    }

    public void drink(){
        System.out.println(name+" is drinking");
    }

    public void sleep(){
        System.out.println(name+ " is sleeping ");
    }

    public final void breath(){
        System.out.println(name+ " is breathing");
    }// we want this implementation to be same for all the objects (sub-classes), that is why we applied the final keyword here

    @Override
    public String toString() {
        return getClass().getSimpleName()+ "{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
/*
variables:
     name, gender, age, dateOfBirth
     (static) numberOfHead

 methods:
     eat(food), drink(), sleep()
     breath()//we want it not to be overridden
 */
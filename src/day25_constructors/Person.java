package day25_constructors;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Person {

 public  String name;
 public int age;
 public char gender;
 public LocalDate dateOfBirth;
 public boolean isMarried , isEmployed;

    public Person(String name, char gender, LocalDate dateOfBirth, boolean isMarried, boolean isEmployed) {
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.isMarried = isMarried;
        this.isEmployed = isEmployed;
        calculateAge();

    }

    public void calculateAge(){

        int age = LocalDate.now().getYear()-dateOfBirth.getYear();
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", dateOfBirthday=" + dateOfBirth.format(DateTimeFormatter.ofPattern("MM/dd/y")) +
                ", isMarried=" + isMarried +
                ", isEmployed=" + isEmployed +
                '}';
    }

    public void  eat(String food){
        System.out.println(name +" is eating "+food);

    }

    public void  drink (String drink){
        System.out.println(name +" is drinking "+drink);

    }

    public void  sleep (){
        System.out.println(name +" is sleeping ");

    }
}
/*
name, age, gender, dateOfBirth, isMarried, isEmployed need to set information  for person class

toString method (format the date of birth, with digits two month number, two digit day number, and 4 digit year number with / between each
eat(String food ) method
sleep method
drink (String drink) method

there should be 5 peron object
 */
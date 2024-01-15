package day38_exceptions_handling;

import java.util.InputMismatchException;

public class Person {

    private String name;
    private int age;
    private final char gender;

    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
        if(!(gender=='M' || gender== 'F')){//check if the given gender is invalid, then throws an exception and crashes the program
            throw new IllegalArgumentException("Gender can not be other than M and F");
        }
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        if(age==0){
            throw new RuntimeException("Age has not been set");//if age is not set, then it will throw this exception
        }
        return age;
    }

    public void setAge(int age) {
        if (age>0 && age<=150){
        this.age = age;}else {
            throw new IllegalArgumentException("Invalid age: "+age);
        }
    }

    public char getGender() {
        return gender;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}

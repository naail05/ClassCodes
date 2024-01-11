package day28_Encapsulation.person;

import java.time.LocalDate;

public class Person1 {

    private String name;
    private int age;
    private char gender;
    private LocalDate dateOfBirth;

    public String getName() {
        if (name==null || name.equals("")){
            return "Unknown";
        }
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty() || name.isBlank()) {
            System.err.println("Employee name can not be empty or blank");
            System.exit(1);}
        this.name = name;
    }

    public int getAge() {


        return age;
    }

    public void setAge(int age) {
        if(age<0 || age>120){
            System.err.println("Invalid age entry: "+age);}
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if(gender != 'M' && gender != 'F'){
            System.err.println("Invalid gender entry");
        }
        this.gender = gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        if(dateOfBirth.isAfter(LocalDate.now())){
            System.err.println("Date of birth can not be after current date");
        }
        this.dateOfBirth = dateOfBirth;
    }

    public Person1(String name, int age, char gender, LocalDate dateOfBirth) {
        setName(name);
        setAge(age);
        setGender(gender);
        setDateOfBirth(dateOfBirth);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender()+
                ", dateOfBirth=" + getDateOfBirth() +
                '}';
    }
}
/*

name, age, gender, DoB
want to make sure these conditions are given

++name can not be empty, blank, null(writing)
++(get) if name is not set return "Unknown"
++age can not be <0 0r age >120
++gender can only be 'M' or 'F'
++ DoB (set) can not be after current dat, need to use LocalDate.now

++Add constructor that can set all the fields
++Add toString method
 */
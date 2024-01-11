package day24_DateAndTime;

import java.time.LocalDate;

public class Person {

    public String name;
    public  int age ;
    public  char gender;
    public LocalDate birthday;

    ;

    public  void setInfo(String name, char gender, LocalDate birthday) {// we are not passing parameter for age as we can find age from the date of birth, where can subtract date of birth from the current year

        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.age = LocalDate.now().getYear()-birthday.getYear();
        //by using getYear we can get the year from the date
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", birthday=" + birthday +
                '}';
    }
    //while creating a method, the less parameters it require the better it is, that is why we didnt ask for the age and tried to calculate it from the birth year
}

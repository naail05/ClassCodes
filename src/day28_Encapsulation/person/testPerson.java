package day28_Encapsulation.person;

import day28_Encapsulation.personTask.Person;

import java.time.LocalDate;

public class testPerson {

    public static void main(String[] args) {

        Person1 person2 = new Person1("Naail", 35, 'M', LocalDate.of(1987,06,01));

        System.out.println(person2);
    }


}

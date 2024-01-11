package day24_DateAndTime;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class TestPersonObject {

    public static void main(String[] args) {
        //we will create both Array and arraylist to store multiple data regarding persons

        System.out.println("----------using Array------------------");
        Person[] people = {new Person(), new Person(),
                new Person(), new Person()};
        people[0].setInfo("Nazir", 'M', LocalDate.of(2016 ,10,14));
        people[1].setInfo("Maryam", 'F', LocalDate.of(2014 ,10,14));
        people[2].setInfo("Rashid", 'M', LocalDate.of(2019 ,10,14));
        people[3].setInfo("Khabir", 'M', LocalDate.of(2022 ,10,14));

        System.out.println(Arrays.toString(people));


        ArrayList<Person> Babies = new ArrayList<>();
        Babies.addAll(Arrays.asList(people));

        // creat a program that can remove Peron object from the list with age less than 3 years
        Babies.removeIf(p-> p.age<3);
        for (Person each : Babies) {

            //print the name and date of birth of each person object

            System.out.println(each.name +": "+each.birthday);
        }



    }
}

package day25_constructors;

import java.time.LocalDate;

public class TestPersonObject {

    public static void main(String[] args) {

         Person p1 = new Person("Nazir", 'M',LocalDate.of(2016,04,24),false,false);

        Person p2 = new Person("Maryam", 'F',LocalDate.of(2014,04,24),false,false);

        Person p3 = new Person("Rashid", 'M',LocalDate.of(2018,04,24),false,false);

        Person p4 = new Person("Bashir", 'M',LocalDate.of(1987,04,24),true,false);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);

        p1.drink("Energy");
        p1.eat("Pizza");
       p3.sleep();
       p2.eat("Burger");
       p3.drink("Pepsi");
    }

}

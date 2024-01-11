package day25_constructors;

import java.time.LocalDate;

public class TestEmployeesObjects {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Nazir",22,'M',"Software Eng", 130000, LocalDate.of(2029,05,24));

        Employee employee2 = new Employee("Maryam",25,'F',"Software Eng", 150000, LocalDate.of(2028,05,24));

        Employee employee3 = new Employee("Rashid",20,'M',"Software tester", 120000, LocalDate.of(2032,07,24));

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);

    }
}

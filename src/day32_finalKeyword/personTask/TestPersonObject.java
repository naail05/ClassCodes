package day32_finalKeyword.personTask;

import java.time.LocalDate;

public class TestPersonObject {

    public static void main(String[] args) {

        Person person = new Person("Nazir", 'M', LocalDate.of(2017,2,12));

        Employee employee = new Employee("Rashid", 'M', LocalDate.of(2019,1,18), "QA", 120000);



        System.out.println(person);
        System.out.println(employee);

        employee.sleep();
        person.breath();
        employee.breath();// as this was final method then we will get the same implementation for both the objects



    }
}

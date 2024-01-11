package day28_Encapsulation.employee;

import day28_Encapsulation.employee.Employee;

public class TestEmployee {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Nazir", 4, "SDET", 140000);

        System.out.println(employee1);


        /*
        employee1.setSalary(12000);
        System.out.println(employee1.getSalary());

      employee1.setName("Naail");
        System.out.println(employee1.getName());
        */

    }
}

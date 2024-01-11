package day33_abstraction.employeeTask;

public class TestEmployeeObjects {

    public static void main(String[] args) {

      // Employee employee = new Employee("Naail", 35, 'M', "A24", "SDET", 115000); as it is an abstract class, so we can not really create an object from it, as it has incomplete methods or implementations(the abstract methods)

        Teacher teacher = new Teacher("Maryam", 8, 'F', "A214", "Math teacher", 120000);

        Developer developer = new Developer("Nazir", 6, 'M', "A231", "Developer", 125000,"Java");

        Driver driver = new Driver("Aaron", 36, 'M', "AC24", "Driver", 67000);

        Tester tester = new Tester("Naail", 36, 'M', "AB2343", "QA", 121000);

        System.out.println(teacher);
        System.out.println(developer);
        System.out.println(driver);
        System.out.println(tester);


        System.out.println("--------------abstract method work()------------------------");
        tester.work();
        developer.work();
        teacher.work();
        driver.work();



    }
}

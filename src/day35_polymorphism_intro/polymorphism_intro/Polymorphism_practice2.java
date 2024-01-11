package day35_polymorphism_intro.polymorphism_intro;

import day33_abstraction.employeeTask.*;

public class Polymorphism_practice2 {

    public static void main(String[] args) {

        Employee[] employees = {
                new Tester("Hamza", 32, 'M', "A01", "QA", 110000),
                new Developer("Lucy", 27, 'F', "A02", "Java Developer", 128000, "Java"),
                new Tester("George", 28,'M', "A03", "SDET", 120000),
                new Developer("Yulia", 23, 'F',"A04", "Software Developer", 135000, "Python"),
                new Tester("Cihad", 30, 'M',"A05", "SDET", 105000),
                new Developer("Gulistan",  26, 'F', "A06", "Web Developer", 130000, "Python"),
                new Tester("Nora",  28, 'F', "A07", "QE", 120000),
                new Driver("Aaron", 48, 'M', "D1", "Truck Driver", 90000),
                new Developer("Diana",  29, 'F', "A08", "Front-end Developer", 140000, "C#"),
                new Tester("Tatiana",  25, 'F',"A09", "SDET", 130000),
                new Developer("Alena",  26, 'F',"A10", "Back-end Developer", 150000, "Java"),
                new Tester("Timur",  29, 'M',"A11", "SDET", 115000),
                new Teacher("James", 45,  'M', "B1", "Math Teacher", 75000),
                new Tester("Sam", 45,  'M', "B1", "Math Teacher", 75000),
                new Developer("Hasan",  26, 'F', "A12", "Full Stack Developer", 142000, "Java"),
                new Tester("Nataliia",  24, 'F', "A13", "QE", 125000),
                new Developer("Ermek",  26, 'M',"A14", "Full Stack Developer", 142000, "Java"),
                new Tester("Khashayar",  30, 'M',"A15", "SDET", 105000),
        };
          //1. Print the name and Job Title of every employee
        int developers=0, testers =0, teachers=0, drivers =0;

        for (Employee employee : employees) {
            System.out.println("Name = " + employee.getName());
            System.out.println("JobTitle = " + employee.getJobTitle());
           // System.out.println();//this is just for space between each print
           if(employee.getClass()==Developer.class){
               developers++;
           } else if (employee.getClass()==Tester.class) {
               testers++;
           } else if (employee.getClass()== Teacher.class) {
               teachers++;
           }else {drivers++;}


    }
        System.out.println("developers = " + developers);
        System.out.println("testers = " + testers);
        System.out.println("teachers = " + teachers);
        System.out.println("drivers = " + drivers);

        System.out.println("----------------------------------");
        int developer=0,tester =0, teacher=0, driver =0;

        for (Employee employee : employees) {
            System.out.println("Name = " + employee.getName());
            System.out.println("JobTitle = " + employee.getJobTitle());
            System.out.println();//this is just for space between each print
            if(employee instanceof Developer){// if employee is developer
                developer++;
            } else if (employee instanceof Tester) {// if  is tester
                tester++;
            } else if (employee instanceof Teacher) {// if  is teacher
                teacher++;
            }else {driver++;}// finally if employee is driver




        }
        System.out.println("developers = " + developer);
        System.out.println("testers = " + tester);
        System.out.println("teachers = " + teacher);
        System.out.println("drivers = " + driver);

        System.out.println("------------------------------------------------");

        //Display the names of employees who are not developers
        for (Employee employee : employees) {
            if (!(employee instanceof Developer)){
                System.out.println("Name = " + employee.getName());
            }
        }




}}
/*
 Employee[] employees = {
                new Tester("Hamza", 32, 'M', "A01", "QA", 110000),
                new Developer("Lucy", 27, 'F', "A02", "Java Developer", 128000, "Java"),
                new Tester("George", 28,'M', "A03", "SDET", 120000),
                new Developer("Yulia", 23, 'F',"A04", "Software Developer", 135000, "Python"),
                new Tester("Cihad", 30, 'M',"A05", "SDET", 105000),
                new Developer("Gulistan",  26, 'F', "A06", "Web Developer", 130000, "Python"),
                new Tester("Nora",  28, 'F', "A07", "QE", 120000),
                new Driver("Aaron", 48, 'M', "D1", "Truck Driver", 90000),
                new Developer("Diana",  29, 'F', "A08", "Front-end Developer", 140000, "C#"),
                new Tester("Tatiana",  25, 'F',"A09", "SDET", 130000),
                new Developer("Alena",  26, 'F',"A10", "Back-end Developer", 150000, "Java"),
                new Tester("Timur",  29, 'M',"A11", "SDET", 115000),
                new Teacher("James", 45,  'M', "B1", "Math Teacher", 75000),
                new Developer("Hasan",  26, 'F', "A12", "Full Stack Developer", 142000, "Java"),
                new Tester("Nataliia",  24, 'F', "A13", "QE", 125000),
                new Developer("Ermek",  26, 'M',"A14", "Full Stack Developer", 142000, "Java"),
                new Tester("Khashayar",  30, 'M',"A15", "SDET", 105000),
        };

1. Print the name and Job Title of every employee
2. How many developers do we have?
3. How many testers do we have?
4. How many teachers do we have?
5. How many Drivers do we have?
6. Display the names of employees who are not developers
 */
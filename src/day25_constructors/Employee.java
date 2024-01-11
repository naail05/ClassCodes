package day25_constructors;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Employee {
// when we creat a class first we have to decide that what information we want to store if we want to have an object lets say employee in this case, or what information  we want to store in that object about employee

        public String name;
        public  int age;
        public  char gender;
        public  String jobTitle;
        public  double salary;
        public LocalDate hireDate;

    public Employee(String name, int age, char gender, String jobTitle, double salary, LocalDate hireDate) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.hireDate = hireDate;
    }// it allows us to set all the instances variables of the object as soon as the object is created

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", hireDate=" + hireDate.format(DateTimeFormatter.ofPattern("MMMM/dd/y")) +
                '}';
    }//this toString method allows us to print the object as soon as the object is passed on to the print statement

    //we can create some action methods as well as
        public  void work(){// is is also an instance method
            System.out.println(name +" is working");

        }

    }

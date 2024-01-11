package day24_DateAndTime;

import day17_ClassAndObjectIntro.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Warmup2 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7));
        System.out.println(list);

        // to remove all those elements which are less than 4
        list.removeIf(p-> p<4);
        System.out.println(list);


        System.out.println("---------Practice using remove if------------------");
        ArrayList<String> names = new ArrayList<>();

        names.addAll(Arrays.asList("Java", "Python", "C#", "Java", "Ruby", "JavaScript", "C++", "C"));
        System.out.println(names);
        //remove all the elements that start with J
        names.removeIf(p-> p.startsWith("J"));
        System.out.println(names);


        System.out.println("---------Practice using remove if------------------");

        ArrayList<Employee> employees = new ArrayList<>();
        employees.addAll(Arrays.asList(
                new Employee(), new Employee(), new Employee(), new Employee(), new Employee()));

        employees.get(0).setInfo("Josh", 34, 'M', "Java Developer", 100000, "A01");
        employees.get(1).setInfo("Emily", 40, 'F', "SDET", 90000, "A02");
        employees.get(2).setInfo("Conor", 38, 'M', "Project Manager", 130000, "A03");
        employees.get(3).setInfo("Bella", 29, 'F', "Java Developer", 125000, "A04");
        employees.get(4).setInfo("Jimmy", 54, 'M', "Data Analyst", 85000, "A05");

        //from this arraylist, remove the employees that are making more than 100 thousand


        employees.removeIf(p -> p.salary>100000);
        for (Employee eachEmployee : employees) {// this will give us name of each employee with salary less 100k
            System.out.println(eachEmployee.name+": $"+eachEmployee.salary);
        }
        System.out.println(employees);// this will return the arraylist with employees that have salary less than 100k


    }
}
/*

Write a program that can remove the elements that are less than 4, from an ArrayList of integer

            Ex:
                list = {1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7};

            output:
                [4, 5, 6, 7, 4, 5, 6, 7]
 */
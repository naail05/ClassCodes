package day30_InheritanceContinue.InheritanceTypes;

import java.time.LocalDate;

public class Teacher extends Employee{// teach is the sub-class of the employee and the grand child of the person class, it is multi-level inheritance


    public Teacher(String name, char gender, LocalDate DOB, String jobTitle, String employeeId, double salary) {
        super(name, gender, DOB, jobTitle, employeeId, salary);
    }

    public void teach(){

        System.out.println(getName()+ " is teaching ver good");

    }
}

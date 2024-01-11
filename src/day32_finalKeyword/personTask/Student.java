package day32_finalKeyword.personTask;

import java.time.LocalDate;

public class Student extends Person{

    //variables unique to student class

    private char grade;

    public Student(String name, char gender, LocalDate dateOfBirth, char grade) {
        super(name, gender, dateOfBirth);
        this.grade = grade;
    }
}

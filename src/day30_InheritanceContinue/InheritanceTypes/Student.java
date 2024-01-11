package day30_InheritanceContinue.InheritanceTypes;

import java.time.LocalDate;

public class Student extends Person{

    private char grade;
    private String studentId;
    //these are specific variables to student class, not common to each person

    public Student(String name, char gender, LocalDate DOB, char grade, String studentId) {
        super(name, gender, DOB);
       setGrade(grade);
        setStudentId(studentId);
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    private void study(){

        System.out.println(getName()+ "is studying");

    }
}

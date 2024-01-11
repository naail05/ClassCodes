package day29_Inheritance.student;

import day29_Inheritance.student.Student11;

public class testStudent11Object {

    public static void main(String[] args) {



    Student11 student1 = new Student11("rasho", 14, 'M', 'A', "MIT");

    student1.setSchoolName("Harvard");// if the student school name is changed, here we need to setter and give the updated data, it will be updated accordingly

        System.out.println(student1);


} }

package day26_static.studentTask;

import day26_static.studentTask.Student;
import day26_static.studentTask.StudentsGroup;

import java.util.Arrays;

public class TestObjects {

    public static void main(String[] args) {

        Student student1 = new Student("Nazir", 5, 'M', "A15");
        Student student2 = new Student("Maryam", 8, 'F', "B25");
        Student student3 = new Student("Rashid", 3, 'M', "C18");
        Student student4 = new Student("Bashir", 35, 'M', "D45");
        Student student5 = new Student("MNaail", 26, 'F', "E19");

        Student[] students = {student2,student3,student4,student5};

        StudentsGroup group1 = new StudentsGroup("Java Lovers", 1);
        group1.addStudent(student1);// we can add one by one like this
        group1.addStudent(students);// or we can have an array and add that array at once to the arraylist
        group1.addStudent("Mus", 26, 'F' ,"A24");// or we can add by using this method where we need to provide above info

        group1.removeStudent("E19");// this remove this student based on this id


        System.out.println(group1);

        // how to get the names of all the students

        for (Student each : group1.students) {//iterate through each element of the group
            System.out.println(each.name + " : "+ each.id);

        }

        System.out.println("---------------------------------------------------------");

        StudentsGroup group2 = new StudentsGroup("Java Fan", 2);
        Student student11 = new Student("Naz", 5, 'M', "A25");
        Student student21 = new Student("Mar", 8, 'F', "B15");
        Student student31 = new Student("Rasho", 3, 'M', "C38");
        Student student41 = new Student("BAN", 26, 'M', "E59");

        Student[] students1 = {student11,student21,student31,student41};

        group2.addStudent(students1);

        StudentsGroup group3 = new StudentsGroup("Java Fan", 3);
        Student student12 = new Student("Nii", 5, 'M', "A125");
        Student student22 = new Student("Maro", 8, 'F', "B115");
        Student student32 = new Student("Rashi", 3, 'M', "C318");
        Student student42 = new Student("Munro", 26, 'F', "E159");

        Student[] students2 = {student12,student22,student32,student42};

        group3.addStudent(students2);

        StudentsGroup[] groups = {group1, group2, group3};
        System.out.println(Arrays.deepToString(groups));
        for (StudentsGroup each : groups) {
            for (Student student : each.students) {
                System.out.println(student.name);

            }

            }

            }

        }










/*
3. Create a class named TestObjects
	            3.1 Create 5 Student objects
	            3.2 Create a StudentGroup object
	            3.3 Add all the student objets to the StudentsGroup object' students list
 */
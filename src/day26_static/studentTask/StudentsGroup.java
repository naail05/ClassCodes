package day26_static.studentTask;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentsGroup {

    public String groupName;
    public  int GroupId;
    public ArrayList<Student> students;
    //public ArrayList<Student> students = new ArrayList<>(); or we can instantiate it in constructor

    public StudentsGroup(String groupName, int groupId) {//creates the StudentsGroup object by setting the groupName and groupId
        this.groupName = groupName;
        this.GroupId = groupId;
        students = new ArrayList<>();//inorder to use the arraylist, object need to be created, where at the beginning size will be zero

    }

     public void addStudent(Student student){
        students.add(student);//one way to add student to the arraylist, by passing the student object

     }

     public void addStudent (Student[] students){
        this.students.addAll(Arrays.asList(students));// adds list of student to arraylist
     }

     public void addStudent (String name, int age, char gender, String id){
        students.add(new Student(name,  age, gender, id));//another way of adding student to the arraylist, by passing the name,  age, gender, id, here student object will be created and these info will be added to the arraylist of students
     }

     public void removeStudent(String id){
        students.removeIf(p-> p.id.equals(id));// this removes a student if the id matches with the provided/specified id (takes one argument which is student id)
     }

    @Override
    public String toString() {
        return "StudentsGroup{" +
                "groupName='" + groupName + '\'' +
                ", GroupId=" + GroupId +
                ", number of students=" + students.size() +
                '}';
    }
}
/*
2. Create a custom class named StudentsGroup
	            Attributes:
	                groupName, groupId, students (ArrayList<Student>)

	            Add a constructor that can set the groupId and groupName
	                    initialize students arraylist in the constructor's body

	            Methods:
	                addStudent(Student): adds the specified student to the students arrayList

	                removeStudent(id): removes the student with the specified id from the students arraylist

	                toString(): displays the groupName, groupId and total number of students when a group object is passed in the print statement
 */
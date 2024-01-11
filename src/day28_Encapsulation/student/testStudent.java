package day28_Encapsulation.student;

public class testStudent {

    public static void main(String[] args) {



    Student student1 = new Student();
    //student1.age= -200;


        student1.setAge(35);
        System.out.println(student1.getAge());
        System.out.println("Test Completed");

        System.out.println(student1.getAge());
        //now to set the age we need a method called setter
        student1.setName("Naail");
        System.out.println(student1.getName());

    }
}

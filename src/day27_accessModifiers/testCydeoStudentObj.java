package day27_accessModifiers;

public class testCydeoStudentObj {

    public static void main(String[] args) {

        System.out.println("School Name: "+CydeoStudent.schoolName);


        CydeoStudent student1 = new CydeoStudent("Nazir", 6, 'M');
        CydeoStudent student2 = new CydeoStudent("Maryam", 8, 'F');
        CydeoStudent student3 = new CydeoStudent("Rashid", 4, 'M');
        System.out.println("Secret code: "+student1.secretCode);// we can call/access static variable through the object as well, but that is not the prefered way of doing it.
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);


    }
}

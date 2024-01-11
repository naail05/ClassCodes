package day30_InheritanceContinue.InheritanceTypes;

import java.time.LocalDate;

public class TestPersonObjects {

    public static void main(String[] args) {



    Student student = new Student("Naail",'M', LocalDate.of(1987,06,01),'A',"A215");


    President president = new President("Nazir", 'M', LocalDate.of(2018,6,7),LocalDate.of(2023,7,28));

    Teacher teacher = new Teacher("Maraym", 'F', LocalDate.of(2014,03,14),"Math teacher", "A213", 140000);

        System.out.println(student);
        System.out.println(president);
        System.out.println(teacher);

        System.out.println("=================================================");
        president.eat("Polaw");
        student.drink("Water");//common methods

        teacher.teach();
        president.lie();//specific methods

}   }

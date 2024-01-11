package day17_ClassAndObjectIntro;

public class TestEmployeeObjects {

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        // first object is created
        employee1.setInfo("Naail", 34, 'M', "SDET", 110, "AB210C");

       Employee employee2 = new Employee();
       employee2.setInfo("Ahmad", 35, 'M', "QA", 95, "AB213D");

       Employee employee3 = new Employee();
       employee3.setInfo("Nazir", 24, 'M', "Senior QA", 115, "AB214A");

       // if we want to change or amend any data of the above object then we will call that specific data and the object and will assign the new data

       employee2.name = "Rashid";
       employee2.age = 21;
       //so the final value will be what we assigned at last
        //fo now these objects are not immutable and can be changed

        System.out.println("employee1 = " + employee1);
        System.out.println("employee2 = " + employee2);
        System.out.println("employee3 = " + employee3);
        // three separate copies of instance variables are created and stored in each object

        employee1.work();//calling the work method

    }
}

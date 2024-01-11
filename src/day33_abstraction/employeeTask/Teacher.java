package day33_abstraction.employeeTask;

public class Teacher extends Employee {

    public Teacher(String name, int age, char gender, String id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }
    //even if we call the constructor, till we do not override or complete the implementation of the abstract method , we will be getting compile error, as no non-abstract class can have a method without body or implementation
    // if we make child class an abstract then there will be the need for overriding, but in that case we may not be able to create object out of that class

    @Override
    public void work() {
        System.out.println(getName()+ " is teaching");
    }
}

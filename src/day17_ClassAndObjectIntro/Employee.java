package day17_ClassAndObjectIntro;

public class Employee {
// when we creat a class first we have to decide that what information we want to store if we want to have an object lets say employee in this case, or what information  we want to store in that object about employee

    public String name;
    public  int age;
    public  char gender;
    public  String jobTitle;
    public  double salary;
    public  String id;
    // now we will create method to set all those attributes of the employee object at once


    public void setInfo (String name, int age, char gender, String jobTitle, double salary, String id) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.id = id;
    }// its to assign the local variable to instance variable. Set info method

    @Override
    public String toString() {//it help us to avoid getting hashcode when we print the class object, and cover what we created to string so we can read. toString method
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", id='" + id + '\'' +
                '}';
    }

    //we can create some action methods as well as
    public  void work(){// is is also an instance method
        System.out.println(name +" is working");

    }

}

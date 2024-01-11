package day28_Encapsulation.employee;

public class Employee {

    private String name;
    private int age;
    private String jobTitle;
    private double salary;


    public String getName() {
        if (name == null) {
            name = "Unknwon";
        }


        return name;
    }

    public void setName(String name) {
        if (name.isEmpty() || name.isBlank()) {
            System.err.println("Employ name can not be empty or blank");
            System.exit(1);
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 18 || age > 70) {
            System.err.println("Age out of bound: " + age);
            System.exit(1);
        }
        this.age = age;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {

        if (jobTitle.isEmpty() || jobTitle.isBlank()) {
            System.err.println("Job title of employee can not be empty");
            System.exit(1);
        }
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary < 0) {
            System.err.println("Salary can not be negative figure " + salary);
            System.exit(1);
        }
        this.salary = salary;
    }

    public Employee(String name, int age, String jobTitle, double salary) {
        setName(name);
        setAge(age);
        setJobTitle(jobTitle);
        setSalary(salary);
        // we are calling the setter methods here instead of using this keyword, so that all the conditions we have given there will be taken into account and the arguments will not be passed without a check
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", age=" + getName() +
                ", jobTitle='" + getJobTitle() + '\'' +
                ", salary=" + getSalary() +
                '}';
    }


}

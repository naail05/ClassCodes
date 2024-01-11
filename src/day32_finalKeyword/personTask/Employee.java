package day32_finalKeyword.personTask;

import java.time.LocalDate;

public class Employee extends Person{// as later on it could be a parent class eg for developer, SDET and , so we should not make it final

    //additional variables, unique to employee class
    private String jobTitle;
    private  double salary;


    public Employee(String name, char gender, LocalDate dateOfBirth, String jobTitle, double salary) {
        super(name, gender,dateOfBirth);
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //additional methods, unique to employee class
    public void work(){
        System.out.println(getName()+" is working");
    }



    @Override
    public String toString() {
        return getClass().getSimpleName()+ "{" +
                "name='" + getName() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", dateOfBirth=" + getDateOfBirth() +
                ", job title =" + jobTitle +
                ", salary=" + salary +
                '}';
    }
}

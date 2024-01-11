package day27_accessModifiers;

public class CydeoStudent {

    public String name;
    public int age;
    public char gender;

    public static String schoolName;
    public static String secretCode;// lets suppose these variable need more than one step to be initialized

    //for setting instance variables we will use constructor


    public CydeoStudent(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;

       // schoolName = "Cydeo School";
       // secretCode = "Wooden Spoon"; we are not setting static variables in the constructor as this will repeat the variables everytime for every object, which we dont need that is why we dont set static variables in the constructor
    }

    static{
        schoolName = "Cydeo School";
        secretCode = "Wooden Spoon";
    }// this will execute the codes just once

    @Override
    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}

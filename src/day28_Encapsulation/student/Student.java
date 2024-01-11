package day28_Encapsulation.student;

public class Student {


   // public  String name;
   private String name;
   // public int age;
    private  int age;

    //we use getting method to read these codes, and these methods needs to be instance and public, match the variable type with the instance variable they read as they are return typ methods

    public void setAge(int age){// to write the data
        if(age<4 || age>100){
            System.err.println("Invalid age "+age);
            System.exit(1);//giving condition and with exit method, will exit the program after giving age not per the condition, 1 in the exit code means that there is some error in the program
        }

        this.age= age;

    }

    public int getAge (){// this is read only
        if(age==0){
            System.err.println("Age has not been set");
            System.exit(1);
        }

        return  age;
    }

//using shortcut for generating getters and setters


    public String getName() {
        if(name==null){
            System.err.println("Name has not been set");
            System.exit(1);
        }
        return name;
    }

    public void setName(String name) {
        boolean hasDigits =false;
        for (char each : name.toCharArray()){
            if(Character.isDigit(each)){
                hasDigits=true;
                break;}}
        if (hasDigits){
            System.err.println("Invalid name "+name);
            System.exit(1);
        }
        this.name = name;
    }
}

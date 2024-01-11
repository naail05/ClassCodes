package day03_variables;

public class VariableNamingRules {
    public static void main(String[] args) {

        //age of the student is 28
        // salary of the person is 10000

        int age = 28;
        int salary = 10000;

        System.out.println(age);
        System.out.println(salary);
        byte age1 = 28;
        short salary2 = 10000;
        System.out.println(age1);// we added 1 to "age"/salary to make it unique,
        System.out.println(salary2);// else will give compile error

        System.out.println("------------------------");
        //int phone number = 6148086718; gives compile error as we gave space between phone and number, so to make it readable and understandable we should apply camel case, as below,


        int phoneNumber = 614808671;
        System.out.println(phoneNumber);
        System.out.println("-------------------------------------------");

        int number1 = 10;
        int number2= 20;
        int number3 = 30;
        // names are not allowed to start with digits, but cn be part of the names

        System.out.println("------------------------------------");

        //variable names can not be java reserved words as boolean, char and so, else will give as compile error.

        // gender is male, here we use String as its more than one character

        String gender = "Male";
        String FullName = "Cydeo School";

        System.out.println(gender);
        System.out.println(FullName);









    }
}

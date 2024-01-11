package day04_primitiveCastin_Concatenation;

public class Task1_fullName {

    public static void main(String[] args) {

/*
        Declare the following variables:
            1.FirstName
            2.LastName

        Use concatenation to print the full name
           Ex:
           Your full name is (Bashir Naail)

         */

        String FirstName = "Bashir";

        String LastName = "Naail";

        System.out.println("Your full name is "+FirstName+" "+LastName);// we have added" " here to have a space between first and last name, without " " we wil not have first and last names separated
        System.out.println("----------------------------------------");


        //we can add the space in other ways as well, by creating another string variable as below:

        String firstName = "Daniel";
        String lastName = "Jefferson";
        String fullName = firstName +" "+ lastName;
        System.out.println(" Your full name is "+fullName);


    }
}

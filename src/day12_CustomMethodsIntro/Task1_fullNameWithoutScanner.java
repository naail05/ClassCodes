package day12_CustomMethodsIntro;

public class Task1_fullNameWithoutScanner {

    public static void main(String[] args) {

        ;



       String FirstName ="cYDeO";
       String LastName = "SChOoL";

        FirstName = FirstName.substring(0,1).toUpperCase()+FirstName.substring(1).toLowerCase();//getting the first character of first name and the remaining characters



        LastName = LastName.substring(0,1).toUpperCase()+LastName.substring(1).toLowerCase();

        System.out.println(FirstName+" "+LastName);



    }
}

package day12_CustomMethodsIntro;

public class Initials_withMethod {

    public static void main(String[] args) {

initial("nazir","naail");



    }

    //create a method that can display the initial of a person

    public static void initial( String FirstName,String LastName){


    //String initial = FirstName.toUpperCase().substring(0,1)+"."+LastName.toUpperCase().substring(0,1);

        String initial = FirstName.toUpperCase().charAt(0)+"."+LastName.toUpperCase().charAt(0);

        System.out.println("initial is: " + initial);

        //in order for the method to work, the right form of code fragment needs to be provided
    }



}

package day10_Scanner_StringIntro;

import java.util.Scanner;

public class StringMethod_1 {

    public static void main(String[] args) {

        String str = "Cydeo";
        //index:      01234

        char firstChar = str.charAt(0);
        char secondChar = str.charAt(1);
        char thirdChar = str.charAt(2);
        char fourthChar = str.charAt(3);
        char fifthChar = str.charAt(4);
        // the char method will give us /returns us only the index numbers for which characters are available

        System.out.println(firstChar);
        System.out.println(secondChar);
        System.out.println(thirdChar);
        System.out.println(fourthChar);
        System.out.println(fifthChar);

        System.out.println("----------------------Length methode-----------------");
        // it tells us how many characters does a string have.

        String sentence = "Java Programming Language";
       int length = sentence.length();

        System.out.println(length);
        //now to know the last index it will be
        int lastIndex = length-1;
        System.out.println(lastIndex);

        System.out.println("------------------------------------------------------");

        String  s1    = "Wooden Spoon";
        String Name = "how is life going";



        char firstCharac = Name.charAt(0);// for first character
        int finalindex = Name.length()-1;// to know the final index as index starts from zero

        char lastCharac = Name.charAt(finalindex);//for last character
        System.out.println(firstCharac+" "+lastCharac);


        System.out.println("-------------------------------------Equals method-------------");
        // for comparing the values in those objects, not the objects
        String name1 = "Umran";
        String name2 = new String("Umran");// objects are different while values are same
        //now that they are referencing to different objects so using the == operator will not return the true value to us, we will get false. System.out.println(name1==name2)


        System.out.println(name1.equals(name2));//this method compares the values/literals

        System.out.println("--------------------------------------------");
        String r1 = "Java";
        String r2= "Java";
        String r3 = new String("Java");

        System.out.println(r1==r2);// result will be true
        System.out.println(r1==r3); //result will be false as they are different objects

        System.out.println(r1.equals(r3));//now the result will be true as we are comparing the value not objects

        System.out.println("------------------------------------------------------------");
        //practice, eligible or not eligible to vote

        Scanner input = new Scanner(System.in);
        System.out.println("How old are you?");
        int age =input.nextInt();

        System.out.println("Are you US citizen?");
        String  citizen = input.next();
        String answer = "yes";

        if(age>=21 && citizen.equalsIgnoreCase(answer)) {
            System.out.println("The person is eligible to vote");
        }      else{
            System.out.println("The person is not eligible to vote");   }
        
                      input.close();










    }
}

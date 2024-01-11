package day22_ArrayList;

public class wrapperClassMethods {

    public static void main(String[] args) {
        //parse method and value of method
        //parse is for converting string to primitive
        //valueOf is for converting string to wrapper class object

        String str = "20";
        System.out.println(str+1);//(will result in concatenation not adding
        // though its number but now that it is in "" so will be treated as string and if want to add an int it will not be added but concatenated, so to convert the number to int we need to change the string to primitive
        // so for this conversion we need to call parse method from the wrapper class
        int num1 = Integer.parseInt(str);
        System.out.println(num1+1);//now it will return 21(num+1)

        Integer num2 =Integer.valueOf(str);//string to wrapper class
        System.out.println(num2);

        System.out.println("----------decimal numbers------------");


         String s = "20.5";

         double s1 = Double.parseDouble(s);//will get primitive value
        System.out.println(s1+1);

         Double s2 = Double.valueOf(s);//string to wrapper class
        //both of them are double values

        System.out.println("---------boolean with above method------------");

        String x = "true";
        boolean x1 = Boolean.parseBoolean(x);

        Boolean x2 = Boolean.valueOf(x);
        System.out.println(x2);

        System.out.println(x1);// if we have any other value in the string than true then we will get false or boolean will return false

        System.out.println("----------methods of character wrapper class---- ");
         // method to identify if the character is digit, as long as the character is between 0~9 on the ascii table it is digit
        // the method is to call isDigit from character class

        char ch = '1';
       boolean isDigit =  Character.isDigit(ch);
        System.out.println("isDigit = " + isDigit);

        char ch1 = 'A';
        //now to know if it is letter, here we need to call isLetter method from the character class, either uppercase or lowercase letter
        boolean isLetter = Character.isLetter(ch1);
        System.out.println("isLetter = " + isLetter);
        //to verify the case , if upper or lower case

        boolean ch2 = Character.isLowerCase(ch1);
        System.out.println("isLowercase = " + ch2);// returns false in this case
        boolean ch3 = Character.isUpperCase(ch1);
        System.out.println("isUppercase = " + ch3);// returns true in this case

        // verify if it is special character

        char ch4 = '$';
        boolean ch5 = Character.isLetterOrDigit(ch4);// the only time it returns false is when the character is neither digit not letter(special character) or we can use the expression as:
        boolean ch6 = !Character.isLetterOrDigit(ch4);// here we say that it is neither letter nor char so the return will be true in this case
        System.out.println("isSpecialCharacter = " + ch5);
        System.out.println("isSpecialChar = " + ch6);
        System.out.println("----------------------------------------------");
        // how if we have a string of letters and digits and try to take out digits out of this string

        String str1 = "a1b2c3d4e5";// find some of all the digits and then add

        int sum = 0;
       // from this string we call toCharArray method
        for (char each : str1.toCharArray()) {// here we have array which contains each character of the string
            if(Character.isDigit(each)){// verify if character is digit
               sum += Integer.parseInt(""+each);//convert character to number and then added to sum,  parseInt only converts string to primitive int, so what we will do is concatenation and somehow convert char to a string by using ""(empty string)


        }

        }
        System.out.println("sum = " + sum);





    }


}

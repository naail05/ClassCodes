package day11_StringsContinue;


import java.util.Scanner;

public class Practice3_DigitLetterSpecialChar {

    public static void main(String[] args) {

        System.out.println("Enter a word:");


        String str = new Scanner(System.in).nextLine();//when we are using scanner object only once, here is no need to use the close method to close the scanner

        if(str.length()>=1){// if the string has at least one character
            char f = str.charAt(0);// the first character of string
            if(f>='0' && f<='9'){
                System.out.println("first character is digit");} else if ((f>='A' && f<='Z')) {System.out.println("first character is uppercase letter");
            }else if (f>='a' && f<='z'){System.out.println("first character is lowercase letter");}
            else{
                System.out.println(" first character is a special character");}


        }else{
            System.out.println("String is empty");}






    }
}
/*
Create a class named DigitLetterSpecialChar and write a program that can ask the user to enter a word
	        - if the word starts with digits, print "first character is digit"
	        - if the word starts with uppercase letters, print "first character is lowercase letter"
	        - if the word starts with lowercase letters, print "first character is uppercase letter"
	        - if the word starts with special characters, print "first character is special character"


        	HINT: You need to check the ascii table


 */
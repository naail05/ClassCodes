package day11_StringsContinue;

import java.util.Scanner;

public class Practice1_LongestString {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first string :");
        String str1 = input.nextLine();


        System.out.println("Enter your second string :");
        String str2 = input.nextLine();
        input.close();// as we dont need ant other input from the user, so will disconnect the scanner

        if( str1.length() > str2.length()){
            System.out.println("first string is the longest");
        }else if(str1.length() < str2.length()){
            System.out.println("second string is the longest");
        }else{
            System.out.println("Equal");}



        }


    }

/*
Create a class named LongestString
			1.1 Ask the user to enter two strings
			1.2 Write a program that can print the longest string, if both have the same number of characters then print "Equal"
 */
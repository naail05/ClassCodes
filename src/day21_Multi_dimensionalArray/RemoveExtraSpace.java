package day21_Multi_dimensionalArray;

import java.util.Arrays;

public class RemoveExtraSpace {

    public static void main(String[] args) {
    // by using trim method from the string we can remove the space at the beginning and end of the string
        String str = "  Hello world      I      love      Java    ";
       str= str.trim();// this will return new object, so will assign it back to str, later on we will not really need this statement
        System.out.println(str);

        //so first we will creat a string array that will contain each of the word from the above string, and can use split method (by " ")

        String[] words = str.split(" ");
        System.out.println(Arrays.toString(words));
//[Hello, world, , , , , , I, , , , , , love, , , , , , Java] this is what we will get, next step is to check each element of the array as long as it is not empty, then can get the word and concat it to new string
        
        str= "";
        for (String each : words) {//now need to check which element is not an empty string, as long as the element is not empty string, that need to be added to the string
            if(!each.isEmpty()){
                str += each+" ";// if not empty then add to str flowed by a space
            }
            
        }
        str.trim();//to remove the space after last word
        System.out.println(str);
//our output will be "Hello world I love Java"
    }


}
/*
√1. Write a program that can remove all the extra space from string
			Ex:
				str = "  Hello world      I      love      Java    "

        	Output:
        		Hello world I love Java

 */
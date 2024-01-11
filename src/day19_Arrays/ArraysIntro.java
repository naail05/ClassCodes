package day19_Arrays;

import java.util.Arrays;

public class ArraysIntro {

    public static void main(String[] args) {
// suppose you are in college and want to store the score of your 5 subjects, so should you declare 5 variables or declare an array??
        //without array :
        int score1 = 85;
        int score2 = 75;
        int score3 = 78;
        int score4 = 88;
        int score5 = 95;
       // this can be done, but its not an efficient way.

        System.out.println("-----------------now arrays------------------");

        int [] score = new int [5];//means this array has 5 elements( the length)
        //if we dont give any value it will take default for int which is 0 , so there will be 5 zeros. if the data type is double then the default value is 0.0
        System.out.println(Arrays.toString(score));
        //in order for array object to be printed, we have to call toString from the array utility class Array.toString, else we will get hashcode

        String [] name = new String [5];
        System.out.println(Arrays.toString(name));
        //if we dont give any value it will take default for int which is null for string , so there will be 5 times null

        System.out.println("------------------------------------------");

        //in order to change the value of any element in an array we have to access the related index number. For example if we want to change the third value of the first array

        score [2] = 78;// it will be the updated value at index 3
        System.out.println(Arrays.toString(score));
        //now if we want to change value at index 0 then:
        score [0] = 85;
        System.out.println(Arrays.toString(score));

        score [1] = 75;
        System.out.println(Arrays.toString(score));

        score [3] = 88;
        System.out.println(Arrays.toString(score));

        score [4] = 95;
        System.out.println(Arrays.toString(score));

        // now how if we assign value outside the index for the array?
       // score[5] =97;
        System.out.println(Arrays.toString(score));
        //we will get index out of bound error, so this means once the array size is fixed then it can not be changes, though the element can be changed but not the size.
        // now if we re-assign the array object for example:

       // score= new int[10];
        //the previous array object and values will be eligible for garbage collection and the new values if we dont give will be 10 zeros, because in Java codes are executed from top to bottom

       // System.out.println(Arrays.toString(score));

        //no to access a specific element for any array, we need to provide the given index number and that will return us the given element.

        System.out.println(score[2]);

        System.out.println("----------------------------------------");
        //now in order to access each element we can use loop

        for (int i = 0; i < score.length; i++) {//will start from index zero to length
            System.out.println(score[i]);


            System.out.println(score[score.length-1]); //in order to get the element at the last index

        }











    }
}

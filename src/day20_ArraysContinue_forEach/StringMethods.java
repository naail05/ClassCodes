package day20_ArraysContinue_forEach;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class StringMethods {

    public static void main(String[] args) {
        System.out.println("----------toCharArray method---------------");
        String str = "Cydeo School";
        // if we want every character fom the above string and want to save it to a data structure and then toChar is the best method to use
       // char[] ch = str.toCharArray();
        // [C, y, d, e, o,  , S, c, h, o, o, l]
        // when we want to remove the paces which would be between words in a string, we can use str.replace(" ", "").toCharArray(): the output will be as: [C, y, d, e, o, S, c, h, o, o, l], with no paces in between
        char[] ch = str.replace(" ","").toCharArray();
        System.out.println(Arrays.toString(ch));

        System.out.println("----------split method---------------");
// through this method we will get every word separately without any space
        String str2 = "Today is a great day to learn java";

        String [] words = str2.split(" ");
        System.out.println(Arrays.toString(words));
// we can remove the spaces between words or can split the string wherever we want for example we want to split it at "great" in above example

        String[] words2 = str2.split("great");
        System.out.println(Arrays.toString(words2));

        System.out.println("----------reverse sentence-------------");
      String sentence = "I love Java";
      // the result should be as " Java love I"
        String [] words22 = ArraysUtility.reverse(sentence.split(" "));
        //now that we got an array so we can simply reverse is through reverse method. We will get an array as: [Java, love, I]

        System.out.println(Arrays.toString(words22));

        // now to get the "Java love I" result
        String revWords22 = "";
        for (int i = 0; i < words22.length; i++) {
            revWords22 += words22[i] + " ";
            
        }
        System.out.println(revWords22);

        System.out.println("-----------------------------------------------");

        String[] b1 = {"C", "A", "B"};
        String[] b2 = {"B", "C","A"};
        Arrays.sort(b1);
        Arrays.sort(b2);
        System.out.println(Arrays.equals(b1, b2));// now the result will be true as they will be n the same order

        System.out.println("-----------------------------------------------");
        String[] students = {"Yaxier", "Madiyar", "Ali", "Abidullah","Alena"};
        Arrays.sort(students);// the sorting will be based on the alphabetical order as A will be the first and B will be second and so on as the data on ascii table are taken into account and when first characters are same then second characters will be matched
        System.out.println(Arrays.toString(students));

        System.out.println("---------------copyOf() method-------------------");

        int [] array = {10, 20, 30, 40, 50, 60, 70};

        int[] array2 = Arrays.copyOf(array,array.length);
        // this copies the first array and assigns it to this array
        System.out.println(Arrays.toString(array2));


        System.out.println("------------using copyOf() method to merge------");

        int[] n1 ={1,2, 3, 4, 5};
        int[] n2 = {6, 7, 8, 9, 10, 11, 12};

        int [] n3 =Arrays.copyOf(n1, n1.length+n2.length);
        // here we copied array one to array three and set the length of the array 3 as the length of array1+ length of array2
        for (int i = 0, j=n1.length; i < n2.length; i++,j++) {

            // i is the index number of second array. j here represent the index number from where the second array need to start( or the remaining index of the third array)

            n3[j] = n2[i];// here we get the elements of the second array and assign them to the third array


        }
        System.out.println(Arrays.toString(n3));

        System.out.println("------------ copyOf()  range method ------");
        // this method is used when we want to copy a portion of an array and the copy need not to start from the first element.
        char[] ch22= {'A', 'B', 'C', 'D', 'E', 'F', 'G'};
        char[] result = Arrays.copyOf(ch22,4);
        //this copyOf() starts from the first element till 4th element
        System.out.println(Arrays.toString(result));
        // so here we will get from element 1 to element 4

        char[] ch33 = Arrays.copyOfRange(ch22,2,6);//excluding last index
        System.out.println(Arrays.toString(ch33));

        char[] ch44 = Arrays.copyOfRange(ch22,2,ch22.length);//this will copy from second index till last index
        System.out.println(Arrays.toString(ch44));









    }
}

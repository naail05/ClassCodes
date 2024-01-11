package day11_StringsContinue;

public class StringMethods1 {

    public static void main(String[] args) {


        String str1 = " JAVA PROGRAMMING";

        str1 = str1.toLowerCase();//as string is immutable, so this creates a new string out the above used as reference, but in lower case, or will return lowercase version of the first string, as here we assigned a new value to this string
        System.out.println(str1);


        System.out.println("--------------To Uppercase------------------");

        str1 = str1.toUpperCase();// this comes up with the uppercase version of the previous and assigns it to str1, a new string. if string was not immutable then we wouldnt need to assign back to the variable, it is the immutability of the string that is causing this
        System.out.println(str1);

        System.out.println("--------------Trim method, removing white spaces----------");

        String word = "    Cydeo School    ";
        word = word.toLowerCase();//reassigning to a new object the lowercase one
        System.out.println(word);
        word = word.toUpperCase();//reassigning to a new object the uppercase one
        System.out.println(word);
        word = word.trim();// this method remove the "White Spaces", spaces which are not required or used for any purpose, mean the spaces before and after a word not the spaces between words, by creating a new string, like in the "   Cydeo School  " the spaces before Cydeo  and after school
        System.out.println(word);


        System.out.println("------indexOf() and lastIndexOf()----- ------------");
        System.out.println("returning or counting the index number of specific character you give:");

        String sentence1 = "Today is Sunday, and we have Java live Review class";
       int l= sentence1.length();// this gives us the length of the given sentence
       System.out.println(l);
       int indexNum= sentence1.indexOf("as");// it checks from left to right and returns the index of the first matching character
        System.out.println(indexNum);

        String sentence2 = " I like Java programming";

        // what if we want to find the index number of the other character not the first prevailing
        int indexNum2 = sentence2.indexOf("in");
        System.out.println(indexNum2);

        String s22 = "Java Python JavaScript Python Cydeo ";
       int l1 = s22.length();
        System.out.println(l1);
        int a1 = s22.indexOf("o ");// now that we have more than one 'o' characters here so we are trying to specify the desired 'o' in this case o from Cydeo so after that  there is space, so we add space after o and we will get the index number for the desired 'o'
        System.out.println(a1);
        int a2 = s22.lastIndexOf('o');// its the same as indexOf, but the difference is it starts from right to left
        System.out.println(a2);




    }
}

package day17_ClassAndObjectIntro;

public class Task1_uniqueCharacters1 {

    public static void main(String[] args) {

        String str = "aabcccd";
        String unique = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(str.indexOf(ch)==str.lastIndexOf(ch)){// to determine if the character is unique or not, here we are verifying each number.this returns us the index number of first time and last time appearance of the character in the string, so when they are equal means that character is unique

                unique +=ch;
            }


        }
        System.out.println("unique = " + unique);


    }
}
/*

 Write a program that can find the unique characters from a String
			Ex:
				str = "aabcccd"

				output:
					bd
 */


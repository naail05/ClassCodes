package day17_ClassAndObjectIntro;

public class Task1_uniqueCharacters2 {

    public static void main(String[] args) {
        String str = "aabcccd";
        String unique = "";




        for (int j = 0; j < str.length(); j++) {
            char  ch = str.charAt(j);
            int frequency = 0;




        for (int i = 0; i < str.length(); i++) {// this shows how many times ch has appeared in the given str
            if(str.charAt(i)==ch){// if the ch has appeared in the str
                frequency++;// increase the frequency by 1
            }


        } if(frequency ==1){

            unique +=ch; //if frequency is one, then its unique character
        }}
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

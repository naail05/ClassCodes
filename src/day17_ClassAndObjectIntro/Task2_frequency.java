package day17_ClassAndObjectIntro;

public class Task2_frequency {

    public static void main(String[] args) {

        String str = "aabcccd";

        String result ="";// a2b1c3d1




        // now in order to know the frequency of the first character we need to compare it with each character of the string, for that purpose we need loop

        for (int j = 0; j < str.length(); j++) {
            int count = 0;
            char ch = str.charAt(j);// this finds the frequency of the first character



        for (int i = 0; i < str.length(); i++) {
          if( str.charAt(i)==ch){// means whenever the given character appeared in the string then increase the count by one
              count++;
          }

        } if(result.contains(""+ch)){// means if the character is already in the result then ignore it or do not include it again or skip it
            continue;}
        result +=  ch + ""+count;

        }
        System.out.println("result = " + result);






    }
}
/*
Write a program that can find the frequency of the characters from a string

                Ex:
                        str = "aabcccd";

                        output:
                                a2b1c3d1

 */
package day15_whil_LoopsContinue;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String str = "aaaabbbbbcccc";
        String result = "";// this variable should contain the new string (abc) with no repetition

        for (int i = 0; i < str.length(); i++) {// i represents the index number of str
            //System.out.println(str.charAt(i));
            char each = str.charAt(i);// each character of the string
            if(!result.contains(""+each)){result += each;}// we added "" because works with string, so then we will have string. Also if the string result does not contain the character of the string yet then we will add the character to the string

        }
        System.out.println(result);


        System.out.println("----------------------------------------");

        //find the sum of all the even number between  50~100

        int result1 = 0;

        for (int i = 20; i <81 ; i++) {
            if(i%2==0){
                result1 += i;
            }

        }
        System.out.println(result1);

        int result2 = 0;

        for (int i = 20; i <81 ; i +=2) {

                result2 += i;
            }

        System.out.println(result2);

        int result3 = 0;

        for (int i = 20; i <81 ; i++) {
            if(i%2 !=0){continue;}// if the 'i' value is odd number then skip it

            result3 += i;
        }

        System.out.println(result3);


    }
}
/*
 Write a program that can remove the duplicated characters from the a string

				Ex:
					str = "aabbbcccc"

					output:
						abc

 */
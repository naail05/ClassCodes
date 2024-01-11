package day15_whil_LoopsContinue;

public class RemoveDuplicates2 {

    public static void main(String[] args) {

         String str = "xyzxyzxyz";
         String result = "";
        for (int i = 0; i < str.length(); i++) {

            if(result.contains(""+str.charAt(i))){// this means if the new string already contains the character then we skip it. we added "" to somehow convert char to string as contains work with string
                continue;
            }
            result += str.charAt(i);
        }
        System.out.println(result);
    }
}
/*
 Write a program that can remove the duplicated characters from the a string

				Ex:
					str = "aabbbcccc"

					output:
						abc

 */
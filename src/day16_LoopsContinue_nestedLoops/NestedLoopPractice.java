package day16_LoopsContinue_nestedLoops;

public class NestedLoopPractice {

    public static void main(String[] args) {



    String str = "aaabbccccddeeeeff";
    String result = "";// will get bdf from the above example


        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);//find the frequency of each character
            int count =0;

            for (int i = 0; i < str.length(); i++) {//responsible for comparing ch to each character of str and return the frequency of ch
                if(str.charAt(i)==ch){
                    count++;
                }


            }
            if(count==4 && !result.contains(""+ch)){// this gives us the characters repeated for 4 times in tis case and avoids the duplication
                result +=ch;
            }


        }
        System.out.println(result);

    }
}

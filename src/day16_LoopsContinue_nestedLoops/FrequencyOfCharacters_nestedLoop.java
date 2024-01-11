package day16_LoopsContinue_nestedLoops;

public class FrequencyOfCharacters_nestedLoop {


    public static void main(String[] args) {
        String str = "AAABCCCCDDDDD";
        String result = "";


        // now in order to know the frequency of the first character we need to compare it with each character of the string, for that purpose we need loop

        for (int j = 0; j < str.length(); j++) {
            int count = 0;
            char ch = str.charAt(j);// this finds the frequency of the first character


            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ch) {// means whenever the given character appeared in the string then increase the count by one
                    count++;
                }

            }
            if (result.contains("" + ch)) {// means if the character is already in the result then ignore it or do not include it again or skip it
                continue;
            }
            result += ch + "" + count;

        }
        System.out.println("result = " + result);
    }
}









/*

Frequency of characters:
        "AAABBCCCCDDDDD"
        output:
            A3B2C4D5
 */
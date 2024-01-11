package Utilities;

public class StringUtility {
    // whatever methods of String we are going to creat after this, wil save it in this class for future use.

    public static String reverse2(String str2){

        String reverse2 = "";// this will contain all the characters of the given string in reverse order
        for (int i = (str2.length()-1); i >= 0; i--) {// i: index number of the given string starting from last index to index zero
            reverse2 += (str2.charAt(i));}// we used char method here to get each character of the string, starting from last index to index zero
        return reverse2;}// we return it so that we can reuse it next time.

    public static String reverse(String str){
        String reverse = " ";
        for (int i = str.length()-1; i>=0; i--) {// here we are subtracting thats why i is i--
            reverse += str.charAt(i);

        }return reverse;
    }

    public static String unique (String str){
        String unique = "";

        char ch = str.charAt(0);


        for (int j = 0; j < str.length(); j++) {
            ch = str.charAt(j);
            int frequency = 0;


            for (int i = 0; i < str.length(); i++) {// this shows how many times ch has appeared in the given str
                if(str.charAt(i)==ch){// if the ch has appeared in the str
                    frequency++;// increase the frequency by 1
                }

            } if(frequency ==1){
                unique +=ch; //if frequency is one, then its unique character
            }}
        return unique;

    }

    public static String frequency (String str){

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
        return result;

    }

    }

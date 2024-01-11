package day14_forLoop_Overloading;

public class Task1 {

    public static void main(String[] args) {

        combine("two","one");
        String word =combine1("five","one");
        System.out.println(word);

        String word2 = combination("life","elafent");
        System.out.println(word2);




    }
    public static void combine (String word1, String word2){
        if(word1.charAt(word1.length()-1)== word2.charAt(0)){
            System.out.println(word1+word2.substring(1));} else{
            System.out.println(word1+word2);}

    }

    public static String combine1 (String word1, String word2){
        String result ;

        if(word1.charAt(word1.length()-1)== word2.charAt(0)){
           result=(word1+word2.substring(1));} else{
          result=(word1+word2);}
    return result;}

    public static String combination ( String str1, String str2){
        String result1 ;
        if(str1.endsWith((""+str2.charAt(0)))){// the empty"", without space ,changes chatAt value to a string, as endWith only accept string, thats why we convert it to string
            result1 = str1+str2.substring(1);}else{
            result1 =str1+str2;}
        return result1;

    }


}

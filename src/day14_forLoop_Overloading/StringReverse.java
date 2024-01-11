package day14_forLoop_Overloading;

public class StringReverse {
    public static void main(String[] args) {
// need the reverse of the string Java which will be avaJ
                   String str = "Java";
        // the index numbers are 01234

        String reverse = "";
        for (int i = 3; i >= 0; i--) {
            reverse += (str.charAt(i));// we are doing concatenation to add the reversed value or version

        }
        System.out.println(reverse);// this for the given word, means when we know the word, now how if we want to have a general formula then

        System.out.println("--------------------------------------");

        String name = " Emrek Keneshkovich Apazov";// reverse this string using the specified method
        String result = reverse2(name);
        System.out.println(result);
// for re-usability we will use custom method


    }
    public static String reverse2(String str2){

        String reverse2 = "";
        for (int i = (str2.length()-1); i >= 0; i--) {
            reverse2 += (str2.charAt(i));}
        return reverse2;

    }
}

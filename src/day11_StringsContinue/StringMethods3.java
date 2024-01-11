package day11_StringsContinue;

public class StringMethods3 {

    public static void main(String[] args) {
        //The remaining methods will return boolean value which are isEmpty, isBlank, equals(), equalsIgnoreCase(), contains(), startsWith(), endsWith()

        //1) isEmpty, will return if it has no value, else it will return false

        String word = "Java";
        boolean r1 = word.isEmpty();
        System.out.println(r1);// this will return false as there is value in the given string


        //1) isBlank, will return true if it has  spaces only not any other characters, else it will return false
        //1) isEmpty, will return true if it has no value, else it will return false, it doesnt take into account space
        String word1 = " ";//1) isEmpty, will return if it has no value, else it will return false
        boolean r2 = word1.isEmpty();
        boolean r3 = word1.isBlank();
        int l = word1.length();//as long as the length is not zero, then the string is not empty
        System.out.println(l);
        System.out.println("r2 = " + r2);;// the return will be false as its not empty and  have space
        System.out.println("r3 = " + r3);;// the return will be true as there are no characters, but only space, so it is blank


        System.out.println("------------equals Method-----------------------");
        //checks if the two strings has the same text. return is boolean. the result will be true as long as they have same characters, doesnt matter if they are different objects. Need to mention that it can not ignore case sensitivity, as Java is case-sensitive. Use .equals method not the == operator

        String str1 = "Cydeo";
        String str2 = new String("Cydeo");
        String str3 = new String("cydeo");
        boolean result = str1.equals(str2);
        System.out.println(result);// though they both are different objects, but characters are same that is why the return is true.
        System.out.println(str1.equals(str3));// the result will be false as the difference is the case sensitivity, though texts are same , but with upper and lower case that is why result is false

        System.out.println("------------equalsIgnoreCase Method-----------------------");
        //checks if the two strings are equal without case sensitivity, it ignores the case sensitivity
        System.out.println(str1.equalsIgnoreCase(str3));// the result is true as both the texts are same though there is case sensitivity, but this method ignores the case sensitivity

        String s1 = "JAVA";
        String s2 = "java";
        System.out.println(s1.equalsIgnoreCase(s2));

        System.out.println("------------contains Method-----------------------");
        // checks if the given value, str is contained in the string. return is a boolean value

        String sentence11 = "My favorite programming languages are : c++, Java, JavaScript";
        //check if the sentence contains "Python"//the result will be false as it does not include

        System.out.println(sentence11.contains("Python"));

        String students = "Ahmad, Nasim, sayed, Noumen";
        boolean hasNaail = students.contains("Naail");
        System.out.println("hasNaail = " + hasNaail);;// the result is false as it does not include Naail in the students names

        String sentence23 = "My favorite programming language is JAVA";
        boolean hasJava = sentence23.contains("java");
        System.out.println("hasJava = " + hasJava);
        boolean has_java = sentence23.toLowerCase().contains("java");
        System.out.println("has_java = " + has_java);;// the result will be false as there is case difference and as is known Java is a case-sensitive language


        System.out.println("------------startsWith Method-----------------------");
        //startsWith (str): checks if the string is started with a given str. returns boolean

        String input = "Cybertek school is the best";
        boolean startsWithCybertek= input.startsWith("Cybertek");
        System.out.println("startsWithCybertek = " + startsWithCybertek);




        System.out.println("------------endsWith Method-----------------------");
        //endsWith (str): checks if the string is ended with a given str. returns boolean
        boolean endsWithbest = input.endsWith("best");
        System.out.println("endsWithbest = " + endsWithbest);
        // it should be taken into account that both starts with and ends with does not ignore case-sensitivity and when the cases are different, the boolean return will be false.

        String email = "CydeoSchool@gmail.com";
        boolean isGmail = email.endsWith("gmail.com");
        boolean isHotmail = email.endsWith("hotmail.com");
        boolean isYahoo =  email.endsWith("yahoo.com");
        System.out.println("isGmail = " + isGmail);
        System.out.println("isHotmail = " + isHotmail);
        System.out.println("isYahoo = " + isYahoo);





    }
}

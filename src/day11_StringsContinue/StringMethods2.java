package day11_StringsContinue;

public class StringMethods2 {

    public static void main(String[] args) {
        System.out.println("------------Replace Method-----------------------");

        String sentence = "I like Python, Python is the best programming language, and Python is in high demand";
        sentence = sentence.replace("Python", "Java");// here what ever we want to change in the earlier string and come-up with a new string we need to add or write that character or value first and then the new one and re-assign i to the given variable

        System.out.println(sentence);

        // we can replace on character as well with this method

        String word = "java";
        word = word.replace("j","J");//here we are replacing lowercase j with uppercase J, as this is one character, so this can also be done through char ' ' method
        System.out.println(word);

        System.out.println("------------Replace first Method-----------------------");
        //the difference is this one will replace only the first matching one while replace will replace all the matching ones

        String sentence2 = "I love Java, Java is cool";
        sentence2 = sentence2.replaceFirst("Java ","Python ");// replaces the first matching only


        System.out.println(sentence2);
        sentence2 = sentence2.replace("Java","Python ");//replaces all the matchings in the string with a new value and creates  a new string/ object
        System.out.println(sentence2);

        //through replace first we can replace any character or word not just the first, but for that we need to do some modification as we did in the case of indexOf, like adding the next character or after the desired on to make it special
        String sentence3 = "Java is fun, Java is cool, Java is amazing";
        sentence3 = sentence3.replaceFirst(", Java",", Python");
        System.out.println(sentence3);

        System.out.println("------------substring Method-----------------------");
        // this method is little challenging , but important method of the string
        // there are two types of substring    1)substring(beginningIndex, endingIndex)which creates substring from the given beginning index till the given ending index     and 2) substring (beginningIndex) which creates substring from the given beginning index till the end of the string, here as well the return will be a new string

        String sentence4 = "I love Java programming";
        //first we will use the first type of substring, here we want to creat a sub-string with the value "Java" from the above string
        String languageName = sentence4.substring(7, 10+1);// 7 is the beginning index for Java, the character J, and 10 is the last but if we give the index for the last then it will not take that value, therefor we need to add to the last index number to be included in the substring
        System.out.println(languageName);

        String sentence5 = "Today is Sunday, Tomorrow is Monday";// we need Sunday from this string
        String day = sentence5.substring(9,14+1);
        System.out.println(day);

        //now want to use indexOf and lastIndexOf instead of counting for substring

        String email = "CydeoSchoolJavaProgramming@yahoo.com";// need to creat a substring to return us the domin in this example
        int index1 = email.indexOf('@')+1;//to find the beginning index, we added one as index starts from zero
        int index2 = email.indexOf("o.")+1;//to find the ending index, here we are specifying/modifying as there are many o characters, so to get the desired last character, o in this case. here we added one as substring doesnt include the last character, so here its going to be "." now which we dont want
        System.out.println(index1);
        System.out.println(index2);
        String domin = email.substring(index1,index2);
        System.out.println(domin);


       // 2) substring (beginningIndex) which creates substring from the given beginning index till the end of the string, here as well the return will be a new string
        String sentence6 = "Java is fun, Java is cool, Java is amazing";
        int begnningindex = sentence6.indexOf("l, J")+3;
        String sentence7 = sentence6.substring(begnningindex);
        System.out.println(sentence7);

        String sentence8 = "I love Java programming";
        int indexbeg = sentence8.indexOf('J');
        String sentence9 = sentence8.substring(indexbeg);
        System.out.println(sentence9);


        System.out.println("------------repeat Method-----------------------");
        //repeats the string for a given number of times, the result is a new string

        String str = "Python";
        String result =(str+"\t").repeat(10);//this \t adds the spaces, else the result will come the required times without any space
        System.out.println(result);// now the result will include Python 10 times














    }
}

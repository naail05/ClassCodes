package day10_Scanner_StringIntro;


import java.util.Scanner;
import java.lang.String;


public class StringIntro {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String str = "Java";// import statements for String and System are provided implicitly by java and if we dont provide manually we will not get compile error while Scanner will get compile error if we dont have import statement. The import statement for String is (import java.lang.String)
        //classes from lang package will not need import state ment, while files from other packages will need import statement
        System.out.println("----------------------creating String by using string literal--------");
        input.close();
        System.out.println("---------------------------------------------------------");
        String s1 = "Cat";
        String s2 = "Dog";//they are string literal objects which will be saved in special area of memory heap called " string pool" and string pool doesnt save duplicated objects
        String s3 = "Cat";
        String s4 = "Cat";//one advantage of creating objects though string literal is that when objects created are same as s1 and s3 and s4 only once it will be saved in the memory and shared

        //now if we compare them:
        System.out.println(s1==s3);
        System.out.println(s1==s4);
        System.out.println(s3==s4);
        //stack is the memory where all the local variables (variables created within main method) are saved

        System.out.println("----------------------creating String by using new Keyword---------");

        String str1 = new String();
        String str2 = new String(); // when you want to save something even in this method you have to use string literal as for example
        String str3 = new String("Java");// as string literal is used so this will be saved on string pool and due to the usage of new keyword it will be saved in heap memory outside the string pool, so technically there will be two entries at this point.(creating two objects at different locations), but as long as they are same there will be only one entry in pool while many in the heap/depending upon the number of strings created.

        String str5 = new String("Java");//for this the reference will from the heap not string pool
        String str6 = new String("Java");
        System.out.println(str5==str6);//result will be false as there will be two different object and in different memories;

        System.out.println("---------------------------------------------------------");
        String t1 = "Python";
        String t2 = new String("Python");
        System.out.println(t1==t2);// result will be false as they are going be treated as different objects due to their locations of memory and nature of creation. This equal operator compares the object not the values in those objects. for comparing the values in those objects we use other methods as equals(0

    }


}

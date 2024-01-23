package day40_Collections;

import Utilities.StringUtility;

import java.util.*;

public class RemovePalindromes {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Java", "Python", "Cydeo", "Car", "Level", "civic", "radar", "kayak", "reviver", "racecar","madam"));
        //write a program that can remove the palindrome from the above Arraylist, do not use lambda expression

        //first step is we need to have iterator
        Iterator<String> it = names.iterator();
        while (it.hasNext()){
            String each = it.next();
            String reverse = "";
            for (int i = each.length()-1 ;i>=0; i--) {
                reverse += each.charAt(i);

            }
            if (each.equalsIgnoreCase(reverse))
                it.remove();

        }
        System.out.println("names = " + names);

        System.out.println("-----------remove with lambda expression------------");

        List<String> names1 = new ArrayList<>();
        names1.addAll(Arrays.asList("Java", "Python", "Cydeo", "Car", "Level", "civic", "radar", "kayak", "reviver", "racecar","madam"));
        //write a program that can remove the palindrome from the above Arraylist,  using lambda expression

       names1.removeIf(p-> StringUtility.reverse2(p).equalsIgnoreCase(p));
     //   names1.removeIf(p-> new StringBuilder(p).reverse().toString().equalsIgnoreCase(p));//here we are using stringbuilder as string does not have reverse method, once we used the reverse method, we use toString to change back to string

        System.out.println("names1 = " + names1);

    }
}

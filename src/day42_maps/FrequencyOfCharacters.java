package day42_maps;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        String str = "bbcccaaaaa";//as character can not be duplicated, so we can make them as key
        //Also to find the frequency, we only can do that if we convert this string to collection, which has frequency method. what we can do is convert this to a String array and then it can be converted to collection type

        Map<Character, Integer> map = new LinkedHashMap<>();// here we are using linkedHashMap as we want our output in specific (insertion) order

        for (String each : str.split("")) {
            int frequency = Collections.frequency(Arrays.asList(str.split("")),each);//now that frequency method it takes one collection type and one object and then return the frequency of that object from the given collection, now that we converted the string to array(str.split("), so now we can pass it as collection (array.as list) and get frequency of each
            System.out.println(each +" : "+ frequency);

            //now need to add those characters and frequencies to the mpa via put method
            map.put(each.charAt(0), frequency);//here we did charAt(0) to convert each to Character from string as our key needs to be character, we put index as zero as there is only one character in string(split)

        }
        System.out.println("map = " + map);


    }
}
/*

1. Write a program that can return the frequency of characters
            Not: MUST use map

                Ex: str = "bbcccaaaaa"

                output:
                    {b=2, c=3, a=5}
 */
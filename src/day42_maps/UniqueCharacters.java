package day42_maps;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class UniqueCharacters {

    public static void main(String[] args) {

        String str = "aabcccdeeeef";


        Map<Character, Integer> map = new LinkedHashMap<>();// here we are using linkedHashMap as we want our output in specific (insertion) order

        for (String each : str.split("")) {
            int frequency = Collections.frequency(Arrays.asList(str.split("")), each);
            if(frequency==1)//here we are checking if the frequency is 1 then we add that character to out map
            map.put(each.charAt(0), frequency);
            }


        System.out.println("map = " + map);
    }
}
/*
 Write a program that can find the unique characters from a String
	              Not: MUST use map
	            Ex:
	                    str = "aabcccdeeeef";

	            output:
	                    {b=1, d=1, f=1}

 */
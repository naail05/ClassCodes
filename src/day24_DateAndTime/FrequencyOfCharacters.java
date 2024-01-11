package day24_DateAndTime;

import java.util.Arrays;
import java.util.Collections;

public class FrequencyOfCharacters {

    public static void main(String[] args) {


        String str ="aaabbbbccccc";//a3b4c5
      String result = "";
      for (String each : str.split("")) {// this will change string to an array
        int frequency =Collections.frequency(Arrays.asList(str.split("")), each);// here we converted array which we got to arraylist
      if(!result.contains(each)){// this condition is added to avoid duplication of any character in this case
          result +=each+frequency;
      }
      }
        System.out.println(result);


    }
}

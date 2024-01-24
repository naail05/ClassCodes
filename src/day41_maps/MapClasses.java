package day41_maps;

import java.util.*;

public class MapClasses {

    public static void main(String[] args) {

        //in order to create an object, we need to create it from the child classes, not Map itself as it is interface

        Map<String, Integer> map = new HashMap<>();//keeps random order
        //Map wants two inputs, Key and the value for the key, here we Specified key as String and value as Integer. Also it accepts null value in the key

        Map<String, Integer> map1 = new Hashtable<>();//maintains random order and does not accept null value in the key, also is synchronized
        Map<String, Integer> map2 = new LinkedHashMap<>();//keeps insertion order, accept null value in the key
        Map<String, Integer> map3 = new TreeMap<>();//is in sorted order, does not accept null value in the key
        //above are te classes which have is a relationship with map, from which we can create object

        System.out.println("----------Storing data in the HashMap-----------------");

        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Daniel", 95000);//as we specified key as String and value as Integer, so they are the only data type( and order) that will be accepted
        hashMap.put("Emily", 100000);//each one is a pair of data
        hashMap.put("Bella", 85000);//size of map will be determined, based on the number of these pairs we add (where size of map is dynamic and can be increased or decreased)
        hashMap.put("Bella", 95000);
        hashMap.put("Bella", 105000);//though we put three different for the same key "Bella" in this case, we will have only one, which will be the last one

        System.out.println("hashMap = " + hashMap);//will give us the result based on a random order, as HashMap maintains random order

        hashMap.put("Emily", 110000);// this way we can update the value of a given key, here we are updating the value of key"Emily"

        //we can include null value for both the key and value
        hashMap.put("Chris", null);
        hashMap.put("Breanna", null);//null is accepted in the value and can be multiple values as null
        hashMap.put(null,120000);
        hashMap.put(null,110000);
        hashMap.put(null,100000);//here we put three keys as null, but only one and that is the last inserted will be accepted
        System.out.println("hashMap = " + hashMap);

        System.out.println("----------Storing data in the LinkedHashMap-----------");

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Daniel", 95000);//
        linkedHashMap.put("Emily", 100000);
        linkedHashMap.put("Bella", 85000);
        linkedHashMap.put("Bella", 95000);
        linkedHashMap.put("Bella", 105000);//though we put three different for the same key "Bella" in this case, we will have only one, which will be the last one
        linkedHashMap.put("Emily", 110000);// this way we can update the value of a given key, here we are updating the value of key"Emily"

        //we can include null for  value
        linkedHashMap.put("Chris", null);
        linkedHashMap.put("Breanna", null);//null is accepted in the value and can be multiple values as null
        //putting null as the value for key
        linkedHashMap.put(null,120000);
        linkedHashMap.put(null,110000);
        linkedHashMap.put(null,100000);//here we put three keys as null, but only one and that is the last inserted will be accepted

        System.out.println("linkedHashMap = " + linkedHashMap);//insertion order will be preserved here in the linkedHashMap

        System.out.println("----------Storing data in the TreeMap-----------");
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Daniel", 95000);//
        treeMap.put("Emily", 100000);
        treeMap.put("Bella", 85000);
        treeMap.put("Bella", 95000);
        treeMap.put("Bella", 105000);//though we put three different for the same key "Bella" in this case, we will have only one, which will be the last one
        treeMap.put("Emily", 110000);// this way we can update the value of a given key, here we are updating the value of key"Emily"

        //we can include null for  value
        treeMap.put("Chris", null);
        treeMap.put("Ahmad", 120000);
        treeMap.put("Breanna", null);//null is accepted in the value and can be multiple values as null

       /**
        * putting null as the value for key
        treeMap.put(null,120000);
        treeMap.put(null,110000);
        treeMap.put(null,100000);//here we put three keys as null which are creating nullPointerException, so we can not assign null value to the key in treeMap
        */

        System.out.println("treeMap = " + treeMap);//also worth mentioning the values will be in (sorted) ascending order, from small to the bigger value

        System.out.println("----------Storing data in the Hashtable-----------");
        Map<String, Integer> hashtable = new Hashtable<>();
        hashtable.put("Daniel", 95000);//
        hashtable.put("Emily", 100000);
        hashtable.put("Bella", 85000);
        hashtable.put("Bella", 95000);
        hashtable.put("Bella", 105000);//though we put three different for the same key "Bella" in this case, we will have only one, which will be the last one
        hashtable.put("Emily", 110000);// this way we can update the value of a given key, here we are updating the value of key"Emily"
        hashtable.put("Ahmad", 120000);


        /**
         * putting null as the value for key and value
         hashtable.put(null,120000);
         hashtable.put(null,110000);
         hashtable.put(null,100000);//here we put three keys as null which are creating nullPointerException, so we can not assign null value to the key in hashTable

         hashtable.put("Chris", null);
         hashtable.put("Breanna", null); at the same time null is not accepted in the value as well for hashtable
         */

        System.out.println("hashtable = " + hashtable);// here the order will be random


    }
}

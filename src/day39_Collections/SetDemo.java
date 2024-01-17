package day39_Collections;

import java.util.*;

public class SetDemo {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,200, 300, 40, 90));
        list.addAll(Arrays.asList(10,200, 300, 40, 90));
        list.addAll(Arrays.asList(10,200, 300, 40, 90));
        list.addAll(Arrays.asList(null, null, null, null));
        System.out.println("list = " + list);//now that here we added each elements three times, we will have three copies of each element in the list and the order will be preserved

        System.out.println("-------------------------------------------");
        Set<Integer> set1 = new HashSet<>();
        set1.addAll(Arrays.asList(10,200, 300, 40, 90));
        System.out.println("set1 = " + set1);//we get all those elements, but there order is not preserved, its random
        set1.addAll(Arrays.asList(null, null, null, null));
        set1.addAll(Arrays.asList(10,200, 300, 40, 90));// if we add these elements again, they will not be added, as Hashset does not allow duplicates
        System.out.println("set1 = " + set1);

        System.out.println("----------------------------------------");
        Set<Integer> set2 = new LinkedHashSet<>();
        set2.addAll(Arrays.asList(10,200, 300, 40, 90));
        System.out.println("set2 = " + set2);//we get all those elements, but there order is not preserved, its random
        set2.addAll(Arrays.asList(null, null, null, null));
        set2.addAll(Arrays.asList(10,200, 300, 40, 90));// if we add these elements again, they will not be added, as Hashset does not allow duplicates
        System.out.println("set2 = " + set2);

        Set<Integer> set = new TreeSet<>();
        set.addAll(Arrays.asList(10,200, 300, 40, 90));
        set.addAll(Arrays.asList(10,200, 300, 40, 90));
        set.addAll(Arrays.asList(10,200, 300, 40, 90));
        //set.addAll(Arrays.asList(null, null, null, null));it does not accept null values, as it has to call value method and compare values, when there are no value, then it will let to null pointer exception

        System.out.println("set = " + set);

        System.out.println("-----------------------------------------------");

        String [] words = {"Java", "Java", "Python", "C#", "C++", "Ruby", "C#", "C#"};//remove the duplicates from the given array
        //now there are three choices as hashset(when order does not really matter), linkedHash set( if order matter for us) and tree set (when we wan them in sorted order)

        Set<String> result = new LinkedHashSet<>();
        result.addAll(Arrays.asList(words));//here we are adding all the elements of the given array to the linkedHash set, which will remove all the duplicates
        System.out.println(result);

        //now what if we need the second non-duplicated number? as we do not have index in linkedHash set, so we do not have get method

        //either we can use for each loop to iterate to get each element
        for (String each : result) {
            System.out.println(each);
            
        }

        System.out.println("-----------------------------------");
        // Or we can convert it to list by using constructor
        System.out.println(new ArrayList<>(result).get(1));//this means that this arrayList now has all the elements of the given linkedHash set and now we can use the get method to get any given element

        System.out.println("-----------------------------------");
        //how if we want to convert it back to array then?
        words = result.toArray(new String[0]);
        System.out.println(Arrays.toString(words));
        //as array is the fastest data structure, so sometimes we would need to convert back to array

        System.out.println("-----------------------------------");
        //when we have a list, we can also convert it to hash set (or any set sub types) if we want and need, to solve problems as removing duplicates

        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(10, 10, 10, 20, 20, 30, 30, 40, 40, 40, 50, 50, 50, 5, 5, 5, 1, 1, 1, 2, 2,2,2,2));
        //task; remove all the duplicates ans sort the array in the ascending order
        SortedSet<Integer> uniqueNumbers = new TreeSet<>(numbers);// here we have added the above List to treeSet which will remove the duplicates and sort it in ascending order
        System.out.println("uniqueNumbers = " + uniqueNumbers);

        //now if we want to converted back to list we can do it as follow
        List<Integer> uniqueSortedNumbers = new ArrayList<>(uniqueNumbers);
        System.out.println("uniqueSortedNumbers = " + uniqueSortedNumbers);
        System.out.println(uniqueSortedNumbers.get(4));//it should print 20


    }
}

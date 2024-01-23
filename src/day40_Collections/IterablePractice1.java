package day40_Collections;

import java.util.*;

public class IterablePractice1 {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Ahmad", "ahmad", "John", "Ercon", "Mohammad", "Ahmad", "Ahmad", "ahmad", "Yuliia", "Chris"));
        //from the above String arraylist, remove ahmad/Ahmad

        Iterator<String> it = names.iterator();
        while (it.hasNext()){
            if (it.next().equalsIgnoreCase("Ahmad")) it.remove();
        }

        System.out.println("names = " + names);

        System.out.println("---------using remove if method-----------------");

        List<String> name = new LinkedList<>();
        name.addAll(Arrays.asList("Ahmad", "ahmad", "John", "Ercon", "Mohammad", "Ahmad", "Ahmad", "ahmad", "Yuliia", "Chris"));

        name.removeIf(p->p.equalsIgnoreCase("ahmad"));

        /**
        for (Iterator<String> it1 = name.iterator(); it1.hasNext();) {
            if (it1.next().equalsIgnoreCase("ahmad"))
                it1.remove();

        } using for loop
*/
        System.out.println("name = " + name);


        System.out.println("-------------- remove if method-----------------");

        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9));
        //find the nth largest number
       int n = 3; //lets say find the 5th largest number

        for (int i = 0; i < n-1; i++) {

            numbers.removeIf(p-> p==Collections.max(numbers));
        }
        int max = Collections.max(numbers);
        System.out.println("max = " + max);
    }
}

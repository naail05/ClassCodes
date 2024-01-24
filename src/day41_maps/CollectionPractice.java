package day41_maps;

import day33_abstraction.employeeTask.Employee;

import java.util.*;

public class CollectionPractice {

    public static void main(String[] args) {

        List<String> list;//all non-primitives are supported
        List<List<Integer>> list1 = new ArrayList<>();//nested list or list of list
        List<Set<Integer>> list2 = new ArrayList<>();//nested set or set of set
        List<Queue<Integer>> list3 = new ArrayList<>();//list of queue
        List<int[]> list4 = new ArrayList<>();//list of array
        list4.add(new int [2]);

        System.out.println("--------------------------------------------");
        List<Integer> list5 = new ArrayList<>();
        list5.addAll(Arrays.asList(1,2,3,4,5,6,7))  ;

         List<Integer> list6 = new ArrayList<>();
         list6.addAll(Arrays.asList(8,9,10,11,12,13,14));

          List<Integer> list7 = new ArrayList<>();
          list7.addAll(Arrays.asList(15,16,17,18,19));
         //now we have above two arraylist objects, can we add them to a list?
         
        List<List<Integer>> lists = new ArrayList<>();
        lists.addAll(Arrays.asList(list5,list6));//we can use add all method to add the individual lists to the list of list. Also need to mention that we can use add method as well for adding
        lists.add(list7);
        System.out.println("lists = " + lists);
         //how to get 10 from the above list
        System.out.println(lists.get(1).get(2));
        /** here first we get the individual list from which we want to access the element and then get the element by providing the index number of the given element in the individual list
         */

        System.out.println("------------------------------------------");
        //Iteration through list of list or list o set
        for (List<Integer> eachList : lists) {
            for (Integer eachElement : eachList) {
                System.out.print(eachElement+" ");
            }


        }

         System.out.println("----------------LIst of set----------------------");

        List<Set<Integer>> listOfSets = new ArrayList<>();
        listOfSets.add(new LinkedHashSet<>());
        listOfSets.add(new LinkedHashSet<>());
        listOfSets.add(new LinkedHashSet<>());   
        listOfSets.add(new LinkedHashSet<>());

        System.out.println(listOfSets.size());//it should be 4 as we stored 4 linkedHashsets
        System.out.println("listOfSets = " + listOfSets); //for now we will 4 empty sets as we ddi not really add any elements

        /**
         now will add elements to each sets, where first we need to get each individual set by using get method and then set the values
         */

        listOfSets.get(0).addAll(Arrays.asList(10,5,20));
        listOfSets.get(1).addAll(Arrays.asList(4,12,14,16));
        listOfSets.get(2).addAll(Arrays.asList(4,6,8));
        listOfSets.get(3).addAll(Arrays.asList(22,24,26,22));//as duplicates are not allowed, so will only get 22 once, while if there is duplication accross lists, then those values , will be taken
        //now let us print the listOfSets again

        System.out.println("listOfSets = " + listOfSets);

         System.out.println("----------------List of Arrays----------------------");

         int[] arr1 = {1,2,3,4};
         int[] arr2 = {5,6,7,8,9,10};
         
         List<int[]> listOfArrays = new ArrayList<>();//list of array
         listOfArrays.add(arr1);
         listOfArrays.add(arr2);
        System.out.println(Arrays.toString(listOfArrays.get(0)));
        //changing an element in the array

        listOfArrays.get(0)[2]=35;
        System.out.println(Arrays.toString(listOfArrays.get(0)));

         System.out.println("----------------List of Employees-------------------");

         List<List<Employee>> teams = new ArrayList<>();
         


    }
}

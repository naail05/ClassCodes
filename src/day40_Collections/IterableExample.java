package day40_Collections;

import java.util.*;

public class IterableExample {

    public static void main(String[] args) {
        //using iterable to remove element(s) from collection

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,1,2,3,4,5,6,7));
       /** for (Integer each : list) {
            if(each<5){
                list.remove(each);
            }
           now that for each loop has the remove method from the iterable and is hidden, so if we use it again it will lead toConcurrentModificationException
        }*/

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)<5){
                list.remove(i);
            }//as everytime an element is removed index number changes, so for next iteration there will be different index number, so there are chance that remove method of collection will not work well
        }
        System.out.println(list);

        System.out.println("-------------use iterable to remove------------------");

        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1,2,3,4,5,6,7,1,2,3,4,5,6,7));
        //now using the iterable method
        Iterator<Integer> it = list1.iterator();//from list1 we call iterator method and assign it to some variable as it
        //now we will use loop
        while(it.hasNext()){
            Integer each =it.next();//get each element through iteration
            if (each<5){
            it.remove();  }
        }

        System.out.println("list1 = " + list1);

        System.out.println("-----------use iterable to remove-for loop-----------");

        List<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,1,2,3,4,5,6,7));
        for(Iterator<Integer> i = list2.iterator(); i.hasNext(); ){

           if(i.next()<5) i.remove();
        }

        System.out.println("list2 = " + list2);


        System.out.println("---------------------use remove if -----------------");

        List<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(1,2,3,4,5,6,7,1,2,3,4,5,6,7));

        list3.removeIf(each->each<5);
        System.out.println("list3 = " + list3);


        System.out.println("----------use remove if -with linkedList--------------");
        List<Integer> linkedlist = new LinkedList<>();
        linkedlist.addAll(Arrays.asList(1,2,3,4,5,6,7,1,2,3,4,5,6,7));
        linkedlist.removeIf(p-> p<5);
        System.out.println("linkedlist = " + linkedlist);

        List<Integer> linkedlist1 = new LinkedList<>();
        linkedlist1.addAll(Arrays.asList(1,2,3,4,5,6,7,1,2,3,4,5,6,7));
        Iterator<Integer> it1 = linkedlist1.iterator();
        while (it1.hasNext()){
            if (it1.next()<5)
                it1.remove();

        }

        System.out.println("linkedlist1 = " + linkedlist1);

    }

}

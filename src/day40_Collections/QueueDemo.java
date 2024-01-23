package day40_Collections;

import java.util.*;

public class QueueDemo {

    public static void main(String[] args) {
        // Queue being the parent interface can be referenced by PriorityQueue, ArrayDeque and LinkedList
        Queue<Integer> queue1 = new PriorityQueue<>();

        Queue<Integer> queue2 = new ArrayDeque<>();

        Queue<Integer> queue3 = new LinkedList<>();

        //now that LinkedList also implements the List interface so it can be referenced by List as well
        List<Integer> queue4 = new LinkedList<>();// here it can have access to the list interface methods, if we need specific method from Linked list type poll method, then we need to do down-casting

        System.out.println("-----------------adding elements----------------------");

        Queue<Integer> queue11 = new PriorityQueue<>();
        queue11.addAll(Arrays.asList(10, 200, 300, 40, 90, 10));//allow duplicates
        System.out.println("queue11 = " + queue11);//does not accept null, with random order and allow duplication
        System.out.println(queue11.poll());//FIFO, returns the first element and remove it
        System.out.println("queue11 = " + queue11);

        System.out.println("--------------------------------------------------");

        Queue<Integer> queue22 = new ArrayDeque<>();
        queue22.addAll(Arrays.asList(10, 200, 300, 40, 90, 10));
        System.out.println("queue22 = " + queue22);// does not accept null, but allow duplicates, while insertion order is preserved
        System.out.println(queue22.poll());//FIFO, returns the first element and remove it, 10 in this case
        queue22.poll();//will remove the prevailing first element again, 200 in this case
        System.out.println("queue22 = " + queue22);
       // System.out.println(((List) queue22).get(3)); it will give us classCastException as there is no is a relationship between them

        System.out.println("--------------------------------------------------");


        Queue<Integer> queue33 = new LinkedList<>();
        queue33.addAll(Arrays.asList(10, 200, 300, 40, 90, 10, null));
        System.out.println("queue33 = " + queue33);//accept null, takes duplicates and insertion order is preserved

        System.out.println(queue33.poll());//FIFO, returns the first element and remove it
        System.out.println("queue33 = " + queue33);
        queue33.poll();// will remove the first element again, 200 in this case
        System.out.println("queue33 = " + queue33);

        //now that LinkedList is a list it accepts null keyword and has index number, which makes it distinct from other queue data structures
        System.out.println(((LinkedList) queue33).get(2));
        /**here we did casting inorder to access the get method from the linked list, as the get method is in the object type not the reference type that is why we need to do down casting*/

        System.out.println("---------------------------------------------------");
        //now that linkedList is also having is a relationship with list, so it can be referenced by list as well
        List<Integer> queue44 = new LinkedList<>();
        queue44.addAll(Arrays.asList(12, 14, 16, 18, 20, 22));



        /**
         here it will have access to all the methods in the list interface, but it want to use unique methods of the linked list as poll(), we need to do down-casting
         */
        System.out.println(queue44.get(4));

        System.out.println(((LinkedList)queue44).poll());//as poll method is in the object type, not the reference type, that is why we need to do the down-casting

       // System.out.println(((Stack)queue44).pop());, as there is no is a relationship, it will lead to ClassCastException
        Stack<Integer> stack = new Stack<>();
        stack.addAll(queue44);




    }
}

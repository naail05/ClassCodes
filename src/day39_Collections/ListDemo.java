package day39_Collections;

import java.util.*;

public class ListDemo {

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();//array based class==> get() is faster
        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(300);
        arrayList.remove(0);
        arrayList.get(0);
        System.out.println("arrayList = " + arrayList);


        List<Integer> linkedList = new LinkedList<>();//node based class (doubly linked==> inserting and deleting will be faster, add(), addAll(), remove(), removeAll(), removeIf(), retain()
        linkedList.add(100);
        linkedList.add(200);
        linkedList.add(300);
        linkedList.remove(0);
        linkedList.get(0);
        System.out.println("linkedList = " + linkedList);

        System.out.println("------------------------------------------");

        Vector<Integer> vector = new Vector<>();
        vector.add(100);
        vector.add(200);
        vector.add(300);
        System.out.println("vector = " + vector);

        vector.get(0);

        System.out.println("------------------------------------------");

        Stack<Integer> stack = new Stack<>();
        stack.add(100);
        stack.add(200);
        stack.add(300);

        System.out.println("stack = " + stack);
        stack.get(0);
       int lastElement = stack.pop();//this removes the last element and will returns us
        System.out.println("lastElement = " + lastElement);

        System.out.println("stack = " + stack);//now the last element will be removed

    }

}

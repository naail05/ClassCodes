package day22_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list);//fow now size is zero

        //Add function, to add element

        list.add(10);//this 10 will be implicitly converted to wrapper class object, so that can be supported by Arraylist
        //after calling this add method the mention arraylist size will increase by one and you can call this method over and over again

        list.add(20);// the index number of this element is 1 as arraylist is ordered
        list.add(30);//with add method one element at a time will be added
        list.add(10);//arraylist does accept duplicates
        System.out.println(list);

        //add element to a specific index(call add method(int index,integer element)
        list.add(1, 40);//adding element at index and whatever element was there at element 1 that will shift one element to the right

        System.out.println(list);
        list.add(2,25);//the element at this element will shift to the right and this element will be added in that place

        System.out.println(list);//we inserted an element, means we didnt change the old element.

        System.out.println("--------------get method----------------------");
        //get the element at fom a specified index at the array list

        ArrayList<String> studentsList = new ArrayList<>();
        studentsList.add("Mohammad");
        studentsList.add("Abdurasul");
        studentsList.add("Abidullah");
        studentsList.add("Tatiana");
        System.out.println(studentsList.size());//size is 4 in this case
        System.out.println(studentsList);
        // how to retrive the name of the first student from the mentioned arraylist. need to use get method from the array list

        String thirdStudent = studentsList.get(2);// will return as the object (string here) from the array list.
        System.out.println(thirdStudent);

        String lastStudentName = studentsList.get(studentsList.size()-1);
        System.out.println(lastStudentName);



    }
}

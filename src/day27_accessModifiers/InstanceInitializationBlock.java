package day27_accessModifiers;

public class InstanceInitializationBlock {

    public String name;
    public int age;

    /*

    {
        name = "James";
        age = 20;
        // this will set default name and age as above for the objects, and if we want to change we have call the variables again and then change
    }
*/

    public InstanceInitializationBlock(String name, int age){
        this. name = name;
        this .age = age;
    }


    public static void main(String[] args) {

        /*
        InstanceInitializationBlock obj1= new InstanceInitializationBlock();
        InstanceInitializationBlock obj2 = new InstanceInitializationBlock();
        System.out.println(obj1.name);
        System.out.println(obj1.age);

        System.out.println(obj2.name);
        System.out.println(obj2.age);// the same name and age will set for all the objects, but if we want to have separate values for name and age of every object then constructor will be a better choice
        */

        InstanceInitializationBlock obj3= new InstanceInitializationBlock("Nazir",6);
        InstanceInitializationBlock obj4 = new InstanceInitializationBlock("Rashid", 4);// here we can set separate values for each instance variables of the objects, as constructor takes parameters and here we can give arguments for those values
    }
}

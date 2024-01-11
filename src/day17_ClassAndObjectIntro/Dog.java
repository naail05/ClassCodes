package day17_ClassAndObjectIntro;

public class Dog {

    public String name;//instance variable needed for the objects. They are also known as attributes
    public String breed;
    public String size;
    public char gender;
    public int age;
    public  String color;
    // this means that whatever objects this class is going to have, all of them will have their own name, breed, size, age and color, as every object has its own memory

    //lets create our instance method

    public void setInfo (String name, String breed, String Size, char gender, int age,  String color){
        // now what we created are local variables and the variables of the class are instance variables, so we have to assign local variable to instance variable
        this.name= name;// by giving this keyword we are forcing the compiler to call the instance variable, as the instance and local variables are having the same name so compiler by default will call the local variable not instance variable

        this.breed = breed;
        size = Size;//if we have different names for instance variables and parameters or local variables then we dont need "this" keyword
        this.gender = gender;
        this.age = age;
        this.color = color;

    }



    //now we need methods(actions)

    public void eat(){
        System.out.println( name + " is eating dog food");
    }
    public void drink (){
        System.out.println(name + " is drinking water");
    }

    public String toString() {// it help us to avoid getting hashcode when we print the class object, and cover what we created to string so we can read
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}


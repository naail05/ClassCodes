package day17_ClassAndObjectIntro;

public class Dog2 {
    public String name;//instance variable needed for the objects. They are also known as attributes
    public String breed;
    public char gender;
    public int age;
    public String size;

    public  String color;
    // this means that whatever objects this class is going to have, all of them will have their own name, breed, size, age and color, as every object has its own memory

    //lets create our instance method

    public void setInfo(String name, String breed, char gender, int age, String size, String color) {
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.age = age;
        this.size = size;
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
                ", gender=" + gender +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

}

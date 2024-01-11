package day29_Inheritance.animalTask;

public class Animal {

    private String name, breed;
    private char gender;
    private String size, color;
    private int age;

    public static  boolean isAnimal = true;//example of static attribute


    public void setInfo(String name, String breed, char gender, String size, String color, int age) {
        setName(name);
        setBreed(breed);
        setGender(gender);
        setSize(size);
        setColor(color);
        setAge(age);// we used setters, so that to check the conditions( if any) we made in the set methods
    }

    public void eat(){
        System.out.println(name +" is eating");
    }

    public void sleep(){
        System.out.println(name + " is sleeping");
    }

    public void drink(){
        System.out.println(name + " is drinking water");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return getClass().getSimpleName()+"{" +// adding getClass.getSimpleName will later change the toString method name according to the child name and will not be the parent name for all
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
/*

 Animal

			attributes:
					name, breed, gender, size, color, age

			methods:
				setInfo(), eat(), sleep(), drink(), toString()
 */
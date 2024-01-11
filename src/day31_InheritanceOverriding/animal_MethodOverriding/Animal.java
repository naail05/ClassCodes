package day31_InheritanceOverriding.animal_MethodOverriding;

public class Animal {

    private String name, breed;
    private char gender;
    private String size, color;
    private int age;

    public Animal(String name, String breed, char gender, String size, String color, int age) {
        setName(name);
        setBreed(breed);
        setGender(gender);
        setSize(size);
        setColor(color);
        setAge(age);
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

    public void drink(){
        System.out.println(name+" is drinking water");
    }

    public void eat (){
        System.out.println(name+" is eating");// as there could be different implementations for this eat method, so here we will give this generic info
    }

    public void sleep(){

        System.out.println(name+ " is sleeping");

    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+ "{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}

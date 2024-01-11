package day34_abstraction.animalTask;

public abstract class Animal {

    private String name, breed;
    private final char gender;
    private String size, color;
    private int age;

    public Animal(String name, String breed, char gender, String size, String color, int age) {
        setName(name);
        setBreed(breed);
        this.gender= gender;
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

    public abstract void eat ();//making it abstract for different implementation

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

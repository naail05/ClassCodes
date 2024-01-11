package day31_InheritanceOverriding.animal_MethodOverriding;

public class Loin extends Animal{

    private boolean isAfricanLoin;

    public Loin(String name, String breed, char gender, String size, String color, int age, boolean isAfricanLoin) {
        super(name, breed, gender, size, color, age);
        setAfricanLoin(isAfricanLoin);
    }

    public boolean isAfricanLoin() {
        return isAfricanLoin;
    }

    public void setAfricanLoin(boolean africanLoin) {
        isAfricanLoin = africanLoin;
    }

    public void hunt (){

        System.out.println("Loin "+ getName()+ " is hunting");
    }

    @Override
    public void eat() {
        System.out.println("Loin " +getName()+ " is eating hunted animal");
    }



    public String toString() {
        return super.toString().replace("}","") +// here we are trying to remove the curly braces of the Animal class
                ", African Loin=" + isAfricanLoin +
                '}';
    }
}

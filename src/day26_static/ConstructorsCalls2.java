package day26_static;

public class ConstructorsCalls2 {
    public static void main(String[] args) {


        ConstructorsCalls2 obj1 = new ConstructorsCalls2();// by calling the default constructor, all the code fragments in the first constructor body will be executed

        System.out.println("------------------------------------------");

        ConstructorsCalls2 obj2 = new ConstructorsCalls2(5);// by calling the second constructor, all the code fragments in the first  as well as the second constructor body will be executed

        System.out.println("------------------------------------------");
        ConstructorsCalls2 obj3 = new ConstructorsCalls2("Naail");// by calling the third constructor, all the code fragments in the first, second  as well as the third constructor body will be executed
    }
    public ConstructorsCalls2(){

        System.out.println("Default");
    }

    public ConstructorsCalls2(int a){
        this();// by calling the first constructor we can add the code elements which are in the first constructor
        System.out.println("int arg");
    }

    public ConstructorsCalls2(String b){
        this(5);//
        System.out.println("String arg");
    }
}

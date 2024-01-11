package day28_Encapsulation.personTask;

public class Person {

    public String name;
    public int age;
    public char gender;
    public String language;

    public static String planet;
    public static boolean isHuman, hasNose;
    public static int numberOfWings, numberOfHead;

    //Add a constructor to initialize name, we can creat person object just by setting name of the person
    public Person(String name) {
        this.name = name;
    }

    //Add a constructor to initialize name and age, we can creat person object just by setting name and age of the person
    public Person(String name, int age) {
       this(name); // we are calling the constructor to avoid repetation
        this.age = age;
    }

    //Add a constructor to initialize name and language, we can creat person object just by setting name and language of the person

    public Person(String name, String language) {
       this(name);
        this.language = language;
    }

    //Add a constructor to initialize name and gender, we can creat person object just by setting name and gender of the person

    public Person(String name, char gender) {
        this(name);
        this.gender = gender;
    }

    //Add a constructor to initialize name, age and gender

    public Person(String name, int age, char gender) {
        this(name, age);
        this.gender = gender;
    }

    //Add a constructor to initialize name, age, gender, language
    public Person(String name, int age, char gender, String language) {
        this(name, age, gender);
        this.language = language;
    }

    static {

        planet = " Earth";
        isHuman = true;
        hasNose = true;
        numberOfWings = 0;
        numberOfHead = 1;
    }

    // we are making this method as static as it only includes  static variables
    public static void   printPlanetName() {
        System.out.println("Planet name: "+ planet);
    }

    public void  eat(String food ) {
        System.out.println(name +" is eating "+ food);
    }

    public void  drink (String drink ) {
        System.out.println(name +" is drinking "+ drink);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", language='" + language + '\'' +
                ", planet ='" + planet + '\'' +
                ", is human ='" + isHuman + '\'' +
                ", has nose ='" + hasNose + '\'' +
                ", number of wings ='" + numberOfWings + '\'' +
                ", number of head ='" + numberOfHead  +
                '}';
    }
}
/*

1. Create a class named Person:
			Variables:
				name, age, gender, language, planet, isHuman, hasNose, numberOfWings, numberOfHead

			Add a constructor to initialize name

			Add a constructor to initialize name and age

			Add a constructor to initialize name and language

			Add a constructor to initialize name and gender

			Add a constructor to initialize name, age and gender

			Add a constructor to initialize name, age, gender, language

			Add a static block to initialize all the statics

			Methods:
				printPlanetName()
				eat(String food)
				drink(String drink)
				toString()

 */
package day33_abstraction;

import day32_finalKeyword.personTask.Person;

import java.time.LocalDate;

public final class CydeoDevStudent extends Person {// we made it final, so that it can not be inherited anymore

    private final String id;// to make it unchangeable, we are using final Keyword
    private String batchName;
    public int batchNumber;
    public static final String programmingLanguage;

    static {// here we are setting the static variable
        programmingLanguage = "Java";
    }

    public CydeoDevStudent(String name, char gender, LocalDate dateOfBirth, String id, String batchName, int batchNumber) {
        super(name, gender, dateOfBirth);
        if (getAge()<18){// here we are setting age condition
            System.err.println("Cydeo student must be at least 18 years old");
            System.exit(1);
        }

        this.id = id;
        setBatchName(batchName);
        setBatchNumber(batchNumber);
    }

    public String getId() {
        return id;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        if (batchName.equalsIgnoreCase("batch 32") || batchName.equalsIgnoreCase("Alumni dev")){
        this.batchName = batchName;
    }else{
            System.err.println("Invalid batch name: "+batchName+" \" No such a batch in Cydeo at this time");
        }// condition for the batch name
    }

    public int getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(int batchNumber) {
        if(batchNumber<=0){
            System.err.println("Invalid batch number: "+batchNumber+"\n Batch number can not be negative or zero");
            System.exit(1);
        }
        this.batchNumber = batchNumber;
    }

    @Override
    public void eat() {
        System.out.println(getName()+ " is eating and practicing "+programmingLanguage);
    }

    @Override
    public void drink() {
        System.out.println(getName()+" is drinking coffee while practicing "+programmingLanguage);
    }

    @Override
    public void sleep() {
        System.out.println(getName()+ " has to sleep less while practice more "+programmingLanguage);
    }

    //breath() method can not be overridden as it is final


    @Override
    public String toString() {
        return super.toString().toString().replace("}","")+
                ", batch name =" + batchName +
                ", batch number =" + batchNumber +
                '}';

    }
}
/*

 Create a sub class of Person (from day32 package) named CydeoDevStudent (final)
			Extra Variables:
				id (final), batchName, batchNumber, programmingLanguage(static & final)

			Extra conditions:
					1. Age has to be at least 18 years old
					2. batchName can ONLY be set to "Zero to Hero" or "Alumni Dev"
					3. batchNumber can not be set to zero or negative

			Override the eat() & drink() methods and include the programmingLanguage variable in methods body

			Override the toString Method and include the id, batchName, batchNumber variable
 */
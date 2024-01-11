package day30_InheritanceContinue.phone;

public class IPhone extends Phone{//IPone is Is A phone(Is A relationship is created)

    public static boolean hasApplePay = true;// this variable is specific to IPone only

    public IPhone(String model, String size, double price, String color) {
        super("Apple", model, size, price, color);// here we specified the brand to apple as all the models, sizes and colors has the same brand, which is apple
    }

    public void facetime(long phoneNumber){

        System.out.println(getModel()+ " id face timing with "+ phoneNumber);

    }

    public void facetime(String email){
        System.out.println(getModel()+ " id face timing with "+ email);

    }


}
/*

Create the following sub classes of Phone:

			2.1 Iphone:
					Extra methods:
						faceTime(phoneNumber)
						faceTile(email)
 */
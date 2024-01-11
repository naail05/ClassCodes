package day30_InheritanceContinue.phone;

public class Nokia extends Phone{


    public Nokia( String model, String size, double price, String color) {
        super("Nokia", model, size, price, color);
    }

    public void selfDefence(){
        System.out.println(getBrand()+" "+getModel()+" can be used for self defence");
    }
}
/*

	2.3 Nokia:
					Extra methods:
						selfDefense()

 */
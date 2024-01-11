package day36_polymorphism_continue;

import java.util.Arrays;

public class IPhone {

    private String brand, model, size, color;
    private double price;

    public IPhone(String brand, String model, String size, double price, String color) {
        setBrand(brand);
        setModel(model);
        setSize(size);
        setPrice(price);
        setColor(color);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {

        if (price <= 0) {
            System.err.println("Invalid Price: " + price);
            System.exit(1);
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        String[] colors = {"Black", "White", "Silver", "Gold", "Pink"};
        if (Arrays.asList(colors).contains(color))// as array does not have contains method, so we somehow converted array to arraylist to utilize the contains method{
        {
            this.color = color;
        } else {
            System.err.println("Invalid color: " + color + " color of the phone can only be: " + Arrays.toString(colors));// we converted array to string in order to concat
            System.exit(1);
        }
    }


    public void call(long phoneNumber) {
        System.out.println(getModel() + " is calling " + phoneNumber);
    }

    public void text(long phoneNumber) {
        System.out.println(getModel() + " is texting to " + phoneNumber);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
/*
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof IPhone) {
            if (model.equals(((IPhone) obj).model) && color.equals(((IPhone) obj).color)) {
                return true;
            }
        }return false;
    }
*/


    public boolean equals(Object obj) {
        if (!(obj instanceof IPhone)){
            System.err.println("Invalid comparison, the object must be Iphone");
            System.exit(1);//usually it is recommended to add the pre-condition for the equals method as equals method takes any object
        }
        if (obj instanceof IPhone) {//if the given object is Iphone
            if (model.equals(((IPhone) obj).model)) {//if the model of the Iphone is equal to the given Iphone's model
                if (color.equals(((IPhone) obj).color)) {//if the color of the Iphone is equal to the given Iphone's color
                    return true;
                }
            }
        }
        return false;
    }

}
package Opd15;

public class Customer {
    private String name;
    private double discountpercentage;

    public Customer(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDiscountpercentage(double discountpercentage) {
        this.discountpercentage = discountpercentage;
    }

    public double getDiscountpercentage() {
        return discountpercentage;
    }

    public String toString() {
        return name;
    }
}

package Opd15;

public class Car {
    private String type;
    private double priceperday;

    public Car(String type, double priceperday){
        this.type = type;
        this.priceperday = priceperday;
    }

    public String getType() {
        return type;
    }

    public double getPriceperday() {
        return priceperday;
    }

    public String toString(){
        return this.type;
    }
}

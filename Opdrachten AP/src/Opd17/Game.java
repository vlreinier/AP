package Opd17;

import java.time.LocalDate;

public class Game {
    private String name;
    private int release;
    private double price;

    public Game(String name, int release, double price){
        this.name = name;
        this.release = release;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public double currentValue(){
        double value = this.price;
        for (int i = 0; i < (LocalDate.now().getYear() - this.release); i++) {
            value = value * 0.7;
        }
        if (value < 0) {
            value = 0;
        }
        return Math.round(value * 100.0) / 100.0;
    }

    public String toString(){
        return this.name + ", uitgegeven in "+ this.release + "; nieuwprijs: € "+ this.price + " nu voor:  € "+ currentValue();
    }
}

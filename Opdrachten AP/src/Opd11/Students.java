package Opd11;

import static java.lang.StrictMath.round;

public class Students {
    private int age;
    private String name,pet;
    private double[] marks;

    public Students(int age, String name){
        this.age = age;
        this.name = name;
    }

    public void setMarks(double[] marks) {
        this.marks = marks;
    }

    public double getAvgMarks() {
        double avg = 0;
        for (double i: marks){
            avg = avg + i;
        }
        return round((avg / marks.length) * 100.0) / 100.0;
    }

    public void setPet(String pet) {
        this.pet = pet;
    }
}
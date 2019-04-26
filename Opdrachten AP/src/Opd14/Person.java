package Opd14;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String to_String() {
        return this.name + "; leeftijd "+this.age+" jaar";
    }
}

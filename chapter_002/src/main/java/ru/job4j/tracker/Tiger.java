package ru.job4j.tracker;

public class Tiger extends Predator {

    public Tiger(String name) {
        super(name);
        System.out.println("Class Tiger " + name);
    }
    public static void main(String[] args) {
        Tiger tiger = new Tiger("Tiger");
    }
}

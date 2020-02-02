package ru.job4j.tracker;

public class Predator extends Animal {

    public Predator(String name) {
        super(name);
        System.out.println("Class Predator " + name);
    }
    public static void main(String[] args) {
        Predator predator = new Predator("Predator");
       }
}

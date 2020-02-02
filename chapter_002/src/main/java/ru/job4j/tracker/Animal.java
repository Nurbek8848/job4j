package ru.job4j.tracker;

public class Animal {
    String name;
    public Animal() {
        System.out.println("Animal1");
      }
    public Animal(String name) {
        this.name = name;
        System.out.println("Class Animal " + name);
    }
    public static void main(String[] args) {
        Animal animal = new Animal("Animal");
        Animal animal1 = new Animal();

    }

}

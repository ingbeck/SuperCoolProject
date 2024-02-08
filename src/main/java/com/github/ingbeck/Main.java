package com.github.ingbeck;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Rex", 5, "Bulldog");
        Animal animal2 = new Animal("Pumba", 4, "Wild Boar");
        System.out.println(animal1.equals(animal2));
    }
}
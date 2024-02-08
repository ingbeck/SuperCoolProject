package com.github.ingbeck;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Rex", 5, "Bulldog");
        Animal animal2 = new Animal("Pumba", 4, "Wild Boar");
        System.out.println(animal1.equals(animal2));

        Cow cow1 = new Cow("Betsy", 3, "Jersey", true);
        Cow cow2 = new Cow("Hanna", 5, "Jersey", false);
        Cow cow3 = new Cow("Berta", 6, "Holstein", true);

        cow1.milk();
    }
}
package com.github.ingbeck;

import java.util.Objects;

public class Cow extends Animal{

    private boolean isMilkable;

    public boolean isMilkable() {
        return isMilkable;
    }

    public void setMilkable(boolean milkable) {
        isMilkable = milkable;
    }

    public Cow(String name, int age, String breed, boolean isMilkable) {
        super(name, age, breed);
        this.isMilkable = isMilkable;
    }

    public void milk() {
        if (isMilkable) {
            System.out.println("Milked " + getName());
            setMilkable(false);
        } else {
            System.out.println(getName() + " is not milkable");
        }
    }

    @Override
    public String toString() {
        return "Cow{" +
                "isMilkable=" + isMilkable +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", breed='" + breed + '\'' +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cow cow = (Cow) o;
        return isMilkable == cow.isMilkable;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isMilkable);
    }
}

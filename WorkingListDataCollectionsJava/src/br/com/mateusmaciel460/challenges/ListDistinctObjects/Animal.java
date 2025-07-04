package br.com.mateusmaciel460.challenges.ListDistinctObjects;

public class Animal {
    private String name;
    private String owner;

    public Animal(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Animal: " + this.name + " | Dono: " + this.owner;
    }
}

class Dog extends Animal {
    public Dog(String name, String owner) {
        super(name, owner);
    }

    public void wagTail() {
        System.out.println("Abanando o rabo");
    }
}

class Cat extends Animal {
    public Cat(String name, String owner) {
        super(name, owner);
    }

    public void scratchingFurniture() {
        System.out.println("Arranhando móveis");
    }
}
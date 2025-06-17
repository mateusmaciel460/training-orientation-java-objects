package br.com.mateusmaciel460.challenges.ReusingFeatures;

public class Dog extends Animal {
    @Override
    public void emitSound() {
        System.out.println("Auauau");
    }

    public void wagTail() {
        System.out.println("Abanando rabo");
    }
}

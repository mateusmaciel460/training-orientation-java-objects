package br.com.mateusmaciel460.challenges.ReusingFeatures;

public class Cat extends Animal {
    @Override
    public void emitSound() {
        System.out.println("Miau");
    }

    public void scratchFurniture() {
        System.out.println("Arranhando o móveis");
    }
}

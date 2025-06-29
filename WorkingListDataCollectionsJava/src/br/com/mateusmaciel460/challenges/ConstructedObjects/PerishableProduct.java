package br.com.mateusmaciel460.challenges.ConstructedObjects;

public class PerishableProduct extends Product {
    private String dateValidity;

    public PerishableProduct(String name, double price, int amount, String dateValidity) {
        super(name, price, amount);
        this.dateValidity = dateValidity;
    }
}

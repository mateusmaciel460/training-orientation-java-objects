package br.com.mateusmaciel460.challenges.ConstructedObjects;

public class Product {
    private String name;
    private double price;
    private int amount;

    public Product(String name, double price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Produto: " + this.name + " | Preço: R$ " + this.price + " | Quantidade: " + this.amount;
    }
}

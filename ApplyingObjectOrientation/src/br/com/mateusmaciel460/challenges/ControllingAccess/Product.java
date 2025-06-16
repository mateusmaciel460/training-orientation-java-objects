package br.com.mateusmaciel460.challenges.ControllingAccess;

public class Product {
    private String name;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void applyDiscount() {
        double discount = 10.0 / 100.0;
        System.out.println("Preço original: " + this.price);

        this.price = this.price - (this.price * discount);
        System.out.println("Desconto de " + (discount * 100) + "%, preço do produto atualizado: R$ " + this.price);
    }
}

package br.com.mateusmaciel460.challenges.CommonBehaviors;

public class Book extends Product implements Calculable {
    @Override
    public double calculateFinalPrice() {
        this.setDiscount(0.1);
        return this.getPrice() - (this.getPrice() * this.getDiscount());
    }

    @Override
    public double calculateTotalPrice() {
        return calculateFinalPrice();
    }
}

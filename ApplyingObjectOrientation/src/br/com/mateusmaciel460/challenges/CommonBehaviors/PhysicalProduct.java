package br.com.mateusmaciel460.challenges.CommonBehaviors;

public class PhysicalProduct extends Product implements Calculable {
    @Override
    public double calculateFinalPrice() {
        this.setDiscount(0.3);
        return this.getPrice() - (this.getPrice() * this.getDiscount());
    }

    @Override
    public double calculateTotalPrice() {
        return calculateFinalPrice();
    }
}

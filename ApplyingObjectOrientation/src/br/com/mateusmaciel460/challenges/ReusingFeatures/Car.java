package br.com.mateusmaciel460.challenges.ReusingFeatures;

public class Car {
    private String model;
    private double priceOne;
    private double priceTwo;
    private double priceThree;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPriceOne() {
        return priceOne;
    }

    public void setPriceOne(double priceOne) {
        this.priceOne = priceOne;
    }

    public double getPriceTwo() {
        return priceTwo;
    }

    public void setPriceTwo(double priceTwo) {
        this.priceTwo = priceTwo;
    }

    public double getPriceThree() {
        return priceThree;
    }

    public void setPriceThree(double priceThree) {
        this.priceThree = priceThree;
    }

    public void displayInformationOnScreen() {
        System.out.println("Modelo do carro: " + this.model);
        System.out.println("Preço no ano 1: " + this.priceOne);
        System.out.println("Preço no ano 2: " + this.priceTwo);
        System.out.println("Preço no ano 3: " + this.priceThree);
    }

    public void returnLowestPrice() {
        double lowestPrice = this.priceOne;

        if (this.priceTwo < lowestPrice) {
            lowestPrice = this.priceTwo;
        }

        if (this.priceThree < lowestPrice) {
            lowestPrice = this.priceThree;
        }

        System.out.println(String.format("O menor preço entre os três é %.2f", lowestPrice));
    }

    public void returnHighestPrice() {
        double highestPrice = this.priceOne;

        if (this.priceTwo > highestPrice) {
            highestPrice = this.priceTwo;
        }

        if (this.priceThree > highestPrice) {
            highestPrice = this.priceThree;
        }

        System.out.println(String.format("O maior preço entre os três é %.2f", highestPrice));
    }
}

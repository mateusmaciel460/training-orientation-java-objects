package br.com.mateusmaciel460.challenges.CommonBehaviors;

public class Product {
    private String title;
    private double price;
    private double discount;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public void displayInformationProduct() {
        System.out.println("Produto: " + this.title);
        System.out.println("Preço: " + this.price);
    }

    public void displayNewPriceProduct(Calculable calculable) {
        System.out.println("Novo preço: " + calculable.calculateFinalPrice());
    }

    public void showTotalPriceExpense(Calculable calculable, int amount) {
        System.out.println("O total a pagar com " + amount + " em quantidade é " + calculable.calculateTotalPrice() * amount);
    }
}

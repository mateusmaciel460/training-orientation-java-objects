package br.com.mateusmaciel460.appshopping;

public class PurchaseOrder implements Comparable<PurchaseOrder> {
    private String name;
    private double balance;

    public PurchaseOrder(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Produto: " + this.getName() + " | Saldo: " + this.getBalance();
    }

    @Override
    public int compareTo(PurchaseOrder purchaseOrder) {
        return Double.valueOf(this.balance).compareTo(Double.valueOf(purchaseOrder.balance));
    }
}

package br.com.mateusmaciel460.appshopping;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CreditCard {
    private int limit;
    private double balance;
    private List<PurchaseOrder> shoppingList;

    public CreditCard(int limit) {
        this.limit = limit;
        this.balance = limit;
        this.shoppingList = new ArrayList<>();
    }

    public double getBalance() {
        return balance;
    }

    public List<PurchaseOrder> getShoppingList() {
        return shoppingList;
    }

    public boolean checkBuy(PurchaseOrder purchaseOrder) {
        if (this.balance >= purchaseOrder.getBalance()) {
            this.shoppingList.add(purchaseOrder);
            this.balance -= purchaseOrder.getBalance();
            return true;
        }

        return false;
    }

    public void showPurchaseMade() {
        Collections.sort(this.shoppingList);

        for (PurchaseOrder item: this.shoppingList) {
            System.out.println(item.getName() + " - R$ " + item.getBalance());
        }
    }
}

package br.com.mateusmaciel460.challenges.ConstructedObjects;

import br.com.mateusmaciel460.appshopping.MainShopping;

import java.util.ArrayList;

public class MainHome {
    public static void main(String[] args) {
        MainShopping mainShopping = new MainShopping();

        Product notebook = new Product("Notebook", 3500, 4);
        Product smartphone = new Product("Iphone 14", 12500, 10);
        Product mouse = new Product("Mouse K45", 250, 12);

        PerishableProduct chicken = new PerishableProduct("Leite pasteurizado", 34, 100, "08/05/2025");

        ArrayList<Product> productList = new ArrayList<>();
        productList.add(notebook);
        productList.add(smartphone);
        productList.add(mouse);
        productList.add(chicken);

        System.out.println("Tamnho da lista: " + productList.size());

        double averageProduct = 0;
        double totalProduct = productList.size();
        double sumProduct = 0;

        for (Product product: productList) {
            sumProduct += product.getPrice();
            averageProduct = sumProduct / totalProduct;
            System.out.println(product.toString());
        }

        System.out.println("Média de preço entre os produtos: R$" + averageProduct);

        System.out.println(mainShopping.displayAsterisk(50));
    }
}

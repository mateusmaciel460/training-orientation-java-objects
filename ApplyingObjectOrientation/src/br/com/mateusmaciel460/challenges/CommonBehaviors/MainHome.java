package br.com.mateusmaciel460.challenges.CommonBehaviors;

import br.com.mateusmaciel460.appstreaming.MainStreaming;

public class MainHome {
    public static void main(String[] args) {
        MainStreaming mainStreaming = new MainStreaming();

        CurrencyConverter converter = new CurrencyConverter();
        converter.showResultConversion(458);

        System.out.println(mainStreaming.displayAsterisks(50));
        RectangularRoomCalculator roomCalculator = new RectangularRoomCalculator();
        roomCalculator.displayAreaPerimeter(8, 5);

        System.out.println(mainStreaming.displayAsterisks(50));
        MultiplicationTable multiplicationTable = new MultiplicationTable();
        multiplicationTable.showMultiplicationTable(5);

        System.out.println(mainStreaming.displayAsterisks(50));
        StandardTemperatureConverter standardTemperatureConverter = new StandardTemperatureConverter();
        standardTemperatureConverter.showConversionTemperatureOnScreen(36, 96.8);

        System.out.println(mainStreaming.displayAsterisks(50));
        Book book = new Book();
        book.setTitle("O cavaleiro preso na armadura");
        book.setPrice(40);
        book.displayInformationProduct();
        book.displayNewPriceProduct(book);
        book.showTotalPriceExpense(book, 4);

        System.out.println(mainStreaming.displayAsterisks(50));
        PhysicalProduct physicalProduct = new PhysicalProduct();
        physicalProduct.setTitle("Bota Adventure Cotorno");
        physicalProduct.setPrice(150);
        physicalProduct.displayInformationProduct();
        physicalProduct.displayNewPriceProduct(physicalProduct);
        physicalProduct.showTotalPriceExpense(physicalProduct, 4);
    }
}

package br.com.mateusmaciel460.firstapplication.challenges;

public class BuildingMovieCatalog {
    public static void main(String[] args) {
        BuildingMovieCatalog buildingMovieCatalog = new BuildingMovieCatalog();

        buildingMovieCatalog.calculateAverageGrade(8.0, 6.0);
        buildingMovieCatalog.returnSortable(5.0);
        buildingMovieCatalog.returnTotalPrice(45.80, 4);
        buildingMovieCatalog.convertDollarToReal(45.80);
        buildingMovieCatalog.applyProductDiscount(400);
    }

    public void calculateAverageGrade(double gradeOne, double gradeTwo) {
        double average = (gradeOne + gradeTwo) / 2;
        String textMessage = "A média das notas %.2f e %.2f é %.2f";

        System.out.println(String.format(textMessage, gradeOne, gradeTwo, average));
    }

    public void returnSortable(double grade) {
        int stars = (int) grade / 2;

        System.out.println("A quantidade de estrelas " + stars + " com a nota: " + grade);
    }

    public void returnTotalPrice(double priceProduct, int amount) {
        double priceTotal = priceProduct * amount;
        String infoProduct = """
                1. Preço do produto: %.2f
                2. Quantidade: %d
                3. Preço total: %.2f
                """;

        System.out.print(String.format(infoProduct, priceProduct, amount, priceTotal));
    }

    public void convertDollarToReal(double dollar) {
        double priceDollar = 5.71;
        double convertToReal = dollar * priceDollar;

        System.out.println(
                String.format("Dólar: %.2f | Real: %.2f ", dollar, convertToReal)
        );
    }

    public void applyProductDiscount(double priceProduct) {
        double rate = 10.0 / 100.0;
        double discount = priceProduct - (priceProduct * rate);

        System.out.println(
                String.format("Preço sem desconto: %.2f e com desconto: %.2f", priceProduct, discount)
        );
    }
}

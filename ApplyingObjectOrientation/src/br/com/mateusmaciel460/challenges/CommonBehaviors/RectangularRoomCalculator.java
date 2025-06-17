package br.com.mateusmaciel460.challenges.CommonBehaviors;

interface GeometricCalculation {
    double calculateArea(double height, double width);
    double calculatePerimeter(double height, double width);
}

public class RectangularRoomCalculator implements GeometricCalculation {
    @Override
    public double calculateArea(double height, double width) {
        return height * width;
    }

    public double calculatePerimeter(double height, double width) {
        return 2 * (height + width);
    }

    public void displayAreaPerimeter(double height, double width) {
        System.out.println(
                String.format("Dimensões: altura: %.2f cm e largura: %.2f cm ", height, width)
        );

        System.out.println("Área: " + calculateArea(height, width) + " cm2");
        System.out.println("Perímetro: " + calculatePerimeter(height, width) + " cm");
    }
}

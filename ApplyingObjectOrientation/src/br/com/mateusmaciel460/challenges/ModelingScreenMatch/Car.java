package br.com.mateusmaciel460.challenges.ModelingScreenMatch;

import java.time.LocalDate;

public class Car {
    private String model;
    private String color;
    private int year;
    private int currentYear = LocalDate.now().getYear();

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCurrentYear() {
        return currentYear;
    }

    public void setCurrentYear(int currentYear) {
        this.currentYear = currentYear;
    }

    public void displayTechnicalSheet() {
        System.out.println("Modelo do carro: " + this.getModel());
        System.out.println("Ano do carro: " + this.getYear());
        System.out.println("Cor do carro: " + this.getColor());
    }

    public void displayYearCar() {
        int ageCar = this.getCurrentYear() - this.getYear();
        String checkAgeCar = ageCar > 1 ? "anos" : "ano";
        String textMessage = "Ano do atual: %d | ano do carro: %d | idade do carro: %d %s";
        System.out.println(
                String.format(textMessage, this.getCurrentYear(), this.getYear(), ageCar, checkAgeCar)
        );
    }
}

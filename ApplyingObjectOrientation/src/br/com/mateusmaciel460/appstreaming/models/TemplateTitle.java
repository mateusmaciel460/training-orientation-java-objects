package br.com.mateusmaciel460.appstreaming.models;

import com.sun.tools.javac.Main;

public class TemplateTitle {
    private String name;
    private int year;
    private double sumRatings;
    private int totalRatings;
    private int durationInMinutes;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return this.year;
    }

    public void setSumRatings(double sumRatings) {
        this.sumRatings = sumRatings;
    }

    public double getSumRatings() {
        return this.sumRatings;
    }

    public void setTotalRatings(int totalRatings) {
        this.totalRatings = totalRatings;
    }

    public int getTotalRatings() {
        return this.totalRatings;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public int getDurationInMinutes() {
        return this.durationInMinutes;
    }

    public void displayTechnicalSheet() {

        System.out.println("Nome do filme: " + this.name);
        System.out.println("Ano do filme: " + this.year);
    }

    public void evaluates(double grade) {
        sumRatings += grade;
        totalRatings++;
    }

    public double averageRating() {
        return sumRatings / totalRatings;
    }
}

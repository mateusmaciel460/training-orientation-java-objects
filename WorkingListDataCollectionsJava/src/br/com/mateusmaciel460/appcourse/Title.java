package br.com.mateusmaciel460.appcourse;

public class Title implements Comparable<Title> {
    private String title;
    private int year;
    private double sumEvaluation;
    private int totalEvaluation;

    public Title(String title, int year) {
        this.title = title;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    @Override
    public int compareTo(Title otherTitle) {
        return otherTitle.getTitle().compareTo(this.getTitle());
    }

    @Override
    public String toString() {
        return "Título: " + this.title + " | Ano: " + this.year;
    }

    public void toAssess(double grade) {
        sumEvaluation += grade;
        this.totalEvaluation++;
    }

    public double averageGrade() {
        return sumEvaluation / totalEvaluation;
    }

    public void showAverageGrade() {
        System.out.println("Nota da banda " + this.title + " é " + (sumEvaluation / totalEvaluation));
    }
}

class Movie extends Title implements Classifiable {
    public Movie(String title, int year) {
        super(title, year);
    }

    @Override
    public int getClassifiable() {
        return (int) this.averageGrade() / 2;
    }
}

class Series extends Title {
    public Series(String title, int year) {
        super(title, year);
    }
}

interface Classifiable {
    int getClassifiable();
}
package br.com.mateusmaciel460.challenges.SortingData;

public class Title implements Comparable<Title> {
    private String title;
    private int year;

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
        return this.getTitle().compareTo(otherTitle.getTitle());
    }
}

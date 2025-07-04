package br.com.mateusmaciel460.appstreaming.models;

import br.com.mateusmaciel460.appstreaming.interfaces.Classifiable;

public class Episode implements Classifiable {
    private int number;
    private String name;
    private Series series;
    private int totalView;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Series getSeries() {
        return series;
    }

    public void setSeries(Series series) {
        this.series = series;
    }

    public int getTotalView() {
        return totalView;
    }

    public void setTotalView(int totalView) {
        this.totalView = totalView;
    }

    @Override
    public int getClassifiable() {
        if (this.getTotalView() > 100) {
            return 4;
        } else {
            return 2;
        }
    }
}

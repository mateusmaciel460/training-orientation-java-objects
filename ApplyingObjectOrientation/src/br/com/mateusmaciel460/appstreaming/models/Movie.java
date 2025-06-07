package br.com.mateusmaciel460.appstreaming.models;

import br.com.mateusmaciel460.appstreaming.interfaces.Classifiable;

public class Movie extends TemplateTitle implements Classifiable {
    private String director;

    public void setDirector(String director) {
        this.director = director;
    }

    public String getDirector() {
        return this.director;
    }

    @Override
    public int getClassifiable() {
        return (int) averageRating() / 2;
    }
}
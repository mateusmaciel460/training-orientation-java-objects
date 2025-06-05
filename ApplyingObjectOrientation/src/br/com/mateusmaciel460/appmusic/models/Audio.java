package br.com.mateusmaciel460.appmusic.models;

public class Audio {
    private String title;
    private int totalPlays;
    private int totalLikes;
    private double classification;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTotalLikes() {
        return totalLikes;
    }

    public void setTotalLikes(int totalLikes) {
        this.totalLikes = totalLikes;
    }

    public double getClassification() {
        return classification;
    }

    public void setClassification(int classification) {
        this.classification = classification;
    }

    public int getTotalPlays() {
        return totalPlays;
    }

    public void setTotalPlays(int totalPlays) {
        this.totalPlays = totalPlays;
    }

    public void addLike() {
        this.totalLikes++;
    }

    public void addPlay() {
        this.totalPlays++;
    }
}

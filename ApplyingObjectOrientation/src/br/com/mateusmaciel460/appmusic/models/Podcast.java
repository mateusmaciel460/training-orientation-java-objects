package br.com.mateusmaciel460.appmusic.models;

public class Podcast extends Audio {
    private String host;
    private String description;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public double getClassification() {
        if (this.getTotalLikes() > 500) {
            return 10;
        } else {
            return 7;
        }
    }
}

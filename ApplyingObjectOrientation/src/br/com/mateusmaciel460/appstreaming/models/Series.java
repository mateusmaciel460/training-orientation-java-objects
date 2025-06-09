package br.com.mateusmaciel460.appstreaming.models;

import br.com.mateusmaciel460.appstreaming.interfaces.Classifiable;

public class Series extends TemplateTitle {
    private int seasons;
    private int episodesPerSeasons;
    private int durationPerEpisodes;

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public int getSeasons(int seasons) {
        return this.seasons;
    }

    public void setEpisodesPerSeasons(int episodesPerSeasons) {
        this.episodesPerSeasons = episodesPerSeasons;
    }

    public int getEpisodesPerSeasons() {
        return this.episodesPerSeasons;
    }

    public void setDurationPerEpisodes(int durationPerEpisodes) {
        this.durationPerEpisodes = durationPerEpisodes;
    }

    public int getDurationPerEpisodes() {
        return this.durationPerEpisodes;
    }

    @Override
    public int getDurationInMinutes() {
        return this.seasons * this.episodesPerSeasons * this.durationPerEpisodes;
    }
}

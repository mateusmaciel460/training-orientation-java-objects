package br.com.mateusmaciel460.appstreaming;

import br.com.mateusmaciel460.appstreaming.calcs.RecommendationFilter;
import br.com.mateusmaciel460.appstreaming.calcs.TimeCalculator;
import br.com.mateusmaciel460.appstreaming.interfaces.Classifiable;
import br.com.mateusmaciel460.appstreaming.models.Episode;
import br.com.mateusmaciel460.appstreaming.models.Movie;
import br.com.mateusmaciel460.appstreaming.models.Series;
import br.com.mateusmaciel460.appstreaming.models.TemplateTitle;

public class MainStreaming {
    RecommendationFilter filter = new RecommendationFilter();

    public static void main(String[] args) {
        MainStreaming home = new MainStreaming();

        System.out.println("1. Listando informações de filme, série e episódio: ");

        // Way Back - Movie
        Movie wayBack = new Movie();
        wayBack.setName("The Way Back");
        wayBack.setYear(2020);
        wayBack.setDurationInMinutes(108);

        wayBack.evaluates(8.0);
        wayBack.evaluates(9.0);
        wayBack.evaluates(7.0);

        home.displayInformationHome(wayBack);

        // Stranger Things - Series
        Series strangerT = new Series();
        strangerT.setName("Stranger Things");
        strangerT.setYear(2016);
        strangerT.setSeasons(4);
        strangerT.setEpisodesPerSeasons(10);
        strangerT.setDurationPerEpisodes(40);

        strangerT.evaluates(6.0);
        strangerT.evaluates(8.0);
        strangerT.evaluates(7.0);

        home.displayInformationHome(strangerT);

        // Mad Families - Movie
        Movie madF = new Movie();
        madF.setName("Mad Families");
        madF.setYear(2017);
        madF.setDurationInMinutes(87);

        madF.evaluates(4.0);
        madF.evaluates(5.0);
        madF.evaluates(6.0);

        home.displayInformationHome(madF);

        System.out.println("2. Calculando de tempo de exibição");
        TimeCalculator timeCalculator = new TimeCalculator();
        timeCalculator.includeInTime(wayBack);
        timeCalculator.includeInTime(strangerT);
        System.out.println("O tempo total para assistir (The Way Back e Stranger Things) " + timeCalculator.getTotalTime() + " minutos");

        timeCalculator.includeInTime(madF);
        System.out.println("O tempo total para assistir (The Way Back, Stranger Things e Mad Families) " + timeCalculator.getTotalTime() + " minutos");

        System.out.println("3. Filtragem");
        System.out.println("Filme: " + wayBack.getName());
        home.displayComplementationRecommendation(wayBack);

        System.out.println("Filme: " + madF.getName());
        home.displayComplementationRecommendation(madF);

        // Episode - Chapter One (Stranger Things)
        Episode chapterOne = new Episode();
        chapterOne.setNumber(1);
        chapterOne.setName("Chapter One: The Vanishing of Will Byers");
        chapterOne.setSeries(strangerT);
        chapterOne.setTotalView(101);

        System.out.println("Ep: " + chapterOne.getName());
        home.displayComplementationRecommendation(chapterOne);
    }

    public String displayAsterisks(int limitChosen) {
        String asterisk = "";

        for (int i = 0; i <= limitChosen; i++) {
            asterisk += "*";
        }

        return asterisk;
    }

    public void displayInformationHome(TemplateTitle templateTitle) {
        templateTitle.displayTechnicalSheet();
        System.out.println("A média de avaliações de " + templateTitle.getName() + " é: " + templateTitle.averageRating());
        System.out.println("Duração para assistir " + templateTitle.getName() + ": " + templateTitle.getDurationInMinutes() + " minutos");
        System.out.println(displayAsterisks(50));
    }

    public void displayComplementationRecommendation(Classifiable classifiable) {
        filter.displayRecommendation(classifiable);
    }
}
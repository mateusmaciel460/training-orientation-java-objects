package br.com.mateusmaciel460.appstreaming.calcs;

import br.com.mateusmaciel460.appstreaming.interfaces.Classifiable;

public class RecommendationFilter {
    public void displayRecommendation(Classifiable classifiable) {
        if (classifiable.getClassifiable() >= 4) {
            System.out.println("Essa é uma excelente recomendação para assistir!");
        } else if (classifiable.getClassifiable() >= 2) {
            System.out.println("Essa é uma boa recomendação, mas não urgente");
        } else {
            System.out.println("Essa recomendação é ótima para assistir depois");
        }
    }
}

package br.com.mateusmaciel460.appmusic.models;

public class Preferences {
    public void includeInPreference(Audio audio) {
        if (audio.getClassification() >= 9) {
            System.out.println(audio.getTitle() + " é considerado sucesso absoluto e um dos títulos preferidos da galera");
        } else {
            System.out.println(audio.getTitle() + " é um dos títulos que todo mundo está curtindo. Não deixe de ouvir também");
        }
    }
}

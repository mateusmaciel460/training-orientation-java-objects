package br.com.mateusmaciel460.appcourse;

import br.com.mateusmaciel460.appshopping.MainShopping;

import java.util.*;

public class MainCourse {
    public static void main(String[] args) {
        MainShopping mainShopping = new MainShopping();

        // Reference
        Series bigTimeRush = new Series("Big Time Rush", 2009);
        bigTimeRush.toAssess(4);
        bigTimeRush.showAverageGrade();

        Series bigTimeRushF = bigTimeRush;
        bigTimeRushF.toAssess(8);
        bigTimeRushF.showAverageGrade();
        bigTimeRush.showAverageGrade();

        System.out.println(mainShopping.displayAsterisk(50));

        // List
        Movie origin = new Movie("A Origem", 2010);
        Movie joker = new Movie("Coringa", 2019);
        Movie oppenheimer = new Movie("Oppenheimer", 2017);

        origin.toAssess(7);
        joker.toAssess(10);
        oppenheimer.toAssess(6);
        oppenheimer.toAssess(3);

        ArrayList<Title> listTitle = new ArrayList<>();
        listTitle.add(origin);
        listTitle.add(joker);
        listTitle.add(oppenheimer);
        listTitle.add(bigTimeRush);

        for (Title title: listTitle) {
            System.out.println(title.toString());

            if (title instanceof Movie movie && movie.getClassifiable() > 2) {
                System.out.println("Classificação: " + movie.getClassifiable());
            }
        }

        System.out.println(mainShopping.displayAsterisk(50));
        // Sort common
        List<String> listSinger = new LinkedList<>();
        listSinger.add("Beyonce");
        listSinger.add("Ed Sheeran");
        listSinger.add("Shakira");
        listSinger.add("The Weeknd");
        listSinger.add("Bruno Mars");

        Collections.sort(listSinger);
        System.out.println(listSinger);

        // Sort CompareTo
        System.out.println(mainShopping.displayAsterisk(50));
        listTitle.sort(Comparator.comparing(Title::getYear));

        for (Title title: listTitle) {
            System.out.println(title.toString());
        }
    }
}

package br.com.mateusmaciel460.challenges.SortingData;

import br.com.mateusmaciel460.appshopping.MainShopping;

import java.util.*;

public class MainHome {
    public static void main(String[] args) {
        MainShopping mainShopping = new MainShopping();

        List<Integer> listNumberInteger = new LinkedList<>();
        listNumberInteger.add(10);
        listNumberInteger.add(7);
        listNumberInteger.add(2);

        Collections.sort(listNumberInteger);
        System.out.println(listNumberInteger);

        System.out.println(mainShopping.displayAsterisk(50));
        Title title1 = new Title("Filme 1", 2025);
        Title title2 = new Title("Filme 2", 2005);
        Title title3 = new Title("Filme 3", 1980);

        List<Title> listTitle = new LinkedList<>();
        listTitle.add(title1);
        listTitle.add(title2);
        listTitle.add(title3);

        listTitle.sort(Comparator.comparing(Title::getTitle));

        for (Title title: listTitle) {
            System.out.println(title.getTitle() + " -> " + title.getYear());
        }

        System.out.println(mainShopping.displayAsterisk(50));

        List<String> listStrings;

        listStrings = new ArrayList<>();
        listStrings.add("Mateus");
        listStrings.add("Fernando");
        listStrings.add("Paulo");
        System.out.println(listStrings);

        listStrings = new LinkedList<>();
        listStrings.add("André");
        listStrings.add("Gustavo");
        listStrings.add("Ana");
        System.out.println(listStrings);
    }
}

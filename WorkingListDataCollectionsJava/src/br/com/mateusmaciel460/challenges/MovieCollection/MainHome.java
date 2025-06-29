package br.com.mateusmaciel460.challenges.MovieCollection;

import br.com.mateusmaciel460.appshopping.MainShopping;

import java.util.ArrayList;

public class MainHome {
    public static void main(String[] args) {
        MainShopping mainShopping = new MainShopping();

        Person andrew = new Person("Andrew", 25);
        Person kendall = new Person("Kendall", 32);
        Person james = new Person("James", 45);

        ArrayList<Person> personList = new ArrayList<>();
        personList.add(andrew);
        personList.add(kendall);
        personList.add(james);

        System.out.println("Tamanho da lista: " + personList.size());
        System.out.println("A primeira pessoa da lista: " + personList.get(0));

        System.out.println(mainShopping.displayAsterisk(50));
        for (Person person: personList) {
            System.out.println(person.toString());
        }
    }
}

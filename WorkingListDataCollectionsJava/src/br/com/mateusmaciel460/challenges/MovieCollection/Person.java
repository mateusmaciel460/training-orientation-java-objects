package br.com.mateusmaciel460.challenges.MovieCollection;

public class Person {
    private String lastName;
    private int age;

    public Person(String lastName, int age) {
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Nome: " + this.lastName + " | Idade: " + this.age;
    }
}

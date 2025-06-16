package br.com.mateusmaciel460.challenges.ModelingScreenMatch;

import br.com.mateusmaciel460.appstreaming.MainStreaming;

public class MainHome {
    public static void main(String[] args) {
        MainStreaming mainStreaming = new MainStreaming();

        Person person = new Person();
        person.showHelloWorld();
        System.out.println(mainStreaming.displayAsterisks(50));

        Calculator calculator = new Calculator();
        calculator.returnDoubleNumber(36);
        System.out.println(mainStreaming.displayAsterisks(50));

        Music music = new Music();
        music.setTitle("Don't Stop Believin'");
        music.setArtist("Journey");
        music.setYear(1981);
        music.evaluate(4.0);
        music.evaluate(10);
        music.evaluate(8.0);
        music.displayTechnicalSheet();
        System.out.println(mainStreaming.displayAsterisks(50));

        Car car = new Car();
        car.setModel("Toyota Corolla");
        car.setColor("Prata");
        car.setYear(2020);
        car.displayTechnicalSheet();
        car.displayYearCar();
        System.out.println(mainStreaming.displayAsterisks(50));

        Student student = new Student();
        student.setName("Mateus Maciel");
        student.setAge(24);
        student.showInformationStudent();
    }
}
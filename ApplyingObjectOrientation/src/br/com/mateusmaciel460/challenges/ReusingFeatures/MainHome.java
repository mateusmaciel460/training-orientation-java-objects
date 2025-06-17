package br.com.mateusmaciel460.challenges.ReusingFeatures;

import br.com.mateusmaciel460.appstreaming.MainStreaming;

public class MainHome {
    public static void main(String[] args) {
        MainStreaming mainStreaming = new MainStreaming();

        Car car = new Car();
        car.setModel("Toyota Corolla");
        car.setPriceOne(100);
        car.setPriceTwo(800);
        car.setPriceThree(1200);
        car.displayInformationOnScreen();
        car.returnLowestPrice();
        car.returnHighestPrice();

        System.out.println(mainStreaming.displayAsterisks(50));
        Cat cat = new Cat();
        cat.emitSound();
        cat.scratchFurniture();

        Dog dog = new Dog();
        dog.emitSound();
        dog.wagTail();

        System.out.println(mainStreaming.displayAsterisks(50));
        PrimeNumbers primeNumbers = new PrimeNumbers();
        primeNumbers.listPrimes(10);

        CheckPrime checkPrime = new CheckPrime();
        checkPrime.checkOfPrimeExistence(7);
        checkPrime.checkOfPrimeExistence(9);

        PrimeGenerator primeGenerator = new PrimeGenerator();
        primeGenerator.generateNextCousin(7);
    }
}

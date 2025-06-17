package br.com.mateusmaciel460.challenges.ReusingFeatures;

public class CheckPrime extends PrimeNumbers {
    public void checkOfPrimeExistence(int number) {
        if (checkPrimality(number)) {
            System.out.println("O número " + number + " é primo");
        } else {
            System.out.println("O número " + number + " não é primo");
        }
     }
}

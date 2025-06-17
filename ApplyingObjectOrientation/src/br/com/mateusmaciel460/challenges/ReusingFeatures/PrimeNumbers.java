package br.com.mateusmaciel460.challenges.ReusingFeatures;

public class PrimeNumbers {
    public boolean checkPrimality(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public void listPrimes(int limitChosen) {
        System.out.println("Listando números primos de 1 até " + limitChosen);

        for (int i = 2; i <= limitChosen; i++) {
            if (checkPrimality(i)) {
                System.out.print(i + " ");
            }
        }

        System.out.println("");
    }
}

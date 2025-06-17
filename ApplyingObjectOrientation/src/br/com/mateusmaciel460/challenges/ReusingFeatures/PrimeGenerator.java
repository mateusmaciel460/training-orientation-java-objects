package br.com.mateusmaciel460.challenges.ReusingFeatures;

public class PrimeGenerator extends PrimeNumbers {
    public void generateNextCousin(int number) {
        int nextNumber = number + 1;

        while (!checkPrimality(nextNumber)) {
            System.out.println(nextNumber);
            nextNumber++;
        }

        System.out.println("O primeiro número primo depois do " + number + " é " + nextNumber);
    }
}

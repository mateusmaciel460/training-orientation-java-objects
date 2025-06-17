package br.com.mateusmaciel460.challenges.CommonBehaviors;

interface IMultiplicationTable {
    void showMultiplicationTable(int number);
}

public class MultiplicationTable implements IMultiplicationTable {
    @Override
    public void showMultiplicationTable(int number) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }
}

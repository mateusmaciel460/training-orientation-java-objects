package br.com.mateusmaciel460.firstapplication.challenges;

import java.util.Scanner;

public class ControllingApplicationFlow {
    Scanner reading = new Scanner(System.in);

    public static void main(String[] args) {
        ControllingApplicationFlow controllingApplicationFlow = new ControllingApplicationFlow();

        controllingApplicationFlow.checkInteger();
        controllingApplicationFlow.comparingNumbers();
        controllingApplicationFlow.returnCalcArea();
        controllingApplicationFlow.returnMultiplicationTable();
        controllingApplicationFlow.checkParity();
        controllingApplicationFlow.returnFactorialNumber();
    }

    public void showTitleOnScreen(String title) {
        String asterisk = "";

        for (int i = 0; i < 50; i++) {
            asterisk += "*";
        }

        System.out.println(asterisk);
        System.out.println(title);
    }

    public void checkInteger() {
        showTitleOnScreen("1. Verificando número positivo/negativo");

        System.out.print("Digite um número inteiro: ");
        int number = reading.nextInt();

        if (number > 0) {
            System.out.println(number + " é um número positivo");
        } else if (number < 0) {
            System.out.println(number + " é um número negativo");
        } else {
            System.out.println(number + " não pode ser definido como positivo ou negativo");
        }
    }

    public void comparingNumbers() {
        showTitleOnScreen("2. Comparando números");

        System.out.print("Digite um número inteiro: ");
        int numberOne = reading.nextInt();

        System.out.print("Digite outro número inteiro: ");
        int numberTwo = reading.nextInt();

        if (numberOne == numberTwo) {
            System.out.println("O número " + numberOne + " é igual ao número " + numberTwo);
        } else if (numberOne != numberTwo) {
            System.out.println("O número " + numberOne + " é diferente do número " + numberTwo);
        }

        if (numberOne > numberTwo) {
            System.out.println("O número " + numberOne + " é maior que " + numberTwo);
        } else if (numberTwo > numberOne) {
            System.out.println("O número " + numberTwo + " é menor que " + numberOne);
        }
    }

    public void returnCalcArea() {
        showTitleOnScreen("3. Calculando área");
        String menuOption = """
                1. Calcular área do quadrado
                2. Calcular área do círculo
                """;

        System.out.print(menuOption);
        System.out.print("Digite a opção escolhida: ");
        int optionChosen = reading.nextInt();

        if (optionChosen == 1) {
            System.out.print("Digite o lado do quadrado em cm: ");
            double sideSquare = reading.nextDouble();
            double areaSquare = sideSquare * sideSquare;

            System.out.println("A área do quadrado é " + areaSquare + " cm2");
        } else if (optionChosen == 2) {
            System.out.print("Digite o raio do círculo em cm: ");
            double radiusCircle = reading.nextDouble();
            double areaCircle = 3.14 * (radiusCircle * radiusCircle);

            System.out.println("A área do círculo é " + areaCircle + " cm2");
        } else {
            System.out.println("Opção desconhecida :(");
        }
    }

    public void returnMultiplicationTable() {
        showTitleOnScreen("Tabuada");

        System.out.print("Digite qualquer número natural maior que zero: ");
        int number = reading.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }

    public void checkParity() {
        showTitleOnScreen("Checando se um número é par ou ímpar");

        System.out.print("Digite um número natural: ");
        int number = reading.nextInt();

        String messageDefault = "O número " + number;

        if (number % 2 == 0) {
            System.out.println(messageDefault + " é par");
        } else if (number % 2 != 0) {
            System.out.println(messageDefault + " é ímpar");
        }
    }

    public void returnFactorialNumber() {
        showTitleOnScreen("Calculando número fatorial");

        System.out.print("Escolha um número natural maior que zero: ");
        int number = reading.nextInt();
        int numberFactorial = 1;

        for (int i = 1; i <= number; i++) {
            numberFactorial *= i;
        }

        System.out.println(number + "! é " + numberFactorial);
    }
}

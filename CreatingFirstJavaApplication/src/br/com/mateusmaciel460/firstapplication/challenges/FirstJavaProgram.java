package br.com.mateusmaciel460.firstapplication.challenges;

public class FirstJavaProgram {
    public static void main(String[] args) {
        FirstJavaProgram firstJavaProgram = new FirstJavaProgram();
        String lastName = "Mateus Maciel";

        firstJavaProgram.showMessageOnScreen(lastName);
        firstJavaProgram.showMessageOnQuestion();
        firstJavaProgram.showMessageNotesOnScreen(lastName);
        firstJavaProgram.calculationMathematicalOperation(4.0, 8.0);
    }

    public void showMessageOnScreen(String lastName) {
        System.out.println("Olá, " + lastName);
    }

    public void showMessageOnQuestion() {
        System.out.println("Tudo bem?");
    }

    public void showMessageNotesOnScreen(String lastName) {
        String notes = """
                1. Aprender Java.
                2. Aprender Angular.
                3. Aprender Linux
                """;

        System.out.println("Essa foram as suas anotações, " + lastName);
        System.out.print(notes);
    }

    public void calculationMathematicalOperation (double numberOne, double numberTwo) {
        double addition = numberOne + numberTwo;
        double subtraction = numberOne - numberTwo;
        double multiplication = numberOne * numberTwo;
        double division = numberOne / numberTwo;

        System.out.println("---------------------------------");
        System.out.println(numberOne + " + " + numberTwo + " = " + addition);
        System.out.println(numberOne + " - " + numberTwo + " = " + subtraction);
        System.out.println(numberOne + " * " + numberTwo + " = " + multiplication);
        System.out.println(numberOne + " / " + numberTwo + " = " + division);
        System.out.println("---------------------------------");
    }
}

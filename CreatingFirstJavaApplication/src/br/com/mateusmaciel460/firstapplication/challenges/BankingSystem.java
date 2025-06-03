package br.com.mateusmaciel460.firstapplication.challenges;

import java.util.Scanner;

public class BankingSystem {
    Scanner reading = new Scanner(System.in);

    String lastName = "Mateus Maciel";
    String typeAccount = "Corrente";
    double balanceAccount = 2500.0;

    public static void main(String[] args) throws InterruptedException {
        BankingSystem banking = new BankingSystem();

        int chosenOption = banking.showMenuOptions();
        banking.showAnswerOptionsMenu(chosenOption);
    }

    public int showMenuOptions() {
        String messageHeaderTitleOption = """
                %s
                Dados iniciais do cliente:
                
                Nome: %s
                Tipo conta: %s
                Saldo inicial: R$ %.2f
                %s
                
                Operações
                
                1- Consultar saldos
                2- Depositar
                3- Sacar
                4- Sair
                
                """;

        System.out.print(String.format(
                messageHeaderTitleOption, returnAsterisks(), lastName, typeAccount, balanceAccount, returnAsterisks()
        ));

        System.out.print("Digite a opção desejada: ");
        int optionChose = reading.nextInt();

        return optionChose;
    }

    public void showAnswerOptionsMenu(int chosenOption) throws InterruptedException {
        while (chosenOption != 4) {
            switch (chosenOption) {
                case 1:
                    showTitleOnScreen("1 - Consultar saldos");
                    System.out.println("Saldo atualizado: R$ " + balanceAccount);
                    chosenOption = showMenuOptions();
                    break;
                case 2:
                    showTitleOnScreen("2 - Depositar");
                    double deposit = returnBankOperationValue("depositar");
                    executeDeposit(deposit);
                    chosenOption = showMenuOptions();
                    break;
                case 3:
                    showTitleOnScreen("3 - Sacar");
                    double sake = returnBankOperationValue("sacar");
                    executeSake(sake);
                    chosenOption = showMenuOptions();
                    break;
                case 4:
                    break;
                default:
                    showTitleOnScreen("Nenhuma opção encontrada");
                    Thread.sleep(3000);
                    chosenOption = showMenuOptions();
                    break;
            }
        }

        showTitleOnScreen("4 - Você escolheu sair do programa");
    }

    public void executeDeposit(double valueDeposit) {
        if (valueDeposit > 0) {
            balanceAccount += valueDeposit;
            System.out.println("Deposito no valor de R$ " + valueDeposit + " realizado com sucesso");
        } else {
            System.out.println("O deposito não pode ser menor ou igual a zero!");
        }
    }

    public void executeSake(double valueSake) {
        if (valueSake <= balanceAccount && valueSake > 0) {
            balanceAccount -= valueSake;
            System.out.println("O saque no valor de R$ " + valueSake + " realizado com sucesso");
        } else if (valueSake > balanceAccount) {
            System.out.println("Saldo insuficiente para sacar R$ " + valueSake);
        } else if (valueSake <= 0) {
            System.out.println("O valor de saque não pode ser menor ou igual a zero");
        }
    }

    public double returnBankOperationValue(String typeOperation) {
        System.out.print("Quanto deseja " + typeOperation + "? ");
        double valueOperation = reading.nextDouble();

        return valueOperation;
    }

    public void showTitleOnScreen(String title) {
        System.out.println(returnAsterisks());
        System.out.println(title);
    }

    public String returnAsterisks() {
        String asterisks = "";

        for (int i = 0; i <= 30; i++) {
            asterisks += "*";
        }

        return asterisks;
    }
}
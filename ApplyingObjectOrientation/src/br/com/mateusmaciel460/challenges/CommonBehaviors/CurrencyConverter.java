package br.com.mateusmaciel460.challenges.CommonBehaviors;

interface FinancialConversion {
    double convertDollarToReal(double dollarAmount);
}

public class CurrencyConverter implements FinancialConversion {
    double dollarToday = 5.70;

    @Override
    public double convertDollarToReal(double dollarAmount) {
        return dollarAmount * this.dollarToday;
    }

    public void showResultConversion(double dollarAmount) {
        String textMessage = """
                Dólar hoje: %.2f
                Dólar informado: %.2f
                Conversão em reais: %.2f
                """;

        System.out.print(
                String.format(textMessage, this.dollarToday, dollarAmount, convertDollarToReal(dollarAmount))
        );
    }
}

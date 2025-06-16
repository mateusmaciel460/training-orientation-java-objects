package br.com.mateusmaciel460.challenges.ControllingAccess;

public class BankAccount {
    private int numberAccount;
    private double balanceAccount;
    private String titleHolder;

    public void setNumberAccount(int numberAccount) {
        this.numberAccount = numberAccount;
    }

    public int getNumberAccount() {
        return this.numberAccount;
    }

    public double getBalanceAccount() {
        return this.balanceAccount;
    }

    public void setTitleHolder(String titleHolder) {
        this.titleHolder = titleHolder;
    }

    public String getTitleHolder() {
        return this.titleHolder;
    }

    public void showTechnicalSheet() {
        System.out.println("Número da conta: " + this.numberAccount);
        System.out.println("Saldo da conta: R$ " + this.balanceAccount);
        System.out.println("Títular da conta: " + this.titleHolder);
    }

    public void checkBalance() {
        System.out.println("Saldo atual: R$ " + this.balanceAccount);
    }

    public void withDraw(double sake) {
        this.balanceAccount -= sake;
    }

    public void depositing(double deposit) {
        this.balanceAccount += deposit;
    }
}

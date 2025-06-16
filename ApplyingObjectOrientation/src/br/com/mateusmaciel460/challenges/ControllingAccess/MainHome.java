package br.com.mateusmaciel460.challenges.ControllingAccess;

import br.com.mateusmaciel460.appstreaming.MainStreaming;
import br.com.mateusmaciel460.challenges.ModelingScreenMatch.Book;
import br.com.mateusmaciel460.challenges.ModelingScreenMatch.Student;

public class MainHome {
    public static void main(String[] args) {
        MainStreaming mainStreaming = new MainStreaming();

        BankAccount bankAccount = new BankAccount();
        bankAccount.setNumberAccount(1);
        bankAccount.setTitleHolder("Mateus Maciel");
        bankAccount.showTechnicalSheet();

        System.out.println(mainStreaming.displayAsterisks(50));
        TransactionAccount transactionAccount = new TransactionAccount();
        transactionAccount.setNumberAccount(2);
        transactionAccount.setTitleHolder("Fernando Oliveira");
        transactionAccount.showTechnicalSheet();

        transactionAccount.depositing(400);
        transactionAccount.checkBalance();
        transactionAccount.withDraw(250);
        transactionAccount.checkBalance();

        System.out.println(mainStreaming.displayAsterisks(50));
        AgePerson agePerson = new AgePerson();
        agePerson.setLastName("Mateus Maciel");
        agePerson.setAge(14);
        agePerson.checkAge();

        System.out.println(mainStreaming.displayAsterisks(50));
        Product product = new Product();
        product.setName("Notebook");
        product.setPrice(200);
        product.applyDiscount();

        System.out.println(mainStreaming.displayAsterisks(50));
        Student student = new Student();
        student.setName("Fernando");
        student.setAge(25);
        student.addScore(4.0);
        student.addScore(10.0);
        student.addScore(4.0);
        student.calculateAverage();

        System.out.println(mainStreaming.displayAsterisks(50));
        Book book = new Book();
        book.setTitle("Entendendo Algoritmos");
        book.setAuthor("Aditya Y. Bhargava");
        book.displayInformationOnScreen();
    }
}

package br.com.mateusmaciel460.challenges.ListDistinctObjects;

import br.com.mateusmaciel460.appshopping.MainShopping;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainHome {
    public static void main(String[] args) {
        MainShopping mainShopping = new MainShopping();

        ArrayList<String> coursesList = new ArrayList<>();
        coursesList.add("Curso de Java");
        coursesList.add("Curso de Spring Boot");
        coursesList.add("Curso de Angular");

        for (String course: coursesList) {
            System.out.println(course);
        }

        System.out.println(mainShopping.displayAsterisk(50));
        Dog dog = new Dog("Cachorro", "Dono do cachorro");
        Cat cat = new Cat("Gato", "Dono do gato");

        ArrayList<Animal> listAnimal = new ArrayList<>();
        listAnimal.add(dog);
        listAnimal.add(cat);

        for (Animal animal: listAnimal) {
            System.out.println(animal.toString());

            if (animal instanceof Dog dog2) {
                dog2.wagTail();
            }

            if (animal instanceof Cat cat2) {
                cat2.scratchingFurniture();
            }
        }

        System.out.println(mainShopping.displayAsterisk(50));
        Circle circle = new Circle("Círculo", 8);
        Square square = new Square("Quadrado", 5);

        List<IForm> listForm = new LinkedList<>();
        listForm.add(circle);
        listForm.add(square);

        for (IForm form: listForm) {
            System.out.println(
                    String.format("Área: %.2f", form.calculateArea())
            );
        }

        System.out.println(mainShopping.displayAsterisk(50));
        BankAccount wendell = new BankAccount(2, 4900.50);
        BankAccount miranda = new BankAccount(3, 1234.59);

        List<BankAccount> bankAccountList = new LinkedList<>();
        bankAccountList.add(wendell);
        bankAccountList.add(miranda);

        double highestBalance = 0;

        for (BankAccount account: bankAccountList) {
            highestBalance = Math.max(highestBalance, account.getBalance());
        }

        System.out.println("O maior saldo entre as contas é: R$ " + highestBalance);
    }
}

package br.com.mateusmaciel460.challenges.ModelingScreenMatch;

public class Student {
    private String name;
    private int age;
    private double score;
    private double sumScore;
    private int totalScore;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void showInformationStudent() {
        System.out.println("Estudante: " + this.name);
        System.out.println("Idade: " + this.age + " anos");
    }

    public void addScore(double score) {
        sumScore += score;
        totalScore++;
    }

    public void calculateAverage() {
        double average = sumScore / totalScore;
        System.out.println("A média do aluno " + this.name + " é " + average);
    }
}

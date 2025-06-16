package br.com.mateusmaciel460.challenges.ControllingAccess;

public class AgePerson {
    private String lastName;
    private int age;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void checkAge() {
        String checkLengthAge = this.getAge() > 1 ? "anos" : "ano";

        if (this.getAge() >= 18) {
            System.out.println(this.lastName + " é maior de idade com " + this.age + " anos");
        } else if (this.getAge() >= 1 && this.getAge() < 18) {
            System.out.println(this.lastName + " é menor de idade com " + this.age + " " + checkLengthAge);
        } else {
            System.out.println("A idade " + this.age + ", não existe - tente outra");
        }
    }
}

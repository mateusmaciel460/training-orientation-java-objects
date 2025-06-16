package br.com.mateusmaciel460.challenges.ModelingScreenMatch;

public class Book {
    private String title;
    private String author;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void displayInformationOnScreen() {
        System.out.println("Título do livro: " + this.title);
        System.out.println("Autor do livro: " + this.author);
    }
}

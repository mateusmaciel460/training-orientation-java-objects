package br.com.mateusmaciel460.challenges.ModelingScreenMatch;

class Music {
    private String title;
    private String artist;
    private int year;
    private double sumEvaluation;
    private double evaluation;
    private int totalEvaluation;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getTotalEvaluation() {
        return totalEvaluation;
    }

    public void setTotalEvaluation(int totalEvaluation) {
        this.totalEvaluation = totalEvaluation;
    }

    public double getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(double evaluation) {
        this.evaluation = evaluation;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void evaluate(double grade) {
        sumEvaluation += grade;
        totalEvaluation++;
    }

    public double averageGrade() {
        return sumEvaluation / totalEvaluation;
    }

    public void displayTechnicalSheet() {
        System.out.println("Título da música: " + this.getTitle());
        System.out.println("Ano de lançamento da música: " + this.getYear());
        System.out.println("Número de avaliações: " + this.getTotalEvaluation());
        System.out.println(String.format("Nota da música: %.2f", this.averageGrade()));
    }
}

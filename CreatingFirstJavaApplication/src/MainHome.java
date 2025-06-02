import java.util.Scanner;

public class MainHome {
    Scanner reading = new Scanner(System.in);

    String music;
    String artist;
    int duration;
    double noteMusic;
    double assessment;
    int counterAssessment = 1;
    int classification;

    public static void main(String[] args) {
        MainHome home = new MainHome();

        System.out.println("Bem-vindo ao SpotifyFalso: ");
        home.addMusic();
        home.addMusicRating();
        home.returnAverage();
        home.returnClassification();
        home.displayTechnicalDataSheetOnScreen();
    }

    public void addMusic() {
        System.out.print("Digite o nome da música: ");
        music = reading.nextLine();

        System.out.print("Digite o nome do artista: ");
        artist = reading.nextLine();

        System.out.print("Digite a duração da música em segundos: ");
        duration = reading.nextInt();
    }

    public void displayTechnicalDataSheetOnScreen() {
        String durationTotalPerMinutes = calcDurationTotalPerMinutes();
        String starClassification =  showVisuallyStars(classification);

        String technicalSheet = """
                Música: %s
                Artista: %s
                Duração em segundos: %d
                Duração real: %s
                Avaliação (nota): %.2f
                Estrelas: %s
                """;

        System.out.println(showVisuallyStars(50));
        System.out.print(String.format(
                technicalSheet, music, artist, duration, durationTotalPerMinutes, noteMusic, starClassification
        ));
        System.out.println(showVisuallyStars(50));
    }

    public void addMusicRating() {
        System.out.print("Quantas notas deseja adicionar? ");
        int totalNotesChosen = reading.nextInt();

        while (counterAssessment <= totalNotesChosen) {
            System.out.print("Avaliação " + counterAssessment + ": ");
            double assessment = reading.nextDouble();
            this.assessment += assessment;
            counterAssessment++;
        }
    }

    public void returnAverage() {
        noteMusic = (assessment) / (counterAssessment - 1);
    }
    
    public void returnClassification() {
        classification = (int) noteMusic / 2;
    }

    public String showVisuallyStars(int operatorCount) {
        String textStar = "";

        for (int i = 0; i < operatorCount; i++) {
            textStar += "*";
        }

        return textStar;
    }

    public int returnDurationPerMinutes() {
        int durationPerMinutes = 0;

        for (int i = 0; i <= duration; i += 60) {
            durationPerMinutes = i;
        }

        return durationPerMinutes;
    }

    public String calcDurationTotalPerMinutes() {
        int durationPerMinute = returnDurationPerMinutes();
        int remainingDuration = duration - durationPerMinute;

        return String.format("%d minutos e %d segundos", (durationPerMinute/60), remainingDuration);
    }
}

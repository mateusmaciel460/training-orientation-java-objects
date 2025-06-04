package br.com.mateusmaciel460.appmusic.models;

public class MainMusic {
    public static void main(String[] args) {
        MainMusic mainMusic = new MainMusic();
        Preferences preferences = new Preferences();

        // Chop Suey, System Of A Down
        Music chopSuey = new Music();
        chopSuey.setTitle("chopSuey");
        chopSuey.setAlbum("Toxicity");
        chopSuey.setSinger("System Of A Down");
        chopSuey.setGenre("Rock Metal");

        mainMusic.runSimulatorLoop(chopSuey, 3000, 1200);
        preferences.includeInPreference(chopSuey);

        // Podcast, Flow Podcast
        Podcast flow = new Podcast();
        flow.setTitle("Flow Podcast");
        flow.setHost("Igor 3k");
        flow.setDescription("Flow Podcast dirigido pelo host Igor 3k");

        mainMusic.runSimulatorLoop(flow, 502, 2000);
        preferences.includeInPreference(flow);
    }

    public void runSimulatorLoop(Audio audio, int limitLike, int limitPlay) {
        for (int i = 0; i <= limitLike; i++) {
            audio.setTotalLikes(i);
        }

        for (int i = 0; i <= limitPlay; i++) {
            audio.setTotalPlays(i);
        }
    }
}

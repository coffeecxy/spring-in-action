package foo.bar;

import org.springframework.stereotype.Component;

import java.util.List;

//@Component
public class BlankDisc implements CompactDisc {
    private String title;
    private String artist;
    private List<String> tracks;

    public BlankDisc(String title, String artist, List<String> tracks) {
        this.title = title;
        this.artist = artist;
        this.tracks = tracks;
    }

    public BlankDisc() {

    }

    @Override
    public void play() {
        System.out.println("playing " + title + " by " + artist);
        for (String track : tracks) {
            System.out.println("-Track: " + track);
        }
    }
}

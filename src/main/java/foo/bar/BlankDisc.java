package foo.bar;

import org.springframework.stereotype.Component;

@Component
public class BlankDisc implements CompactDisc {
    private String title;
    private String artist;

    public BlankDisc(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    @Override
    public void play() {
        System.out.println("playing " + title + " by " + artist);
    }
}

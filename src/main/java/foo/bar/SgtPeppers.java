package foo.bar;

import org.springframework.stereotype.Component;

@Component
public class SgtPeppers implements CompactDisc {
    private String title = "sgt. apapappa";
    private String artist = "the beat";

    @Override
    public void play() {
        System.out.println("playing " + title + " by " + artist);
    }

}

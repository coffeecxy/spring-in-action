package foo.bar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
//@ComponentScan
public class CDPlayerConfig {

//    @Bean
//    public SgtPeppers sgtPeppers() {
//        return new SgtPeppers();
//    }

    @Bean
    public CompactDisc blankDisc() {
        List<String> tracks = new ArrayList<String>();
        tracks.add("track1");
        tracks.add("track2");
        tracks.add("track3");
        tracks.add("track4");
        tracks.add("track5");
        return new BlankDisc("A","B",tracks);
    }

//    @Bean
//    public MediaPlayer cdPlayer() {
//        return new CDPlayer(sgtPeppers());
//    }

    @Bean
    public MediaPlayer cdPlayer(CompactDisc disc) {
        return new CDPlayer(disc);
    }

}

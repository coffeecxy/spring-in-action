package foo.bar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan
public class CDPlayerConfig {

    @Bean
    public SgtPeppers sgtPeppers() {
        return new SgtPeppers();
    }
//    @Bean
//    public BlankDisc blankDisc() {
//        return new BlankDisc("A","B");
//    }

    @Bean
    public MediaPlayer cdPlayer() {
        return new CDPlayer(sgtPeppers());
    }

    @Bean
    public MediaPlayer anotherCdPlayer(CompactDisc disc) {
        return new CDPlayer(disc);
    }
}

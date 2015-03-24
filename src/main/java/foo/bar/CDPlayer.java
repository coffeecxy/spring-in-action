package foo.bar;

import jdk.nashorn.internal.ir.debug.PrintVisitor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class CDPlayer implements MediaPlayer {
    private CompactDisc disc;

    @Autowired
    public CDPlayer(CompactDisc disc) {
        this.disc = disc;
    }

    public CDPlayer() {

    }

    @Override
    public void play() {
        disc.play();
    }
}

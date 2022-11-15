import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MoveTests {

    @Test
    public void rockBeatsScissors() {
        assertTrue(Move.beats(Move.ROCK, Move.SCISSORS));
    }
    @Test
    public void scissorsBeatsPaper() {
        assertTrue(Move.beats(Move.SCISSORS, Move.PAPER));
    }
    @Test
     public void paperBeatsRock() {
        assertTrue(Move.beats(Move.PAPER, Move.ROCK));
    }
    @Test
    public void paperLosesScissors(){
        assertFalse(Move.beats(Move.PAPER,Move.SCISSORS));

    }
}

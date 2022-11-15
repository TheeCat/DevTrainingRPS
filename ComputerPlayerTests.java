import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class ComputerPlayerTests {

    @Test
    public void chooseRock() {
        runMoveTest(0, Move.ROCK);
    }
    @Test
    public void choosePaper() {
        runMoveTest(1, Move.PAPER);
    }
    @Test
    public void chooseScissors() {
        runMoveTest(2, Move.SCISSORS);
    }
    private static void runMoveTest(int randomValue, int expected) {
        //arrange
        Random fakeRandom = makeFakeRandom(1);
        ComputerPlayer player = new ComputerPlayer(fakeRandom);
        //act
        int move = player.chooseMove();
        //assert
        assertEquals(expected, move);
    }

    private static Random makeFakeRandom(final int randomValue) {
        return new Random() {
            @Override
            public int nextInt(int bound) {
                return randomValue;
            }
        };
    }
}
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTests {

    @Test
    public void playerACanWin() {
        //arrange
        Player playerA = new ConstantMovePlayer(Move.ROCK), playerB = new ConstantMovePlayer(Move.SCISSORS);
        Game game = new Game(playerA, playerB);
        //act
        game.play();
        //assert
        assertEquals(playerA, game.getWinner());
    }
    @Test
    public void playerBCanWin() {
        //arrange
        Player playerA = new ConstantMovePlayer(Move.SCISSORS), playerB = new ConstantMovePlayer(Move.ROCK);
        Game game = new Game(playerA, playerB);
        //act
        game.play();
        //assert
        assertEquals(playerB, game.getWinner());
    }


    private class ConstantMovePlayer implements Player {

        private final int move;

        public ConstantMovePlayer(int move) {
            this.move = move;
        }

        @Override
        public int chooseMove() {
            return move;
        }
    }
}

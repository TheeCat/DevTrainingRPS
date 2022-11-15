public class Game {

    private final Player playerA;
    private final Player playerB;
    private Player winner;

    public Game(Player playerA, Player playerB) {
        this.playerA = playerA;
        this.playerB = playerB;
    }

    public void play() {
        int playerAMove = playerA.chooseMove();
        int playerBMove = playerB.chooseMove();

        if (Move.beats(playerAMove, playerBMove)) {
            winner = playerA;
        } else if (Move.beats(playerBMove, playerAMove)){
            winner = playerB;
        }
    }

    public Player getWinner() {
        return winner;
    }
}

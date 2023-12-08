import java.util.List;
import java.util.ArrayList;
// Each player will start with seven cards. Check if their hand is full to win.
// Deal, switch, and removed cards from the hand.
// Card face, up.
public class Game {
    private boolean iswild;
    private List<Player> players;
    private Deck deck;

    public Game(List<Player> players) {
        this.players = players;
        this.deck = new Deck();
    }

    public void startgame() {
    // Deal cards, then intitiate
    }
}

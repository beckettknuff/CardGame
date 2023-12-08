import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
//
public class Game {
    private List<Player> players;
    private Deck deck;
    private ArrayList<Card> faceUp;

    public Game(int numberOfPlayers) {
        players = new ArrayList<>();
        for (int i = 1; i <= numberOfPlayers; i++) {
            players.add(new Player("Player" + i));
        }
        deck = new Deck();
        faceUp = new ArrayList<>();
        deck.shuffle();
        dealCards();
    }

    public void dealCards() {
        for (int i = 0; i < 7; i++) {
            for (Player player : players) {
                player.addCard(deck.deal());
            }
        }
        ;
        faceUp.add(deck.deal());
    }

    public boolean playGame() {
        Scanner scanner = new Scanner(System.in);
        boolean gameEnded = false;

        while (!gameEnded) {
            for (Player player : players) {
                System.out.println(player.getName() + "'s turn. Current hand: " + player.getHand());
                System.out.println("Face up pile shows: " + faceUp.get(faceUp.size() - 1));
                System.out.println("Choose: 1 (draw from deck), 2 (draw from face up pile)");
                int choice = scanner.nextInt();
                Card drawnCard = choice == 1 ? deck.deal() : faceUp.remove(faceUp.size() - 1);

                System.out.println("You drew: " + drawnCard);
                player.getHand().add(drawnCard);
                System.out.println("Choose a card to replace (1 to " + player.getHand().size() + "):");
                int faceUpIndex = scanner.nextInt() - 1;
                faceUp.add(player.getHand().remove(faceUpIndex));

                if (checkWin(player)) {
                    System.out.println(player.getName() + "wins!");
                    gameEnded = true;
                    break;
                }
            }
        }
        return false;
    }
    private boolean checkWin (Player player){
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number of players: ");
        int numberOfPlayers = scanner.nextInt();
        Game game = new Game(numberOfPlayers);
        game.playGame();
    }
}

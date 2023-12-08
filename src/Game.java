import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
// Players, deck, and the faceup cards are private
public class Game {
    private List<Player> players;
    private Deck deck;
    private ArrayList<Card> faceUp;

    // Create Game method to initiate the player count and following with a new deck and card shuffle.
    public Game(int numberOfPlayers) {
        players = new ArrayList<>();
        for (int i = 1; i <= numberOfPlayers; i++) {
            players.add(new Player("Player" + i));
        }
        // Shuffle, deal, and chose one card for faceup
        deck = new Deck();
        faceUp = new ArrayList<>();
        deck.shuffle();
        dealCards();
    }

    // For each player deal seven cards
    public void dealCards() {
        for (int i = 0; i < 7; i++) {
            for (Player player : players) {
                player.addCard(deck.deal());
            }
        }
        ;
        faceUp.add(deck.deal());
    }

    // Scanner for system and gameEnded is defaulted to false.
    public boolean playGame() {
        Scanner scanner = new Scanner(System.in);
        boolean gameEnded = false;

        // Print the necessary information such as who's turn, their hand, and the options to choose from per rotation.
        while(!gameEnded) {
            for (Player player : players) {
                System.out.println(player.getName() + "'s turn. Current hand: "+ player.getHand());
                System.out.println("Face up pile shows: " + faceUp.get(faceUp.size() - 1));
                System.out.println("Choose: 1 (draw from deck), 2 (draw from face up pile)");

                int choice = scanner.nextInt();
                Card drawnCard = choice == 1 ? deck.deal() : faceUp.remove(faceUp.size() - 1);

                System.out.println("You drew: " + drawnCard);
                player.getHand().add(drawnCard);
                System.out.println("Choose a card to replace (1 to " + player.getHand().size() + "):");

                int faceUpIndex = scanner.nextInt() - 1;
                faceUp.add(player.getHand().remove(faceUpIndex));

                // If the player has won print the player and gamEnded is true.
                if (checkWin(player)) {
                    System.out.println(player.getName() + "wins!");
                    gameEnded = true;
                    break;
                }
            }
        }
        return false;
    }

    // Otherwise checkwin is false unless a players hand is a winning pearl.
    private boolean checkWin (Player player){
        return false;
    }
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number of players: ");
        int numberOfPlayers = scanner.nextInt();
        Game game = new Game(numberOfPlayers);
        game.playGame();
    }
}

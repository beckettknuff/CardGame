import java.util.Stack;
import java.util.Collections;

public class Deck {
    private Stack<Card> cards;

    // Using an Array of string for both suits and ranks.
    public Deck () {
        cards = new Stack<>();
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

    for (String suit : suits) {
        for (String rank : ranks) {
            cards.push(new Card(suit, rank));
        }
    }
    shuffle();
    }

    // Getters for if the Deck isEmpty, shuffle, and dealing.
    public boolean isEmpty() {
        return cards.isEmpty();
    }
    public void shuffle() { Collections.shuffle(cards); }
    public Card deal() {
        if (!isEmpty()) {
            return cards.pop();
        }
        return null;
    }
}
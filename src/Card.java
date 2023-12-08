public class Card {
    private String suit;
    private String rank;

    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    // Getters for suit and rank
    public String getSuit() {
        return suit;
    }

    public String getRank() {
        return rank;
    }

    // toString to properly return both
    public String toString() {
        return rank + " of " + suit;
    }
}
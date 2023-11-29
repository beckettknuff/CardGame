import java.util.ArrayList;

public class Card {
    private int point;
    private String suit;
    private String rank;

    public Card (int point, String suit, String rank) {
        this.point = point;
        this.suit = suit;
        this.rank = rank;
    }

    // return each variable
    public int getPoint() {
        return point;
    }
    public String getSuit() {
        return suit;
    }
    public String getRank() {
        return rank;
    }

    // this.( - ) setting methods
    public void setPoint(int point) {
        this.point = point;
    }
    public void setSuit(String suit) {
        this.suit = suit;
    }
    public void setRank(String rank) {
        this.rank = rank;
    }
    // toString to properly return both
    public String toString() {
        return rank + " of " + suit;
    }

    import java.util.ArrayList;
    public class Deck {
        private ArrayList<Card> cards;
        private int cardsLeft;

        public Deck (String[] ranks, String[] suits, int[] values) {
            cards = new ArrayList<>();
            for (int i = 0; i < ranks.length; i++) {
                for (String suit : suits) {
                    cards.add(new Card(ranks[i], suit, values[i]));
                }
            }
        }
        public boolean isEmpty() {
            return cardsLeft == 0
        }

        public int getCardsLeft() {
            return cardsLeft;
        }

        public Card deal() {

        }

        public void shuffle() {

        }
    }

    // Player Class
    public class Player {
        private String name;
        private ArrayList<Card> hand;
        private int points;

        public Player (String name) {
            this.name = name;
            this.hand = new ArrayList<>();
            this.points = 0;
        }

        public Player (String name, ArrayList<Card> hand) {
            this(name);
            this.hand = hand;
        }

        // Getters
        public String getName() {
            return name;
        }
        public ArrayList<Card> getHand() {
            return hand;
        }
        public int getPoints() {
            return points;
        }

        public void addCard(int points) {
            this.points += points;
        }

        public void addCard(Card card) {
            hand.add(card);
        }

        public String toString() {
            return name + " has " + points + " points\n" + name + "'s cards: " + hand;
        }
    }
}

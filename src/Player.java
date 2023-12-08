import java.util.ArrayList;
// Player Class
public class Player {
    private String name;
    private ArrayList<Card> hand;

    public Player (String name) {
        this.name = name;
        this.hand = new ArrayList<>();
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

    public void addCard(Card card) {
        hand.add(card);
    }

    public void removeCard(Card card) { hand.remove(card); }

    public String toString() {
        String show = name + "'s cards: ";
        for (Card card : hand) {
            show += "\n" + card.toString();
        }
        return show;
    }
}


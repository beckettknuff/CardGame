import java.util.ArrayList;
// Player Class
public class Player {
    private String name;
    private ArrayList<Card> hand;

    public Player (String name) {
        this.name = name;
        this.hand = new ArrayList<>();
    }

    // Getters
    public void addCard(Card card) {
        hand.add(card);
    }
    public Card removeCard(int index) {
        return hand.remove(index);
    }
    public String getName() {
        return name;
    }
    public ArrayList<Card> getHand() {
        return hand;
    }
    public String toString() {
        String show = name + "'s cards: ";
        for (Card card : hand) {
            show += "\n" + card.toString();
        }
        return show;
    }
}


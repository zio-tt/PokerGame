package poker.model;

import java.util.ArrayList;
import java.util.List;

public class Hand {
  private List<Card> hand;

  // Constructor
  public Hand(Deck deck) {
    List<Card> newHand = new ArrayList<Card>();

    for(int i = 0; i < 5; i++) {
      Card drawCard = deck.draw();
      newHand.add(drawCard);
    }

    this.hand = newHand;
  }

  // Getter
  public List<Card> getHand() { return hand; }
}

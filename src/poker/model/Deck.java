package poker.model;

import java.util.List;
import java.util.Random;
import poker.model.Deck;

public class Deck {
  private List<Card> deck;

  // Constructor
  public Deck(){
    this.deck = Card.createCardList();
  }

  // Getter
  public List<Card> getDeck() { return deck; }

  // Setter
  public void setDeck(List<Card> newDeck) {
    this.deck = newDeck;
  }

  public Card draw () {
    // 現在のデッキを取得
    List<Card> deck  = getDeck();

    // 引いたカードをデッキから削除
    Card drawCard = getRandomCard(deck);
    deck.remove(deck.indexOf(drawCard));
    setDeck(deck);

    // 引いたカードを返す
    return drawCard;
  }

  public static Card getRandomCard(List<Card> deck) {
    Random rnd = new Random();
    int index = rnd.nextInt(deck.size());
    Card drawCard = deck.get(index);

    return drawCard;
  }
}

package poker.gui;

import poker.PokerGame;
import java.awt.*;

public class PokerButton {
  public static Button standardButton (PokerGame pokerGame, String text) {
    Button button = new Button(text);

    return button;
  }
}

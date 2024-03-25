package poker;

// 型・サブクラスの読み込み
import java.util.List;
import java.util.ArrayList;
import poker.model.Deck;
import poker.model.Hand;

// GUIの読み込み
import poker.gui.PokerLabel;
import poker.gui.PokerButton;

// フレームを利用するためのクラス
import javax.swing.*;
import java.awt.*;

public class PokerGame extends Frame {
  // Frameがシリアライズ可能クラスであるため、バージョン管理のためのシリアルIDを付与する
  private static final long serialVersionUID = 1L;

  // mainで使用するサブクラスを定義
  private static Deck deck;
  private static Hand hand;
  private static List<String> yourHand;

  // Constructor
  PokerGame() {
    super("PokerGame");
    setSize(400, 300);
    setLocationRelativeTo(null);

    // サブクラスの初期化
    initSubClass();
    drawInitHand();
  }

  public static void main(String[] args){
    PokerGame pokerGame = new PokerGame();
    gameStart(pokerGame);
  }

  private static void initSubClass() {
    deck = new Deck();
    hand = new Hand(deck);
    yourHand = new ArrayList<String>();
  }

  private static void drawInitHand() {
    hand.getHand().forEach(card -> 
      yourHand.add(card.getCard())
    );
  }

  public static void gameStart(PokerGame pokerGame) {
    // ゲーム開始宣言
    // フローレイアウト（左上から流し込み）
    pokerGame.setLayout(new GridLayout(2, 1));

    // 宣言文の表示
    Label  exLabel = PokerLabel.standardLabel(pokerGame, "PokerGame: Start");
    Button startButton = PokerButton.standardButton(pokerGame, "Game Start");

    pokerGame.add(exLabel);
    pokerGame.add(startButton);

    pokerGame.setVisible(true);
  }
}
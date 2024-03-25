package poker.model;

import java.util.ArrayList;
import java.util.List;

public class Card {
    private String suit;
    private Integer number;

    public Card(String suit, Integer number) {
        this.suit = suit;
        this.number = number;
    }

    // Getterメソッド
    // フィールドを直接参照して更新されるのを防ぐ
    public String getSuit() { return suit; }
    public Integer getNumber() { return number; }
    public String getCard() { return suit + " " + Integer.toString(number); }

    // トランプのカードリストを生成するメソッド
    public static List<Card> createCardList() {
        // トランプのスーツ（柄）は固定数なので配列を使用する
        String[] suits = {"H", "D", "S", "C"};
        // カードリストは53種（Joker込み）で固定数だが、
        // for文を用いて52種類作成した後にJokerを追加するため変動できるようにArrayListクラスのインスタンスとして作成する
        // 通常、特別な理由がない場合Listを用いた方が柔軟性が高まる
        List<Card> cardList = new ArrayList<>();
        for (String suit : suits) {
            for (int number = 1; number <= 13; number++) {
                cardList.add(new Card(suit, number));
            }
        }
        // Jokerの追加
        cardList.add(new Card("Joker", 0));
        return cardList;
    }
}

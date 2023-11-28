package com.blackjack;

public class Card {
    private Suit suit;
    private Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Card(String suit , String rank) {
        this(Suit.valueOf(suit.toUpperCase()) , Rank.valueOf(rank.toUpperCase()));
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public int getValue()
    {
        return rank.getValue();
    }

    @Override
    public String toString() {
        return rank.toString() + " " + suit.toString();
    }

    public static void main(String[] args) {
        Card card  = new Card(Suit.CLUBS , Rank.JACK);
        Card card2  = new Card(Suit.DIAMONDS , Rank.TEN);
        Card card3 = new Card("hearts" , "three");

        System.out.println(card);
        System.out.println(card2);
        System.out.println(card3);

  }

}
package com.blackjack;

public enum Rank {
    ACE,
    TWO,
    THREE,
    FOUR,
    FIVE,
    SEX,
    SEVEN,
    EIGHT,
    NINE,
    TEN,
    JACK,
    QUEEN,
    KING;

    public int getValue()
    {
        return switch (this)
        {
            case JACK , KING ,QUEEN -> 10;
            default -> ordinal() + 1;
        };
    }
}

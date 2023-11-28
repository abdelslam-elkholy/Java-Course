package com.blackjack;

public enum Rank {
    ACE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SEX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(10),
    QUEEN(10),
    KING(10);

    private int value;

    Rank(int value) {
        this.value = value;
    }

    public int getValue()
    {
//        return switch (this)
//        {
//            case JACK , KING ,QUEEN -> 10;
//            default -> ordinal() + 1;
//        };
        return value;
    }
}

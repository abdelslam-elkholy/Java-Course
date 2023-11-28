package com.blackjack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SuitTest {

    @Test
    void getHeartValue() {
        assertEquals("\u2665" , Suit.HEARTS.toString());
    }
}
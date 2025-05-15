package com.yourname.flashcard;

import java.util.ArrayList;
import java.util.List;

public class FlashCardManager {
    private List<FlashCard> cards = new ArrayList<>();

    public void addCard(FlashCard card) {
        cards.add(card);
    }

    public List<FlashCard> getAllCards() {
        return cards;
    }
}

package com.yourname.flashcard;

import java.util.Collections;
import java.util.List;


public class RandomCardOrganizer implements CardOrganizer {
    @Override
    public List<FlashCard> organize(List<FlashCard> cards) {
        Collections.shuffle(cards);
        return cards;
    }
}

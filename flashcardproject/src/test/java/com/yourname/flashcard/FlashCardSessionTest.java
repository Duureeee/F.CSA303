package com.yourname.flashcard;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

public class FlashCardSessionTest {

    @Test
    public void testSessionWithRandomOrganizer() {
        FlashCard card1 = new FlashCard("Q1", "A1");
        FlashCard card2 = new FlashCard("Q2", "A2");
        List<FlashCard> cards = Arrays.asList(card1, card2);

        CardOrganizer organizer = new RandomCardOrganizer();
        FlashCardSession session = new FlashCardSession(cards, organizer);

        List<FlashCard> sessionCards = session.getSessionCards();

        // Should contain same cards but order may differ
        assertEquals(2, sessionCards.size());
        assertTrue(sessionCards.contains(card1));
        assertTrue(sessionCards.contains(card2));
    }
}

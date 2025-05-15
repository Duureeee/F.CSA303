package com.yourname.flashcard;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

public class RecentMistakesFirstSorterTest {

    @Test
    public void testOrganizeSortsByTimesWrongDescending() {
        FlashCard card1 = new FlashCard("Q1", "A1");
        FlashCard card2 = new FlashCard("Q2", "A2");
        FlashCard card3 = new FlashCard("Q3", "A3");

        // Set mistake counts
        for (int i = 0; i < 3; i++) card1.markWrong();
        for (int i = 0; i < 5; i++) card2.markWrong();
        for (int i = 0; i < 1; i++) card3.markWrong();

        List<FlashCard> cards = Arrays.asList(card1, card2, card3);

        RecentMistakesFirstSorter sorter = new RecentMistakesFirstSorter();
        List<FlashCard> sorted = sorter.organize(cards);

        // card2 should be first (5 wrong), then card1 (3 wrong), then card3 (1 wrong)
        assertEquals(card2, sorted.get(0));
        assertEquals(card1, sorted.get(1));
        assertEquals(card3, sorted.get(2));
    }
}

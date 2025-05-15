package flashcardproject.src.test.java.com.yourname.flashcard;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class RecentMistakesFirstSorterTest {

    @Test
    public void testSort() {
        FlashCard card1 = new FlashCard("What is the capital of Mongolia?", "Ulaanbaatar");
        card1.setMistakeCount(3);

        FlashCard card2 = new FlashCard("What is the largest planet in our solar system?", "Jupiter");
        card2.setMistakeCount(1);

        List<FlashCard> cards = List.of(card1, card2);

        RecentMistakesFirstSorter sorter = new RecentMistakesFirstSorter();
        List<FlashCard> sortedCards = sorter.sort(cards);

        assertEquals("What is the capital of Mongolia?", sortedCards.get(0).getQuestion());
        assertEquals("What is the largest planet in our solar system?", sortedCards.get(1).getQuestion());
    }
}

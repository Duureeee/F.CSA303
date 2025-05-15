package flashcardproject.src.test.java.com.yourname.flashcard;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FlashCardSessionTest {

    @Test
    public void testSessionInitialization() {
        FlashCard card = new FlashCard("What is the capital of Mongolia?", "Ulaanbaatar");
        FlashCardSession session = new FlashCardSession();

        session.addCard(card);
        assertTrue(session.getCards().contains(card));
    }

    @Test
    public void testAnswerTracking() {
        FlashCard card = new FlashCard("What is the chemical symbol for water?", "H2O");
        FlashCardSession session = new FlashCardSession();
        session.addCard(card);

        session.answerCard(card, true);  // Assuming true means the answer is correct
        assertEquals(1, session.getCorrectAnswers());
    }
}
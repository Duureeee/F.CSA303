package flashcardproject.src.main.java.com.yourname.flashcard;

import java.util.Collections;
import java.util.List;

public class RandomCardOrganizer implements CardOrganizer {
    @Override
    public List<FlashCard> organizeCards(List<FlashCard> flashCards) {
        Collections.shuffle(flashCards);
        return flashCards;
    }
}
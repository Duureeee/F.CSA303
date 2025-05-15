package flashcardproject.src.main.java.com.yourname.flashcard;

import java.util.List;

public class WorstFirstCardOrganizer implements CardOrganizer {
    @Override
    public List<FlashCard> organizeCards(List<FlashCard> flashCards) {
        // Хамгийн муу гүйцэтгэлтэй картуудыг эхлээд үзэх логик
        return flashCards;  // Энэ хэсэгт муу гүйцэтгэлийн алгоритм оруулах хэрэгтэй
    }
}
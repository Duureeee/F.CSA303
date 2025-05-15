package flashcardproject.src.main.java.com.yourname.flashcard;

import java.util.List;

public class RecentMistakesFirstSorter implements CardOrganizer {
    @Override
    public List<FlashCard> organizeCards(List<FlashCard> flashCards) {
        // Сүүлд алдаж байсан картуудыг эхлээд үзэх логик
        return flashCards;  // Энэ хэсэгт алдаагийн алгоритм оруулах хэрэгтэй
    }
}
package flashcardproject.src.main.java.com.yourname.flashcard;

import java.util.List;

public class AchievementTracker {
    public void trackAchievements(List<FlashCard> flashCards) {
        int correctCount = 0;

        for (FlashCard card : flashCards) {
            if (card.getUserAnswer().equalsIgnoreCase(card.getAnswer())) {
                correctCount++;
            }
        }

        System.out.println("You got " + correctCount + " out of " + flashCards.size() + " correct.");
    }
}
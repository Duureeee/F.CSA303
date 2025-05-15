package flashcardproject.src.test.java.com.yourname.flashcard;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AchievementTrackerTest {

    @Test
    public void testAchievementTracking() {
        AchievementTracker tracker = new AchievementTracker();
        
        tracker.trackCorrectAnswer();
        tracker.trackCorrectAnswer();
        tracker.trackIncorrectAnswer();

        assertEquals(2, tracker.getCorrectAnswers());
        assertEquals(1, tracker.getIncorrectAnswers());
    }

    @Test
    public void testGetAchievements() {
        AchievementTracker tracker = new AchievementTracker();
        
        tracker.trackCorrectAnswer();
        tracker.trackCorrectAnswer();

        assertTrue(tracker.getAchievements().contains("Correct answers: 2"));
    }
}
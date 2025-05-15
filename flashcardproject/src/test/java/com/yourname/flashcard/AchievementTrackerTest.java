
package com.yourname.flashcard;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AchievementTrackerTest {
    private AchievementTracker tracker;

    @BeforeEach
    public void setup() {
        tracker = new AchievementTracker();
    }

    @Test
    public void testRecordCorrect() {
        tracker.recordCorrect();
        tracker.recordCorrect();
        assertEquals(2, tracker.getCorrectCount());
    }

    @Test
    public void testRecordRepeat() {
        tracker.recordRepeat();
        assertEquals(1, tracker.getRepeatCount());
    }

    @Test
    public void testRecordConfident() {
        tracker.recordConfident();
        tracker.recordConfident();
        tracker.recordConfident();
        assertEquals(3, tracker.getConfidentCount());
    }
}

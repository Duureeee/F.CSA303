package com.yourname.flashcard;

public class AchievementTracker {
    private int correctCount = 0;
    private int repeatCount = 0;
    private int confidentCount = 0;

    public void recordCorrect() {
        correctCount++;
    }

    public void recordRepeat() {
        repeatCount++;
    }

    public void recordConfident() {
        confidentCount++;
    }

    public int getCorrectCount() {
        return correctCount;
    }

    public int getRepeatCount() {
        return repeatCount;
    }

    public int getConfidentCount() {
        return confidentCount;
    }
}
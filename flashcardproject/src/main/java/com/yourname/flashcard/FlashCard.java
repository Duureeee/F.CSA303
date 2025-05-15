package com.yourname.flashcard;

public class FlashCard {
    private String question;
    private String answer;
    private int timesCorrect;
    private int timesWrong;

    public FlashCard(String question, String answer) {
        this.question = question;
        this.answer = answer;
        this.timesCorrect = 0;
        this.timesWrong = 0;
    }
    
    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public void markCorrect() {
        timesCorrect++;
    }

    public void markWrong() {
        timesWrong++;
    }

    public int getTimesCorrect() {
        return timesCorrect;
    }

    public int getTimesWrong() {
        return timesWrong;
    }
}
package com.yourname.flashcard;


import java.util.List;

public class FlashCardSession {
    private List<FlashCard> sessionCards;
    private CardOrganizer organizer;

    public FlashCardSession(List<FlashCard> cards, CardOrganizer organizer) {
        this.organizer = organizer;
        this.sessionCards = organizer.organize(cards);
    }

    public List<FlashCard> getSessionCards() {
        return sessionCards;
    }
}

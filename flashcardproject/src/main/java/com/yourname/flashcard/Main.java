package com.yourname.flashcard;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        FlashCardManager manager = new FlashCardManager();

        manager.addCard(new FlashCard("What is Java?", "A programming language"));
        manager.addCard(new FlashCard("What is JVM?", "Java Virtual Machine"));
        manager.addCard(new FlashCard("What is OOP?", "Object Oriented Programming"));

        CardOrganizer organizer = new RandomCardOrganizer();  // Or WorstFirstCardOrganizer, etc.
        FlashCardSession session = new FlashCardSession(manager.getAllCards(), organizer);

        List<FlashCard> cardsForSession = session.getSessionCards();

        for (FlashCard card : cardsForSession) {
            System.out.println("Q: " + card.getQuestion());
            System.out.println("A: " + card.getAnswer());
            System.out.println();
        }
    }
}
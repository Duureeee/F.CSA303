package com.yourname.flashcard;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FlashCardManager manager = new FlashCardManager();
        try {
            manager.loadCardsFromFile("resources/sample_cards.txt");
            FlashCard randomCard = manager.getRandomCard();
            if (randomCard != null) {
                System.out.println("Random Question: " + randomCard.getQuestion());
                System.out.println("Answer: " + randomCard.getAnswer());
            } else {
                System.out.println("No cards found.");
            }
        } catch (IOException e) {
            System.out.println("Error reading card file: " + e.getMessage());
        }
    }
}

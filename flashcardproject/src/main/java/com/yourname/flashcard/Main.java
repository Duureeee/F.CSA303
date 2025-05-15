package com.yourname.flashcard;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FlashCardManager manager = new FlashCardManager();

        if (manager.isEmpty()) {
            System.out.println("No flashcards found. Please check your sample_cards.txt file.");
            return;
        }

        List<FlashCard> flashCards = manager.getRandomFlashCards(10);
        try (Scanner scanner = new Scanner(System.in)) {
            int correctCount = 0;

            System.out.println("Flashcard quiz! Answer the following questions:\n");

            for (FlashCard card : flashCards) {
                System.out.println("Question: " + card.getQuestion());
                System.out.print("Your answer: ");
                String userAnswer = scanner.nextLine().trim();

                if (userAnswer.equalsIgnoreCase(card.getAnswer())) {
                    System.out.println("Correct!\n");
                    correctCount++;
                } else {
                    System.out.println("Incorrect! Correct answer: " + card.getAnswer() + "\n");
                }
            }

            System.out.println("Quiz finished! You answered " + correctCount + " out of " + flashCards.size() + " correctly.");
        }
    }
}

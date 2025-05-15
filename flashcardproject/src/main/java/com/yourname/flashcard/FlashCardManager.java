package com.yourname.flashcard;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class FlashCardManager {
    private final List<FlashCard> allCards;

    public FlashCardManager() {
        this.allCards = loadFlashCardsFromResource("sample_cards.txt");
    }

    private List<FlashCard> loadFlashCardsFromResource(String fileName) {
        List<FlashCard> cards = new ArrayList<>();
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(fileName);
        if (inputStream == null) {
            throw new RuntimeException(fileName + " not found in resources folder!");
        }

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
            String question = null;
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.startsWith("Question:")) {
                    question = line.substring("Question:".length()).trim();
                } else if (line.startsWith("Answer:") && question != null) {
                    String answer = line.substring("Answer:".length()).trim();
                    cards.add(new FlashCard(question, answer));
                    question = null;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cards;
    }

    public List<FlashCard> getRandomFlashCards(int count) {
        List<FlashCard> copy = new ArrayList<>(allCards);
        Collections.shuffle(copy);
        return copy.subList(0, Math.min(count, copy.size()));
    }

    public boolean isEmpty() {
        return allCards.isEmpty();
    }
}

package com.yourname.flashcard;
import java.io.*;
import java.util.*;

public class FlashCardManager {
    private List<FlashCard> cards = new ArrayList<>();

    public void loadCardsFromFile(String filePath) throws IOException {
        cards.clear();
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        String question = null;
        while ((line = reader.readLine()) != null) {
            line = line.trim();
            if (line.startsWith("Question:")) {
                question = line.substring(9).trim();
            } else if (line.startsWith("Answer:") && question != null) {
                String answer = line.substring(7).trim();
                cards.add(new FlashCard(question, answer));
                question = null;
            }
        }
        reader.close();
    }

    public FlashCard getRandomCard() {
        if (cards.isEmpty()) {
            return null;
        }
        Random random = new Random();
        return cards.get(random.nextInt(cards.size()));
    }

    public List<FlashCard> getAllCards() {
        return cards;
    }
}


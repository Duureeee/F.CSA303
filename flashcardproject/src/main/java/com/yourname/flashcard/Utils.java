package flashcardproject.src.main.java.com.yourname.flashcard;

import java.io.*;
import java.util.*;

public class Utils {
    public static List<FlashCard> loadCardsFromFile(String fileName) {
        List<FlashCard> flashCards = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            String question = null;
            while ((line = reader.readLine()) != null) {
                if (line.startsWith("Question:")) {
                    if (question != null) {
                        flashCards.add(new FlashCard(question, line.substring(9).trim()));
                    }
                    question = line.substring(9).trim();
                } else if (line.startsWith("Answer:") && question != null) {
                    flashCards.add(new FlashCard(question, line.substring(7).trim()));
                    question = null;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return flashCards;
    }
}

package com.yourname.flashcard;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class RecentMistakesFirstSorter implements CardOrganizer {
    @Override
    public List<FlashCard> organize(List<FlashCard> cards) {
        // Placeholder: Without timestamps, just sort by wrong count descending
        return cards.stream()
                .sorted(Comparator.comparingInt(FlashCard::getTimesWrong).reversed())
                .collect(Collectors.toList());
    }
}

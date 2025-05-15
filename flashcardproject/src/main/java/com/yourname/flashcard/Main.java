package flashcardproject.src.main.java.com.yourname.flashcard;


import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<FlashCard> flashCards;  // flashCards хувьсагч

    public static void main(String[] args) {
        // Файлнаас картуудыг ачаалаад `flashCards` жагсаалтанд хадгална
        flashCards = FlashCardManager.loadCardsFromFile("C:\\Users\\Dell\\Documents\\python\\F.CSA303\\F.CSA303\\flashcardproject\\resources\\sample_cards.txt");

        // Хэрэглэгчийн хариулт авах
        Scanner scanner = new Scanner(System.in);
        CardOrganizer cardOrganizer = new RandomCardOrganizer();  // Random буюу өөр хүссэн дарааллын хэрэгжүүлэлт
        List<FlashCard> organizedCards = cardOrganizer.organizeCards(flashCards);  // Хэрэв та картын дарааллыг зохион байгуулбал
        for (FlashCard card : organizedCards) {
            System.out.println("Question: " + card.getQuestion());
            System.out.print("Your Answer: ");
            String userAnswer = scanner.nextLine();
            card.setUserAnswer(userAnswer);  // Хэрэглэгчийн хариулт хадгалах
            System.out.println("Correct Answer: " + card.getAnswer() + "\n");
        }

        AchievementTracker tracker = new AchievementTracker();
        tracker.trackAchievements(organizedCards);  // Хариултуудыг шалгах
        scanner.close();
    }
}

import java.util.Scanner;

public class BlackjackGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deck deck = new Deck();

        int playerTotal = 0;
        int dealerTotal = 0;

        System.out.println("=== Welcome to Blackjack ===");

        // Deal initial cards
        Card playerCard1 = deck.draw();
        Card playerCard2 = deck.draw();
        playerTotal = playerCard1.getBlackjackValue() + playerCard2.getBlackjackValue();

        Card dealerCard1 = deck.draw();
        Card dealerCard2 = deck.draw();
        dealerTotal = dealerCard1.getBlackjackValue() + dealerCard2.getBlackjackValue();

        System.out.println("Your cards: " + playerCard1 + ", " + playerCard2 + " (Total: " + playerTotal + ")");
        System.out.println("Dealer shows: " + dealerCard1);

        String choice;
        while (playerTotal < 21) {
            System.out.print("Do you want to hit or stand? (h/s): ");
            choice = sc.nextLine();
            if (choice.equalsIgnoreCase("h")) {
                Card newCard = deck.draw();
                playerTotal += newCard.getBlackjackValue();
                System.out.println("You drew: " + newCard + " (Total: " + playerTotal + ")");
            } else break;
        }

        // Dealer hits until 17+
        while (dealerTotal < 17) {
            Card newCard = deck.draw();
            dealerTotal += newCard.getBlackjackValue();
        }

        System.out.println("Dealer total: " + dealerTotal);
        if (playerTotal > 21) System.out.println("You bust! Dealer wins.");
        else if (dealerTotal > 21 || playerTotal > dealerTotal) System.out.println("You win!");
        else if (playerTotal == dealerTotal) System.out.println("Push!");
        else System.out.println("Dealer wins!");

        sc.close();
    }
}

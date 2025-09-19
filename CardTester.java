import java.util.ArrayList;
public class CardTester
{
    public static void main(String[] args) {
        ArrayList<Card> cards = new ArrayList<>();
        
        String[] suits = {"Spades", "Clubs", "Hearts","Diamonds"};
        int[] ranks = {1,2,3,4,5,6,7,8,9,10,11,12,13};
        
        //Card card1 = new Card(5, "Hearts");
        //Card card2 = new Card(5, "Hearts");
        //Card card3 = new Card(10, "Spades");
        //System.out.println("Card1: " + card1);
        //System.out.println("Card2: " + card2);
        //System.out.println("Card3: " + card3);
        
        //System.out.println("Card1 equals Card2: " + card1.equals(card2));
        //System.out.println("Card1 equals Card3: " + card1.equals(card3)); 
        Deck e = new Deck();
        System.out.println(e.getCards());
    }
}

import java.util.ArrayList;

public class Deck
{
    private ArrayList<Card> cards;
    public ArrayList<Card> getCards(){return cards;}
    public Deck(){
        //all 52 cards into cards shuffled
        
        String[] suits = {"Spades", "Clubs", "Hearts","Diamonds"};
        int[] ranks = {1,2,3,4,5,6,7,8,9,10,11,12,13};
        
        cards = new ArrayList <Card>();
        for(String suit : suits){
            for(int rank : ranks){
                Card c = new Card(rank, suit);
                cards.add(c);
                
            }
        }
        int index = 0;
        ArrayList<Card> cardsShuffled = new ArrayList <Card>();
        
        while (cardsShuffled.size() < cards.size()){
            int firstH = index ; //0-25
            int secondH = ((cards.size()/2) + index); //26-52
            index++;
            cardsShuffled.add(cards.get(firstH));
            cardsShuffled.add(cards.get(secondH));
            
        }
        cards = cardsShuffled;
        
    }
}

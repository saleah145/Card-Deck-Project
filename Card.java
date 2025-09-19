import java.util.ArrayList;
public class Card
{
    private int rank;
    private String suit;
    
    public Card(int r, String s){
        rank = r;
        suit = s;
    }
    
    public int getRank(){return rank; }
    public String getSuit() {return suit;}
    
    public boolean equals(Object other){
        Card c = (Card)other;
        if(rank == c.rank && suit.equals(c.suit)) {
            return true;
        }
        return false;
    }
    
    public String toString(){
        return "Rank: " + rank + "Suit: " + suit;
    }
}

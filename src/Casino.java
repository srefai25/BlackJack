import java.util.ArrayList;

public class Casino {

    ArrayList<Cards> deck;
    public static void main(String[] args) {
        Casino table = new Casino();
    }

    public Casino(){

        //loop through each suit 0-3
        //loop through each card number (13 of these, 2 through each ace)
        createDeck();
        printDeck();

    }
    public void createDeck(){
        deck = new ArrayList<>();
        for (int x=0;x<4;x++){
            for (int y=2; y<15; y++) {
                //loop through each card number (13 of these, 2 through each ace)
                deck.add(new Cards(x,y));
            }
        }

    }

    public void printDeck(){
        for (int x=0; x<52; x++){
            deck.get(x).printCardInfo();
        }
    }
}

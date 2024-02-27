import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class DominoPile {
    ArrayList<Domino> pile = new ArrayList<>();
    public DominoPile()
    {

    }
    public void newStack6()
    {
        for (int i = 0; i <= 6; i++) {
            for (int j = i; j <= 6; j++) {
                pile.add(new Domino(i, j));
            }
        }
    }
    public void shuffle()
    {
        Collections.shuffle(pile);
    }
    public ArrayList<Domino> getPile()
    {
        return pile;
    }
}

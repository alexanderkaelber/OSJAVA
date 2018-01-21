package Gruppe7.Logic;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import Gruppe7.Data.*;

public class Planer
{
    // Arraylisten die je einen Spielplan enthalten. Dreidimensionale Arrays.
    private Vorstellung[][][] randomSpielplan;
    private Vorstellung[][][] improvedSpielplan;

    public Planer()
    {
        randomSpielplan = Spielplan.GetRandomSpielplan();
    }

    public void Improve()
    {
        int randomVorstellungIndex = ThreadLocalRandom.current().nextInt(0, randomSpielplan.length);
    }

    // Getter
    public Vorstellung[][][] getImprovedSpielplan() { return improvedSpielplan; }
    public Vorstellung[][][] getRandomSpielplan() {return randomSpielplan; }

    @Override
    public String toString() {
       return Arrays.deepToString(randomSpielplan);
       }
}
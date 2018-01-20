package Gruppe7.Logic;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import Gruppe7.Data.*;

public class Planer
{


    // Arraylisten die je einen Spielplan enthalten. Dreidimensionale Arrays.
    private Vorstellung[][][] randomSpielplan = new Vorstellung[21][4][SaalVerwaltung.getSize()];
    private Vorstellung[][][] improvedSpielplan = new Vorstellung[21][4][SaalVerwaltung.getSize()];

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
}
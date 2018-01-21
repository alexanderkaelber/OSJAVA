package Gruppe7.Logic;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import Gruppe7.Data.*;

public class Planer
{
//    // Arraylisten die je einen Spielplan enthalten. Dreidimensionale Arrays.
//    private Vorstellung[][][] randomSpielplan;
//    private Vorstellung[][][] improvedSpielplan;

    public Planer()
    {
        Spielplan.setSpielplan(Spielplan.CreateRandomSpielplan());
    }

    public void Improve()
    {
     //   int randomVorstellungIndex = ThreadLocalRandom.current().nextInt(0, Spielplan);
    }

}
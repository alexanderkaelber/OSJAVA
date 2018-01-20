package Gruppe7.Logic;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

import Gruppe7.Data.*;

public class Planer
{
    // Arraylisten die je einen Spielplan enthalten
    private ArrayList<Vorstellung> randomSpielplan = new ArrayList<Vorstellung>(

            //Initialerstellung des Plans bei Konstruktorcall
            // Vorstellung[21][Saal.Length][4];
    );
    private ArrayList<Vorstellung> improvedSpielplan = new ArrayList<Vorstellung>();

    public Planer()
    {
        //Constructor
    }

    // Erstellt einen zufälligen Spielplan
    public void CreateRandomSpielplan()
    {
        // Für 21 Tage
        for (int i = 0; i < 21; i++)
        {
            // Für jeden Saal
            for (int j = SaalVerwaltung.getSize(); i > 0; i--)
            {
                // Für jeden Timeslot
                for (int k = 4; i > 0; i++)
                {

                    randomSpielplan.add(new Vorstellung());
                }
            }
        }
    }

    // TODO: Vorstellungen werden bei Nicole erstellt.
//    private Vorstellung createVorstellung()
//    {
//        Kinofilm kinofilm;
//        Werbefilm werbefilm;
//        Saal saal;
//
//
//        int KinofilmIndex = ThreadLocalRandom.current().nextInt(0, FilmVerwaltung.getSize());
//        int WerbefilmIndex = ThreadLocalRandom.current().nextInt(0, WerbefilmVerwaltung.getSize());
//        int SaalIndex = ThreadLocalRandom.current().nextInt(0, SaalVerwaltung.getSize());
//        int eintritt = 7; // TODO: Eintritt variabel gestalten.
//
//        return new Vorstellung(FilmVerwaltung.getFilme().get(KinofilmIndex),
//                                WerbefilmVerwaltung.getWerbefilme().get(WerbefilmIndex),
//                                SaalVerwaltung.getSaele().get(SaalIndex),
//                                , int);
//    }

    //Implementation not clear yet.
    public int RandomNumberGenerator()
    {
        //Code
        return 0;
    }

    private boolean checkGenre()
    {
        //Code
        return false;
    }

    public Spielplan Improve()
    {
        //Code
        return null;
    }

    public Spielplan getImprovedSpielplan()
    {
        //Code
        return null;
    }


}

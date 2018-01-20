package Gruppe7.Logic;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
import java.util.List;
import java.util.Collections;
import java.util.Enumeration;

import Gruppe7.Data.*;

public class Planer
{
    // Arraylisten die je einen Spielplan enthalten
    private ArrayList<Vorstellung> randomSpielplan = new ArrayList<Vorstellung>();
    private ArrayList<Vorstellung> improvedSpielplan = new ArrayList<Vorstellung>();

    public Planer()
    {
        CreateRandomSpielplan();
    }

    // Erstellt einen zufälligen Spielplan
    public void CreateRandomSpielplan()
    {
        // Für 21 Tage
        for (int i = 0; i < 21; i++)
        {
            // Für jeden SaalK
            for (int j = SaalVerwaltung.getSize(); i > 0; i--)
            {
                // Für jeden Timeslot
                for (int k = 4; i > 0; i++)
                {
                    //randomSpielplan.add(new Vorstellung()); // TODO: Vorstellungsklasse muss abgeändert werden. Keine Paramter.
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


    private boolean checkGenre()
    {
        // TODO: Basti
        //Temporäre Genre-Liste
        List<Genre> enumerationList = Collections.list(Genre);

//        for (Genre g: enumerationList)
//        {
//            // TODO: Enumerable Collection gebruacht
//        }

        // Prüfung, ob jedes Genre im Spielplan mindestens einmal vertreten ist.
        for( Vorstellung l: randomSpielplan)
        {
            if (randomSpielplan.contains(l.getKinofilm().getGenre()))
            {
                enumerationList.remove(l.getKinofilm().getGenre());
            }

            // Frühe Abbruchbedingung
            if (enumerationList.isEmpty()) { return true;}
        }
        return false;
    }

    public Spielplan Improve()
    {
        //Code
        return null;
    }

    // Getter
    public ArrayList<Vorstellung> getImprovedSpielplan() { return improvedSpielplan; }
}
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
    public Spielplan CreateRandomSpielplan()
    {
        Kinofilm kinofilm;
        Werbefilm werbefilm;
        Saal saal;
        int eintritt;

        int randomIndexKinofilm = ThreadLocalRandom.current().nextInt(0, FilmVerwaltung.filme.length())
        kinofilm =
    }


    private void fillPlan(){
        for (int i = 0; i < 21; i++) {
            Vorstellung newVorstellung = new Vorstellung(kinofilm, werbefilm, saal, eintritt);

            //if () //TODO: hier weiter
        }
    }

    private Vorstellung createVorstellung()
    {
        //Code
        return null;
    }

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

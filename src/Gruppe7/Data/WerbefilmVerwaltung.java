package Gruppe7.Data;

import java.util.ArrayList;

public class WerbefilmVerwaltung
{
    // Auf die Verwaltungsklassen muss aus dem gesamten Kode zugegriffen werden
    static private ArrayList<Werbefilm> werbefilme = new ArrayList<Werbefilm>();

    //Getter
    static ArrayList<Werbefilm> getWerbefilme() {
        return werbefilme;
    }
}
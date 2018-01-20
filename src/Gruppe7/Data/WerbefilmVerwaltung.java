package Gruppe7.Data;

import java.util.ArrayList;

// Auf die Verwaltungsklassen muss aus dem gesamten Kode zugegriffen werden
public class WerbefilmVerwaltung
{
    static private ArrayList<Werbefilm> werbefilme = new ArrayList<>();

    //Getter
    public static ArrayList<Werbefilm> getWerbefilme() { return werbefilme; }
    public static int getSize() { return werbefilme.size(); }
}
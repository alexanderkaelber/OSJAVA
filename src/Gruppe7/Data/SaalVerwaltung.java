package Gruppe7.Data;

import java.lang.reflect.Array;
import java.util.ArrayList;

// Auf die Verwaltungsklassen muss aus dem gesamten Kode zugegriffen werden
public class SaalVerwaltung
{

    static ArrayList<Saal> saele = new ArrayList<Saal>();

    public static ArrayList<Saal> getSaele() {
        return saele;
    }
}
package Gruppe7.Data;

import java.util.ArrayList;

// Auf die Verwaltungsklassen muss aus dem gesamten Kode zugegriffen werden
public class FilmVerwaltung
{
    static private ArrayList<Kinofilm> filme = new ArrayList<>();

    // Getter
    public static ArrayList<Kinofilm> getFilme() { return filme; }
    public static int getSize() { return filme.size(); }
}

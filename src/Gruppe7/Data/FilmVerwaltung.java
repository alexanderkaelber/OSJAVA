package Gruppe7.Data;

import java.util.ArrayList;

public class FilmVerwaltung
{
    static private ArrayList<Kinofilm> filme = new ArrayList<>();

    // Getter
    static  ArrayList<Kinofilm> getFilme() {
        return filme;
    }
    public static int getSize() { return filme.size(); }

    // Setter
    public static void setFilme(Kinofilm in_film) {filme.add(in_film)}
}

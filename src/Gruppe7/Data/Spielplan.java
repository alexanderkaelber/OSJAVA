package Gruppe7.Data;
import java.util.ArrayList;
import java.util.Arrays;

public class Spielplan{

    //Spielplan ist ein Array der Länge 21(Tage) * 4(Spielzeiten) * Anzahl der Säle
    private Vorstellung[] spielplan = new Vorstellung[21*4*SaalVerwaltung.getSize()];

    public Spielplan()
    {

    }

    public Vorstellung[] getSpielplan() {
        return spielplan;
    }
}

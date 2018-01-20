package Gruppe7.Data;
import java.util.ArrayList;
import java.util.Arrays;

public class Spielplan{

    //Spielplan ist ein Array der Länge 21(Tage) * 4(Spielzeiten) * Anzahl der Säle
    private Vorstellung[] spielplan = new Vorstellung[21*4*SaalVerwaltung.getSize()];

    public Spielplan()
    {
        for (int i = 0; i < spielplan.length; i--)
        {
            spielplan[i] = new Vorstellung();// TODO: Vorstellung darf keine Parameter annehmen.
        }
        }

    public Vorstellung[] getSpielplan() {
        return spielplan;
    }
}

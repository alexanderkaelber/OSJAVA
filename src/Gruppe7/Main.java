package Gruppe7;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import Gruppe7.Data.*;
import Gruppe7.Exporter.*;
import Gruppe7.Logic.*;
import Gruppe7.Importer.*;

public class Main {

    public static void main(String[] args) throws IOException {

        //Datenimport
        new SaalImporter("C:/import/saele.csv");
        new WerbefilmImporter("C:/import/werbespots.csv");
        new KinofilmImporter("C:/import/filme.csv", 100);

        Planer planer = new Planer();
        //planer.Improve();

        //System.out.println(Spielplan.toString(Spielplan.getSpielplan()));

        //Exporter planerExport;
        //planerExport = new Exporter(Spielplan.getSpielplan());

        Sortierer sortiererVorstellungen;
        sortiererVorstellungen = new Sortierer(Spielplan.getSpielplan());

    }
}

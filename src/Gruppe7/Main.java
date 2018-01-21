package Gruppe7;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import Gruppe7.Data.*;
import Gruppe7.Logic.*;
import Gruppe7.Importer.*;

public class Main {

    public static void main(String[] args) throws IOException {

        //Datenimport
        new SaalImporter("C:/import/saele.csv");
        new WerbefilmImporter("C:/import/werbespots.csv");
        new KinofilmImporter("C:/import/filme.csv");

        Planer planer = new Planer();
        //planer.Improve();

        System.out.println(Spielplan.toString(Spielplan.getSpielplan()));
    }
}

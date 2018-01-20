package Gruppe7;

import java.io.IOException;
import Gruppe7.Importer.*;
import Gruppe7.Logic.*;

public class Main {

    public static void main(String[] args) throws IOException {

    //Datenimport
//    new SaalImporter("C:/import/saele.csv");
//    new WerbefilmImporter("C:/import/werbespots.csv");
    new KinofilmImporter("C:/import/filme.csv");

//    Planer planer = new Planer();
//    //planer.Improve();
//
//        System.out.println(planer.getRandomSpielplan().toString());
    }
}

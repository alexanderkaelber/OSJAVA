package Gruppe7;
import java.util.Random;

import Gruppe7.Data.*;

public class Main {

    public static void main(String[] args) {
	// Main Method

        //Einstieg ins Programm
        System.out.println("Hier ist der Einstieg ins Programm");


        //Erzeugen einer Instanz vom Objekt Saal
        Saal testSaal;
        testSaal = new Saal(100, 150, false, 1);
        System.out.println("Plätze Loge: " + testSaal.getPlaetzeLoge());
        System.out.println("Plätze Parkett: " + testSaal.getPlaetzeParkett());
        System.out.println("3D Fähig: " + testSaal.getThreeD());
        System.out.println("Saal Nummer: " + testSaal.getSaalNummer());







    }

//    void startPlaner()
//    {
//        //Code
//    }
//
//    void startImporter()
//    {
//        //Code
//    }
//
//    void startExporter()
//    {
//        //Code
//    }




}

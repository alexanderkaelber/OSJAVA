package Gruppe7;
import java.io.IOException;
import java.util.Random;

import Gruppe7.Data.*;
import Gruppe7.Importer.Datei;
import Gruppe7.Importer.readCSV;

public class Main {

    public static void main(String[] args) throws IOException {
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


//Import Test
       Datei testImport;
       testImport = new Datei("C:/import/saele.csv");
       testImport.openInFile_FS();
       //testImport.readLine_FS();
       //testImport.readLine();




        private TestSchleife(Datei in_testImport);

        do {
            System.out.println(testImport.readLine());
        } while (System.out.println(testImport.readLine())==null);




        System.out.println(testImport.readLine());
        System.out.println(testImport.readLine());
        System.out.println(testImport.readLine());
        System.out.println(testImport.readLine());
        System.out.println(testImport.readLine());
        System.out.println(testImport.readLine());
        System.out.println(testImport.readLine());
        System.out.println(testImport.readLine());
        System.out.println(testImport.readLine());



      // System.out.println(testImport.);



            }
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






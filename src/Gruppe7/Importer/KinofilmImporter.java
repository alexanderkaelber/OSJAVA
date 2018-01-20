package Gruppe7.Importer;

import Gruppe7.Data.*;
import java.util.ArrayList;
import java.util.Collections;


public class KinofilmImporter extends Datei {

    private Datei importFileKinofilme;
    private String importString;
    private String importKinofilmTitel;
    private String importKinofilmRegisseur;

    private int importKinofilmFskInt;
    private Fsk importKinofilmFSK;


    private String importKinofilmGemresString;
    private ArrayList<Genre> importKinofilmGenres;

    private int importKinofilmMietpreis;
    private int importKinofilmBeliebtheit;
    private int importKinofilmLaufzeit;
    private String importKinofilmSprache;
    private String importKinofilmErscheinungsland;
    private int importKinofilmErscheinungsjahr;
    private boolean importThreeD;

    private int minBeliebtheit;


    /**
     * Konstruktor fuer Objekte der Klasse Datei
     * Legt einen String mit dem Namen der zu bearbeitenden Datei an.
     *
     * @param in_name (String): Dateiname der benutzt werden soll.
     */
    public KinofilmImporter(String in_name) {
        super(in_name);

        importFileKinofilme = new Datei(in_name);
        importFileKinofilme.openInFile_FS();
        System.out.println("Import String:"  +importString+ "\naus Importdatei " +in_name );

        //Schleife läuft bis zum Ende der Datei.
        while (importFileKinofilme.eof() == false) {

            //Jede Zeile wird in importString eingelesen, es sei denn, in der letzten Zeile steht nichts drin.
            importString = importFileKinofilme.readLine_FS();
            if (importString != null) {
                System.out.println("Import String: " + importString + "\naus Importdatei " + in_name);

                //Zerlegt den Import String (Zeile der Datei) und erstellt ein Array.
                String arrayKinofilm[] = importString.split(";");

                //Die einzelnen Array Positionen werden nachfolgend Variablen der Klasse zugewiesen.

                //Filmtitel
                importKinofilmTitel = String.valueOf(arrayKinofilm[0]);
                //Regieseuer
                importKinofilmRegisseur = String.valueOf(arrayKinofilm[1]);

                //FSK des aktuellen Films
                //Hier wird der int Wert der FSK ausgewertet und dafür eine Enumeration gesetzt.
                importKinofilmFskInt = Integer.valueOf(arrayKinofilm[2]);
                if (importKinofilmFskInt == 18) {
                    importKinofilmFSK = Fsk.FSK_18;
                }
                if (importKinofilmFskInt == 16) {
                    importKinofilmFSK = Fsk.FSK_16;
                }
                if (importKinofilmFskInt == 12) {
                    importKinofilmFSK = Fsk.FSK_12;
                }
                if (importKinofilmFskInt == 6) {
                    importKinofilmFSK = Fsk.FSK_6;
                }
                if (importKinofilmFskInt == 0) {
                    importKinofilmFSK = Fsk.FSK_0;
                }
                //Test ob FSK Zusweisung erfolgreich war.
                System.out.println("FSK Enum gesetzt: " + importKinofilmFSK);



                //Genres Auslesen und Zuweisen
                //Für jeden Durchgang muss eine neue Liste erstellt werden.
                //Es wird eine ArrayList benötigt, da ein Film mehrere Genres haben kann.
                importKinofilmGenres = new ArrayList<Genre>();

                //Erstellung eines String mit allen Genres
                importKinofilmGemresString = String.valueOf(arrayKinofilm[3]);

                //Ausgabe des Strings
                System.out.println("String Genres:" + importKinofilmGemresString);

                //Der String wird aufgeteilt
                String arrayGenre[] = importKinofilmGemresString.split(",");
                for (int i = 0; i < arrayGenre.length; i++) {
                    //Leerzeichen entfernen
                    arrayGenre[i] = arrayGenre[i].trim();
                    //Ausgabe aller Genres
                    System.out.println(arrayGenre[i]);

                }

                //Die ausgelesenen Genres werden gepfrüft und eindeutigen Enums zugewiesen.
                for (int i = 0; i < arrayGenre.length; i++) {
                    if (arrayGenre[i].trim().equals("Action")) {
                        importKinofilmGenres.add(Genre.ACTION);
                    }
                    if (arrayGenre[i].trim().equals("Dokumentation")) {
                        importKinofilmGenres.add(Genre.DOKUMENTATION);
                    }
                    if (arrayGenre[i].trim().equals("Drama")) {
                        importKinofilmGenres.add(Genre.ACTION);
                    }
                    if (arrayGenre[i].trim().equals("Horror")) {
                        importKinofilmGenres.add(Genre.HORROR);
                    }
                    if (arrayGenre[i].trim().equals("Komödie")) {
                        importKinofilmGenres.add(Genre.KOMOEDIE);
                    }
                    if (arrayGenre[i].trim().equals("Krimi")) {
                        importKinofilmGenres.add(Genre.KRIMI);
                    }
                    if (arrayGenre[i].trim().equals("Science Fiction")) {
                        importKinofilmGenres.add(Genre.SCIENCE_FICTION);
                    }
                    if (arrayGenre[i].trim().equals("Zeichentrick")) {
                        importKinofilmGenres.add(Genre.ZEICHENTRICK);
                    }
                    if (arrayGenre[i].trim().equals("Thriller")) {
                        importKinofilmGenres.add(Genre.THRILLER);
                    }
                }
                //Ausgabe Genres pro Film
                System.out.println(importKinofilmGenres.size());
            }


        }



    }
}






                //ArrayList<Genre> TODO weiteres Array auslesen.
                // importKinofilmGemrsString

                //


                //importKinofilmLaufzeit = Integer.valueOf(arrayKinofilm[6]);


                // WerbefilmVerwaltung.setWerbefilme(new Werbefilm(importKinofilmTitel, importKinofilmLaufzeit, importKinofilmRegisseur));











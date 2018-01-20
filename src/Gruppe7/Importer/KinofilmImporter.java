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
        //System.out.println("Import String:"  +importString+ "\naus Importdatei " +in_name );


        while (importFileKinofilme.eof() == false) {
            importString = importFileKinofilme.readLine_FS();
            if (importString != null) {
                System.out.println("Import String: " + importString + "\naus Importdatei " + in_name);

                String arrayKinofilm[] = importString.split(";");

                importKinofilmTitel = String.valueOf(arrayKinofilm[0]);
                importKinofilmRegisseur = String.valueOf(arrayKinofilm[1]);

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
                System.out.println("FSK Enum gesetzt: " + importKinofilmFSK);

                //Genres Auslesen und Zuweisen
                //Für jeden Durchgang muss eine neue Liste erstellt werden.
                importKinofilmGenres = new ArrayList<Genre>();

                importKinofilmGemresString = String.valueOf(arrayKinofilm[3]);
                importKinofilmGemresString = importKinofilmGemresString;
                System.out.println("String Genres:" + importKinofilmGemresString);

                String arrayGenre[] = importKinofilmGemresString.split(",");
                for (int i = 0; i < arrayGenre.length; i++) {

                    arrayGenre[i] = arrayGenre[i].trim(); //Leerzeichen entfernen

                    //arrayGenre[i]=arrayGenre[i].replaceAll("\\s", "");
                    System.out.println(arrayGenre[i]);

                }


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











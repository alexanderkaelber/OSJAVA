package Gruppe7.Importer;

import Gruppe7.Data.*;
import java.util.ArrayList;

public class KinofilmImporter extends Datei {

    private Datei importFileKinofilme;
    private String importString;
    private String importKinofilmTitel;
    private String importKinofilmRegisseur;
    private Fsk importKinofilmFSK;
    private ArrayList<Genre> importKinofilmGenres = new ArrayList<Genre>(); // importKinofilmGenres.add()
    private int importKinofilmMietpreis;
    private int importKinofilmBeliebtheit;
    private int importKinofilmLaufzeit;
    private String importKinofilmSprache;
    private String importKinofilmErscheinungsland;
    private int importKinofilmErscheinungsjahr;
    private boolean importThreeD;


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
                System.out.println("Import String:" + importString + "\naus Importdatei " + in_name);

               /* String arrayWerbung[] = importString.split(";");

                importKinofilmTitel = String.valueOf(arrayWerbung[0]);
                importKinofilmRegisseur = Integer.valueOf(arrayWerbung[1]);
                importKinofilmLaufzeit = Integer.valueOf(arrayWerbung[2]);


                WerbefilmVerwaltung.setWerbefilme(new Werbefilm(importKinofilmTitel, importKinofilmLaufzeit, importKinofilmRegisseur));*/

            }

        }


    }
}


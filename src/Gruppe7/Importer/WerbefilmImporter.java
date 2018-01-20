package Gruppe7.Importer;

import Gruppe7.Importer.Datei;
import Gruppe7.Data.*;

public class WerbefilmImporter extends Datei {

    private Datei importFileWerbespots;
    private String importString;
    private String importWerbespotBezeichnung;
    private int importWerbespotEinnahmenen;
    private int importWerbespotLaufzeit;



    /**
     * Konstruktor fuer Objekte der Klasse Datei
     * Legt einen String mit dem Namen der zu bearbeitenden Datei an.
     *
     * @param in_name (String): Dateiname der benutzt werden soll.
     */
    public WerbefilmImporter(String in_name) {
        super(in_name);

        importFileWerbespots = new Datei(in_name);
        importFileWerbespots.openInFile_FS();

        while (importFileWerbespots.eof()==false){
            importString = importFileWerbespots.readLine_FS();
            if (importString != null){
                System.out.println("Import String:"  +importString+ "\naus Importdatei " +in_name );

                String arrayWerbung[] = importString.split(";");

                importWerbespotBezeichnung = String.valueOf(arrayWerbung[0]);
                importWerbespotEinnahmenen = Integer.valueOf(arrayWerbung[1]);
                importWerbespotLaufzeit = Integer.valueOf(arrayWerbung[2]);


                WerbefilmVerwaltung.setWerbefilme(new Werbefilm(importWerbespotBezeichnung, importWerbespotLaufzeit, importWerbespotEinnahmenen));

            }

        }





    }
}

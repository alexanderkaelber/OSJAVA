package Gruppe7.Exporter;

import Gruppe7.Data.Spielplan;
import sun.security.provider.ConfigFile;

import java.io.*;

public class Exporter {

    private Spielplan[] exportSpielplan;
    String[] spielplan = Spielplan.(",");



    public Exporter(){

        getExportSpielplan();
    }

    public Spielplan[] getExportSpielplan() {
        return exportSpielplan; }


}




    public void ExportKinoProgramm()
    {
        //Code
    }

    public void ExportFinanzplan()
    {
        //Code
    }

    public void ExportSaalplan()
    {
        //Code
    }

}

/*Spielplan = Array aus Vorstellungen
muss diesen wieder auseinandernehmen
alles erstmal über System.out.println() für drei Exporte
aus Spielplan die Vorstellung über das Array nehmen [0] etc., dann über die Objekte film, etc. die einzelnen
Attribute herausnehmen und dann in Tabellen einbauen
 */
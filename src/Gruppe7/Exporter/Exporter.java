package Gruppe7.Exporter;

import Gruppe7.Data.Spielplan;
import Gruppe7.Data.Vorstellung;

public class Exporter
{

    private Vorstellung[][][] exportSpielplan;

    public Exporter(Vorstellung[][][] in_exportSpielplan)
    {
        exportSpielplan=in_exportSpielplan;

        System.out.println(exportSpielplan[0][0][0]);

        //Constructor [TAG][SAAL][TIMESLOT]

        //Spielplan.getSpielplan()[0][0][0];
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

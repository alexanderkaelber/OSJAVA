package Gruppe7.Exporter;

import Gruppe7.Data.Spielplan;
import Gruppe7.Data.Vorstellung;

public class Exporter
{

    private Vorstellung[][][] exportSpielplan;
    private int vorstellungsTagNr;


    public Exporter(Vorstellung[][][] in_exportSpielplan)
    {
        exportSpielplan=in_exportSpielplan;
                                //[TAG][SAAL][TIMESLOT]
//        System.out.println(exportSpielplan[0][0][0]);

        // for (int i = 0; i < arrayGenre.length; i++) {
        System.out.println(exportSpielplan.length);
        for (int i=0; i<= 20; i++){

            System.out.println(i);

            System.out.println(exportSpielplan[i][0][0]);
        }

        //vorstellungsTagNr=exportSpielplan[][][];



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

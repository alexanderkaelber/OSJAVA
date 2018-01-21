/*
package Gruppe7.Exporter;

import Gruppe7.Data.*;

import java.util.Arrays;
import java.util.Collections;

import static java.lang.System.out;
import static java.util.Collections.*;

public class Exporter implements Comparable<Vorstellung[][][]>
{

    private Vorstellung[][][] exportSpielplan;
    private int vorstellungsTagNr;
    private int vorstellungsSaalNr;
    private int vorstellungsSpielzeitNr;



    public Exporter(Vorstellung[][][] in_exportSpielplan)
    {

        Saal[] arrayVorstellungsSaele;
        arrayVorstellungsSaele = new Saal[SaalVerwaltung.getSaele().size()];
        out.println(arrayVorstellungsSaele.length);

        int iArraySaele = 0;

        exportSpielplan=in_exportSpielplan;

        //Collections.sort(exportSpielplan);

        for (int iTag=0; iTag<= 0; iTag++){
            vorstellungsTagNr=iTag+1;

            for (int iSaal=0;iSaal<= SaalVerwaltung.getSaele().size()-1;iSaal++){
                vorstellungsSaalNr=iSaal+1;
                for (int iSpielzeit = 0; iSpielzeit<= 3; iSpielzeit++){
                    vorstellungsSpielzeitNr=iSpielzeit+1;






                        iArraySaele = exportSpielplan[iTag][iSaal][iSpielzeit].getSaal().getSaalNummer();

                        arrayVorstellungsSaele[iArraySaele]=exportSpielplan[iTag][iSaal][iSpielzeit].getSaal();
                        Arrays.sort(arrayVorstellungsSaele);
                        out.println(arrayVorstellungsSaele[iArraySaele].getSaalNummer());
                        out.println(arrayVorstellungsSaele.length);




                }
            }

        }

        out.println(Arrays.toString(arrayVorstellungsSaele));


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

    @Override
    public int compareTo(Vorstellung[][][]exportSpielplan) {
        return vorstellungsSaalNr;
    }
}
*/

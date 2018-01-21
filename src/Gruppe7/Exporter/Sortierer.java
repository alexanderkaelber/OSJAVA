package Gruppe7.Exporter;

import Gruppe7.Data.Vorstellung;
import java.util.Arrays;
import java.util.List;


public class Sortierer {

    Vorstellung[][][] vorstellungen;

    //Sortiert die Vorstellugen wie folgt:
    // Tag 1-21 => Saal 1-n => Spielzeit 1-4


    public Sortierer (Vorstellung[][][] in_Vorstellungen){

        vorstellungen=in_Vorstellungen;

        List<Vorstellung[][]> ListVorstellungen= Arrays.asList(vorstellungen);

        System.out.println(vorstellungen[0][0][0]);


    }

}

package Gruppe7.Logic;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

import Gruppe7.Data.*;

public class Planer
{
    public static void Improve()
    {

    }

    /**
     * Sucht den größten und den zweitgrößten Saal.
     * @return [PlätzeImGrößtenSaal,PlätzeImZweitgrößtenSaal]
     */
    private static int[] plaetzteInGroestemUndZweitgroeßtemSaal(){
        int plaetzeLoge = 0;
        int plaetzeParkett = 0;

        int plaetzeGroesterSaal = 0;
        int plaetzeZweitgroesterSaal = 0;

        for (int i = 0; i < 2; i++) {

            if(i ==0){
                for (Saal saal: SaalVerwaltung.getSaele())
                {
                    if((plaetzeLoge + plaetzeParkett) < saal.getPlaetzeLoge() + saal.getPlaetzeParkett()){
                        plaetzeLoge = saal.getPlaetzeLoge();
                        plaetzeParkett = saal.getPlaetzeParkett();
                    }
                }
                plaetzeGroesterSaal = plaetzeLoge + plaetzeParkett;
            }

            if(i == 1){
                plaetzeLoge = 0;
                plaetzeParkett = 0;

                for (Saal saal: SaalVerwaltung.getSaele())
                {
                    if(((plaetzeLoge + plaetzeParkett) < (saal.getPlaetzeLoge() + saal.getPlaetzeParkett())) &&
                            ((saal.getPlaetzeLoge() + saal.getPlaetzeParkett()) < plaetzeGroesterSaal)){
                        plaetzeLoge = saal.getPlaetzeLoge();
                        plaetzeParkett = saal.getPlaetzeParkett();
                    }
                    plaetzeZweitgroesterSaal = plaetzeLoge + plaetzeParkett;
                }
            }
        }
        int[] outputarray = {plaetzeGroesterSaal, plaetzeZweitgroesterSaal};
        return outputarray;
    }

    /**
     * Berechnet den Andrang für eine Vorstellung.
     * @param vorstellung Die Vorstellung, für die der Andrang berechnet werden soll.
     * @param tagIndex Der Index des Tages, an dem die Vorstellung stattfindet.
     * @param vorstellungIndex Der Index des Timeslots, zu dem die Vorstellung stattfindet.
     * @return Die Zahl der für die Vorstellung erwarteten Zuschauer.
     */
    public static int Andrang(Vorstellung vorstellung, int tagIndex, int vorstellungIndex){
        int basisandrang = (int)Math.round((plaetzteInGroestemUndZweitgroeßtemSaal()[0] +
                                            plaetzteInGroestemUndZweitgroeßtemSaal()[1]) *
                                            ((double)(vorstellung.getKinofilm().getBeliebtheit()) / 85));

        int vorstellungsabHaengigerAndrang;

        //15 Uhr Vorstellung 90%
        if (vorstellungIndex == 0){
            vorstellungsabHaengigerAndrang = (int)Math.round(basisandrang * .9);
        }
        //17:30 Uhr Vorstellung 95%
        else if (vorstellungIndex == 1){
            vorstellungsabHaengigerAndrang = (int)Math.round(basisandrang * .95);
        }
        //23 Uhr Vorstellung 85%
        else if (vorstellungIndex == 3){
            vorstellungsabHaengigerAndrang = (int)Math.round(basisandrang * .85);
        }

        //20 Uhr und Catch-All 100%
        else { return basisandrang; }


        //Montag 100%
        if (tagIndex == 0 || tagIndex == 7 || tagIndex == 14 || tagIndex == 21)
            return vorstellungsabHaengigerAndrang;

        //Dienstag, Mittwoch, Donnerstag 60%
        else if ((tagIndex > 0 && tagIndex < 4) || (tagIndex > 7 && tagIndex < 11) || (tagIndex > 14 && tagIndex < 18)){
            return (int)Math.round(vorstellungsabHaengigerAndrang * .6);
        }

        //Freitag, Samstag, Sonntag 80%
        else if ((tagIndex > 3 && tagIndex < 7) || (tagIndex > 10 && tagIndex < 14) || (tagIndex > 17 && tagIndex < 21)) {
            return (int) Math.round(vorstellungsabHaengigerAndrang * .8);
        }

        //Montag und Catch-All 100%
        else {return basisandrang;}

        //TODO: Wird in Woche 2 (bzw. 3) ein Film gezeigt, der bereits in der ersten (bzw. ersten oder zweiten) Woche gezeigt wurde, werden nur 80% des Werts erreicht; wird in Woche 3 ein Film gezeigt der bereits in der ersten UND zweiten Woche gezeigt wurde, nur 50%.
        //TODO: Der Normalpreis (Parkett) beträgt 7 Euro. Für jeden Euro, den der Preis erhöht wird, sinkt der Zuschauerandrang um 5%. Für jeden Euro, den der Preis gesenkt wird, steigt der Besucherandrang um 2%.
    }
}
package Gruppe7.Logic;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import Gruppe7.Data.*;

public class Planer
{
    public static void Improve()
    {

    }

    private static int plaetzeLogeInGroeßtemSaal(){
        int plaetzeLoge = 0;
        int plaetzeParkett = 0;

        for (Saal saal: SaalVerwaltung.getSaele())
        {
            if((plaetzeLoge + plaetzeParkett) < saal.getPlaetzeLoge() + saal.getPlaetzeParkett()){
                plaetzeLoge = saal.getPlaetzeLoge();
                plaetzeParkett = saal.getPlaetzeParkett();
            }
        }
        return plaetze;
    }

    // TODO: Die Plätze des zweitgrößten Saals finden.
    private static int plaetzeInZweitgrößtemSaal(){

        for (Saal saal: SaalVerwaltung.getSaele())
        {
            if(saalMinPlaetze > saal.getPlaetzeLoge()+saal.getPlaetzeParkett()){
                saalMinPlaetze = saal.getPlaetzeLoge()+saal.getPlaetzeParkett();
            }
        }
        return saalMinPlaetze;
    }

    public static double Andrang(Vorstellung vorstellung, int tagIndex, int vorstellungIndex){
        int basisandrang = (plaetzeInZweitgrößtemSaal() + plaetzeInGroeßtemSaal()) * ((vorstellung.getKinofilm().getBeliebtheit()));

        System.out.println(basisandrang);

        int vorstellungsabHaengigerAndrang;

        //15 Uhr Vorstellung 90%
        if (vorstellungIndex == 0){
            vorstellungsabHaengigerAndrang = (int)Math.round(basisandrang * .9);
        }

        //17:30 Uhr Vorstellung 95%
        if (vorstellungIndex == 1){
            vorstellungsabHaengigerAndrang = (int)Math.round(basisandrang * .95);
        }

        //23 Uhr Vorstellung 85%
        if (vorstellungIndex == 3){
            vorstellungsabHaengigerAndrang = (int)Math.round(basisandrang * .85);
        }

        //20 Uhr und Catch-All 100%
        else { return basisandrang; }


        //Montag 100%
        if (tagIndex == 0 || tagIndex == 7 || tagIndex == 14 || tagIndex == 21)
            return vorstellungsabHaengigerAndrang;

        //Dienstag, Mittwoch, Donnerstag 60%
        if ((tagIndex > 0 && tagIndex < 4) || (tagIndex > 7 && tagIndex < 11) || (tagIndex > 14 && tagIndex < 18)){
            return (int)Math.round(vorstellungsabHaengigerAndrang * .6);
        }

        //Freitag, Samstag, Sonntag 80%
        if ((tagIndex > 3 && tagIndex < 7) || (tagIndex > 10 && tagIndex < 14) || (tagIndex > 17 && tagIndex < 21)) {
            return (int) Math.round(vorstellungsabHaengigerAndrang * .8);
        }

        //Montag und Catch-All 100%
        else {return basisandrang;}

        //TODO: Wird in Woche 2 (bzw. 3) ein Film gezeigt, der bereits in der ersten (bzw. ersten oder zweiten) Woche gezeigt wurde, werden nur 80% des Werts erreicht; wird in Woche 3 ein Film gezeigt der bereits in der ersten UND zweiten Woche gezeigt wurde, nur 50%.
        //TODO: Der Normalpreis (Parkett) beträgt 7 Euro. Für jeden Euro, den der Preis erhöht wird, sinkt der Zuschauerandrang um 5%. Für jeden Euro, den der Preis gesenkt wird, steigt der Besucherandrang um 2%.
    }




}
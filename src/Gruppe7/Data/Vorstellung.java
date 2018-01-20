package Gruppe7.Data;
import Gruppe7.Data.*;

public class Vorstellung
{   //Attribute
    private Kinofilm vorstellungsFilm;
    private Werbefilm[] werbungen;
    private Saal vorstellungsSaal;
    private Spielzeiten timeslot;
    private int einnahmenAusWerbung;
    private int einnahmenAusKartenverkaeufen;
    private int eintrittspreis = 7;

    //Constructor
    /*public Vorstellung() {
        this(Kinofilm, , , , );
    }*/

    public Vorstellung(Kinofilm in_kinofilm,
                       Werbefilm[] in_werbefilm,
                       Saal in_saal,
                       Spielzeiten in_timeslot) {
        /* Wie fange ich hier an? Muss ich erst noch die notwendigen Daten aus den anderen Klassen über get-Methoden
        herholen oder läuft das durch die Komposition automatisch?
        Muss ich den Eintrittspreis hier mit in den Konstruktor tun oder kann ich ihn mit einem Konstruktor
        ohne Parameter reinschreiben?
        Default parameter googlen*/

        vorstellungsFilm = in_kinofilm;
        werbungen = in_werbefilm;
        vorstellungsSaal = in_saal;
        timeslot = in_timeslot;


        check3D();

    }




    //Check Methoden hier

    //Check 3D
    private boolean check3D(Kinofilm vorstellungsFilm, Saal vorstellungsSaal) {

        if ((vorstellungsFilm.get3D() == true && vorstellungsSaal.getThreeD() == false) != true) {


            //Check Fsk
                    checkFSK();

            //Check Spielzeiten


            return true;
        } else {
            return false;
        }
    }



    private boolean checkFSK(Spielzeiten timeslot, Kinofilm vorstellungsFilm) {

        if(timeslot == Spielzeiten.SLOT_1500 && vorstellungsFilm.getFsk() == Fsk.FSK_16) {
            return false;
        }else if (timeslot == Spielzeiten.SLOT_1500 && vorstellungsFilm.getFsk() == Fsk.FSK_18){
            return false;
        }else if (timeslot == Spielzeiten.SLOT_1730 && vorstellungsFilm.getFsk() == Fsk.FSK_16) {
            return false;
        }else if (timeslot == Spielzeiten.SLOT_1730 && vorstellungsFilm.getFsk() == Fsk.FSK_18) {
            return false;
        }else if (timeslot == Spielzeiten.SLOT_2000 && vorstellungsFilm.getFsk() == Fsk.FSK_18) {
            return false;
        }else {
            return true;
        }

        //(vorstellungsFilm.3D = true + vorstellungsSaal.3D = false) = false




        //Ende Check Methoden





    }




    //get-Methoden
    public Kinofilm getKinofilm(){
        return vorstellungsFilm;
    }
    public int getSaal(){
        return vorstellungsSaal;
    }
    public Spielzeiten getSpielzeiten(){
        return timeslot;
    }
    public Werbefilm[] getWerbefilme(){
        return werbungen;
        //eventuell Liste/Collection, weil wir nicht wissen, wie viele Werbefilme
    }

    //check-Methoden for Constructor


        /* () Film- und ein Saalobjekt
         * film.3D = 3D-Eigenschaft des Films, film.3D==saal.3D mit if-Funktion */
    /*Code
        IF Spalte 3D aus saele.csv = false, dann dürfen in den jeweiligen Sälen nur Kinofilme aus filme.csv mit
        Spalte 3D = false gezeigt werden, sonst ist es egal
         */
    }

        /*Code
        FSK 0,6,12,16,18
        FSK 16 nur um 20 oder 23 Uhr
        FSK 18 nur um 23 Uhr
        siehe check3D, FSK vergleichen über Enumeration Spielzeiten
         */
        return false;
    }

    private boolean checkLaufzeiten()
    {

        /*Code
        Timeslot - Kinofilm = x
        Timeslot>=Kinofilm
        IF x <= 20 min, dann x, sonst <= 20 min --> das muss in den Konstruktor
        IF 120 <= Kinofilm <= 160, dann muss er um 20 Uhr laufen --> das muss in den Konstruktor

        IF Kinofilm < 160, dann fällt er komplett raus
        über die Grenzen müssen wir noch sprechen, worauf legen wir uns fest?
         */
        return false;
    }


}

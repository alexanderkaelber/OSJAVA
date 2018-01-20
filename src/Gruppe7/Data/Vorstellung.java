package Gruppe7.Data;
import Gruppe7.Data.*;
import java.util.*;


public class Vorstellung {

    //Attribute
    private Kinofilm vorstellungsFilm;
    private Werbefilm[] werbungen;
    private Saal vorstellungsSaal;
    private Spielzeiten timeslot;
    private int einnahmenAusWerbung;
    private int einnahmenAusKartenverkaeufen;
    private int eintrittspreis = 7;
    private int werbezeitMax = 20;


    //Constructor

    public Vorstellung(Kinofilm in_kinofilm,
                       Werbefilm[] in_werbefilm,
                       Saal in_saal,
                       Spielzeiten in_timeslot,
                       int eintrittspreis,
                       int werbezeitMax) {

        // --> Default parameter googlen

        vorstellungsFilm = in_kinofilm;
        werbungen = in_werbefilm;
        vorstellungsSaal = in_saal;
        timeslot = in_timeslot;
        this.eintrittspreis = eintrittspreis;         // ????
        this.werbezeitMax = werbezeitMax;             // ????


        //Check 3D
        check3D(Kinofilm vorstellungsFilm, Saal vorstellungsSaal);

        //Check Fsk
        checkFSK(Spielzeiten timeslot, Kinofilm vorstellungsFilm);

        //Check Laufzeiten
        checkLaufzeiten(Spielzeiten timeslot, Kinofilm vorstellungsFilm);

        //Check Werbefilme
        checkWerbefilme(Spielzeiten timeslot, Kinofilm vorstellungsFilm, Werbefilm werbungen, werbezeitMax);

        //ArrayList<Integer> werbungen = new ArrayList();

    }

    //Default parameter eintrittspreis = 7;

    public Vorstellung(){
        this.eintrittspreis = 7;
        this.werbezeitMax = 20;

    }

    //Check Methoden

    //Check 3D
    private boolean check3D(Kinofilm vorstellungsFilm, Saal vorstellungsSaal) {

        if ((vorstellungsFilm.get3D() == true && vorstellungsSaal.getThreeD() == false) != true) {
            return true;
        } else {
            return false;
        }
    }

    //Check FSK
    private boolean checkFSK(Spielzeiten timeslot, Kinofilm vorstellungsFilm) {

        if (timeslot == Spielzeiten.SLOT_1500 && vorstellungsFilm.getFsk() == Fsk.FSK_16) {
            return false;
        } else if (timeslot == Spielzeiten.SLOT_1500 && vorstellungsFilm.getFsk() == Fsk.FSK_18) {
            return false;
        } else if (timeslot == Spielzeiten.SLOT_1730 && vorstellungsFilm.getFsk() == Fsk.FSK_16) {
            return false;
        } else if (timeslot == Spielzeiten.SLOT_1730 && vorstellungsFilm.getFsk() == Fsk.FSK_18) {
            return false;
        } else if (timeslot == Spielzeiten.SLOT_2000 && vorstellungsFilm.getFsk() == Fsk.FSK_18) {
            return false;
        } else {
            return true;
        }
    }
    //Check Laufzeiten
    private boolean checkLaufzeiten(Spielzeiten timeslot, Kinofilm vorstellungsFilm) {
        if ((timeslot == Spielzeiten.SLOT_1500) && (vorstellungsFilm.getLaufzeit() <
                Spielzeiten.SLOT_1500.getSlotDuration())){
            return false;
            }else if ((timeslot == Spielzeiten.SLOT_1730) && (vorstellungsFilm.getLaufzeit() <
                Spielzeiten.SLOT_1730.getSlotDuration())){
                return false;
            }else if ((timeslot == Spielzeiten.SLOT_2000) && (vorstellungsFilm.getLaufzeit() <
                Spielzeiten.SLOT_2000.getSlotDuration())){
                return false;
            }else if ((timeslot == Spielzeiten.SLOT_2300) && (vorstellungsFilm.getLaufzeit() <
                Spielzeiten.SLOT_2300.getSlotDuration())){
                return false;
        }else {
            return true;
        }

    }

    //Check Werbefilme
    private boolean checkWerbefilme(Spielzeiten timeslot, Kinofilm vorstellungsFilm, Werbefilm werbungen,
                                    int werbezeitMax){
        if((Spielzeiten.SLOT_1500.getSlotDuration() - vorstellungsFilm.getLaufzeit()) > werbezeitMax) {
            return false;

        }else if((Spielzeiten.SLOT_1730.getSlotDuration() - vorstellungsFilm.getLaufzeit()) > werbezeitMax){
            return false;
        }else if((Spielzeiten.SLOT_2000.getSlotDuration() - vorstellungsFilm.getLaufzeit()) > werbezeitMax){
            return false;
        }else if((Spielzeiten.SLOT_2300.getSlotDuration() - vorstellungsFilm.getLaufzeit()) > werbezeitMax){
            return false;
        }else {
            return true; //(int (Spielzeiten.SLOT_1500.getSlotDuration() - vorstellungsFilm.getLaufzeit()));

        }
    }


    //Ende Check Methoden


    //get-Methoden
    public Kinofilm getKinofilm(){
        return vorstellungsFilm;
    }
    public Saal getSaal(){
        return vorstellungsSaal;
    }
    public Spielzeiten getSpielzeiten(){
        return timeslot;
    }
    public Werbefilm[] getWerbefilme(){
        return werbungen;
        //eventuell Liste/Collection, weil wir nicht wissen, wie viele Werbefilme

    }


        /*Code

        IF x <= 20 min, dann x, sonst <= 20 min --> das muss in den Konstruktor
        IF 120 <= Kinofilm, dann muss er um 20 Uhr laufen --> das muss in den Konstruktor
        Arraylist, im Konstruktor muss ich Arraylist mit einzelnen Werbefilmen befüllen

         */

}

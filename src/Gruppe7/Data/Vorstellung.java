package Gruppe7.Data;

public class Vorstellung {

    //Attribute
    private Kinofilm vorstellungsFilm;
    private Werbefilm[] werbungen; // TODO: Anzhal der Werbefilme über ihre Länge geregelt
    private Saal vorstellungsSaal;
    private Spielzeiten vorstellungsTimeslot;
    private int eintrittspreis = 7; // TODO: Hardcoded
    private int werbezeitMax = 20;

    //Constructor
    public Vorstellung()
    {
        vorstellungsFilm = FilmVerwaltung.getFilme().get(0);
        werbungen[0] = WerbefilmVerwaltung.getWerbefilme().get(0);
        werbungen[1] =  WerbefilmVerwaltung.getWerbefilme().get(1); // TODO: Anzhal der Werbefilme über ihre Länge geregelt
        vorstellungsSaal = SaalVerwaltung.getSaele().get(0);
        vorstellungsTimeslot = Spielzeiten.SLOT_1500;

        // TODO: In loop einbauen.
        check3D(vorstellungsFilm, vorstellungsSaal);
        checkFSK(vorstellungsTimeslot, vorstellungsFilm);
        checkLaufzeiten(vorstellungsFilm, vorstellungsTimeslot);
        checkWerbefilmeLaufzeit(vorstellungsTimeslot, vorstellungsFilm, werbungen, werbezeitMax);
    }

    //Check Methoden
    private boolean check3D(Kinofilm vorstellungsFilm, Saal vorstellungsSaal) {

        //Wenn der Saal 3D-Fähig ist, immer True
        if (vorstellungsSaal.getThreeD())
            return true;

        //Wenn Saal 2D und der Film auch
        if (!vorstellungsFilm.getThreeD() && !vorstellungsSaal.getThreeD())
            return true;

        else { return false; }
    }

    //Check FSK
    private boolean checkFSK(Spielzeiten vorstellungsTimeslot, Kinofilm vorstellungsFilm) {

        // Um 15 Uhr und um 17:30 dürfen keine FSK16 und FSK18 Filme gezeigt werden
        if ((vorstellungsTimeslot == Spielzeiten.SLOT_1500 || vorstellungsTimeslot == Spielzeiten.SLOT_1730) &&
                (vorstellungsFilm.getFsk() == Fsk.FSK_16 || vorstellungsFilm.getFsk() == Fsk.FSK_18)){
            return false;}

        // Um 20:00 dürfen keine FSK18 Filme gezeigt werden
        else if (vorstellungsTimeslot == Spielzeiten.SLOT_2000 && vorstellungsFilm.getFsk() == Fsk.FSK_18){
            return false;}

        // Alle anderen Kombinationen sind gültig
        else { return true; }
    }

    //Check Laufzeiten
    private boolean checkLaufzeiten(Kinofilm vorstellungsFilm, Spielzeiten vorstellungsTimeslot) {
        if (vorstellungsTimeslot.getSlotDuration() < vorstellungsFilm.getLaufzeit()) {return false;}
        else {return true;}
    }

    //Check Werbefilme
    private boolean checkWerbefilmeLaufzeit(Spielzeiten vorstellungsTimeslot,
                                            Kinofilm vorstellungsFilm,
                                            Werbefilm[] werbungen,
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

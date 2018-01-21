package Gruppe7.Data;

import java.util.stream.IntStream;
import java.util.concurrent.ThreadLocalRandom;

public class Vorstellung {

    //Attribute
    private Kinofilm vorstellungsFilm;
    private Werbefilm[] werbungen = new Werbefilm[1]; // TODO: Anzhal der Werbefilme über ihre Länge geregelt
    private Saal vorstellungsSaal;
    private Spielzeiten vorstellungsTimeslot;
    private int eintrittspreis = 7; // TODO: Hardcoded

    // Constant
    public static final int werbezeitMax = 20;

    //Constructor
    public Vorstellung()
    {
        //Boolean Check Variablen
        boolean threeD = false;
        boolean FSK = false;
        boolean laufzeiten = false;
        boolean werbefilme = false;

        // Solange Vorstellungen erstellen, bis gültig
        while (!threeD || !FSK || !laufzeiten || !werbefilme) {

            //Random Index für Vorstellungserstellung
            int kinofilmIndex = ThreadLocalRandom.current().nextInt(0, FilmVerwaltung.getSize());
            int werbefilmIndex = ThreadLocalRandom.current().nextInt(0, WerbefilmVerwaltung.getSize());
            int saalIndex = ThreadLocalRandom.current().nextInt(0, SaalVerwaltung.getSize());
            int vorstellungsTimeslotIndex = ThreadLocalRandom.current().nextInt(0, 3);

            vorstellungsFilm = FilmVerwaltung.getFilme().get(kinofilmIndex);
            werbungen[0]= WerbefilmVerwaltung.getWerbefilme().get(werbefilmIndex);
            vorstellungsSaal = SaalVerwaltung.getSaele().get(saalIndex);
            vorstellungsTimeslot = Spielzeiten.values()[vorstellungsTimeslotIndex];

            threeD = check3D(vorstellungsFilm, vorstellungsSaal);
            FSK = checkFSK(vorstellungsTimeslot, vorstellungsFilm);
            laufzeiten = checkLaufzeiten(vorstellungsFilm, vorstellungsTimeslot);
            werbefilme = checkWerbefilmeLaufzeit(vorstellungsTimeslot, vorstellungsFilm, werbungen, werbezeitMax);
        }
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

    //Check Werbefilme // TODO: Werbefilme so sortieren, dass zuerst die Kombinationen mit dem Höchstern Betrag / Zuschauer gewählt werden.
    private boolean checkWerbefilmeLaufzeit(Spielzeiten vorstellungsTimeslot,
                                            Kinofilm vorstellungsFilm,
                                            Werbefilm[] werbungen,
                                            int werbezeitMax){

        int sumWerbungDuration = 0;
        for (Werbefilm w: werbungen) { // TODO: Über Intstream?
            sumWerbungDuration += w.getLaufzeit();
        }

        /* Wenn die Summe der Werbezeiten größer ist, als die verbleibende Zeit im Timeslot abzüglich des Hauptfilms
            oder der Werbeblock länger als 20min ist return: false*/
        if ((sumWerbungDuration > (vorstellungsTimeslot.getSlotDuration()- vorstellungsFilm.getLaufzeit())) ||
                (sumWerbungDuration > werbezeitMax)) {return false;}
        else {return true;}
    }

    //Getter
    public Kinofilm getKinofilm(){
        return vorstellungsFilm;
    }
    public Saal getSaal(){
        return vorstellungsSaal;
    }
    public Spielzeiten getSpielzeiten(){
        return vorstellungsTimeslot;
    }
    public Werbefilm[] getWerbefilme(){
        return werbungen;
    } // TODO: Festlegung der Anzahl der Webefilmelemente wo?

    @Override
    public String toString() {
        return null;
    }
}

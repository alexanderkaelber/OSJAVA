/*
package Gruppe7.Data;

public class Vorstellung
{
    private Kinofilm film;
    private Werbefilm[] werbungen;
    private int einnahmenAusWerbung;
    private int einnahmenAusKartenverkaeufen;
    private int saal;
    private Spielzeiten timeslot;
    int eintrittspreis = 7;

    /*public Vorstellung() {
        this(Kinofilm, , , , );
    }*/

    public Vorstellung(Kinofilm in_kinofilm,
                       Werbefilm[] in_werbefilm,
                       Saal in_saal,
                       Spielzeiten in_timeslot,
                       int eintrittspreis)
    {
        /*Constructor
        Wie fange ich hier an? Muss ich erst noch die notwendigen Daten aus den anderen Klassen über get-Methoden
        herholen oder läuft das durch die Komposition automatisch?
        Muss ich den Eintrittspreis hier mit in den Konstruktor tun oder kann ich ihn mit einem Konstruktor
        ohne Parameter reinschreiben?
        Default parameter googlen*/

        film=in_kinofilm;
        werbungen=in_werbefilm;
        //saal=in_saal;
        timeslot=in_timeslot;

    }
    public Kinofilm getKinofilm(){
        return film;
    }
    public int getSaal(){
        return saal;
    }
    public Spielzeiten getSpielzeiten(){
        return timeslot;
    }
    public Werbefilm[] getWerbefilme(){
        return werbungen;
        //eventuell Liste/Collection, weil wir nicht wissen, wie viele Werbefilme
    }

//    private boolean check3D() {
//        if (film.3D==saal.3D){
//            return false;
//        }else {
//
//        }

        /* () Film- und ein Saalobjekt
         * film.3D = 3D-Eigenschaft des Films, film.3D==saal.3D mit if-Funktion */
    /*Code
        IF Spalte 3D aus saele.csv = false, dann dürfen in den jeweiligen Sälen nur Kinofilme aus filme.csv mit
        Spalte 3D = false gezeigt werden, sonst ist es egal
         */
    }
    private boolean checkFSK()
    {
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
*/

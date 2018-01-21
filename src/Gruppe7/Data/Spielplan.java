package Gruppe7.Data;
import java.util.Arrays;
import java.util.List;
import Gruppe7.Logic.*;

public class Spielplan{
    //Constant
    static final int gesamtZahlVorstellungen = 21 * SaalVerwaltung.getSize() * 4;

    /**
     * Konstruktor erstellt einen zufälligen Spielplan
     */
    public Spielplan(){
        spielplan = CreateRandomSpielplan();
    }

    //Spielplan ist ein Array der Länge 21(Tage) * Anzahl der Säle *  4(Spielzeiten)
    private Vorstellung[][][] spielplan = new Vorstellung[21][SaalVerwaltung.getSize()][4];
    private int spielplaneinnahmen = 0;
    private int spielplanAusgaben = 0;
    private int einnahmen = 0;

    /**
     * Erstellung eines zufälligen Spielplans durch Iteration durch das leere Vorstellungs-Array
     * @return Ein dreidimensionales Vorstellungsarray [tag][saal][timeslot]
     */
    public Vorstellung[][][] CreateRandomSpielplan()
    {
        // Für 21 Tage
        for (int tagIndex = 0; tagIndex <= 20; tagIndex++)
        {
            // Für jeden Saal
            for (int saalIndex = 0; saalIndex <= SaalVerwaltung.getSize()-1; saalIndex++)
            {
                // Für jeden Timeslot
                for (int vorstellungIndex = 0; vorstellungIndex < 4; vorstellungIndex++)
                {
                    spielplan[tagIndex][saalIndex][vorstellungIndex] = new Vorstellung(); //TODO: Bei constructor call vorstelung und Spielzeit übergeben
                }
            }
        }
        return spielplan;
    }

    private int spielplanEinnahmen(){
        spielplaneinnahmen += spielplan[tagIndex][saalIndex][vorstellungIndex].getEintrittspreis() *
                Planer.Andrang(spielplan[tagIndex][saalIndex][vorstellungIndex], tagIndex, vorstellungIndex);
        return 0;
    }

    private int spielplanAusgaben(){
        return 0;
    }

    //??
    public int SpielplanGewinn(){
        return 0;
    }






//    private int einnahmenberechnung(Vorstellung vorstellung)
//    {
//
//        vorstellung.getSaal();
//
//
//        vorstellung.getKinofilm().
//    }

    //Check Methode
    // TODO: Genrecheck in die Spielplanerstellung einbinden.
    private static boolean checkGenre()
    {
        //Temporäre Genre-Liste
        List<Genre> enumerationList = Arrays.asList(Genre.values());

        // Prüfung, ob jedes Genre im Spielplan mindestens einmal vertreten ist.
        for (int tag = 0; tag <= 20; tag++){
            for (int saal = 0; saal < SaalVerwaltung.getSize()-1; saal++) {
                for (int vorstellung = 0; vorstellung < 4; vorstellung++) {
                    if (enumerationList.contains(spielplan[tag][saal][vorstellung].getKinofilm().getGenre())) {
                        enumerationList.remove(spielplan[tag][saal][vorstellung].getKinofilm().getGenre());
                    }

                    // Abbruchbedingung
                    if (enumerationList.isEmpty()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    //Getter
    public Vorstellung[][][] getSpielplan() {return spielplan;}
    public void setSpielplan(Vorstellung[][][] spielplan) {
        Spielplan.spielplan = spielplan;
    }

    public String toString(Vorstellung[][][] spielplan) {
        return Arrays.deepToString(spielplan);
    }
}
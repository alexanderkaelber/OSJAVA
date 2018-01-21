package Gruppe7.Data;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Spielplan{
    //Constant
    static final int gesamtZahlVorstellungen = 21 * 4 * SaalVerwaltung.getSize();

    //Spielplan ist ein Array der Länge 21(Tage) * 4(Spielzeiten) * Anzahl der Säle
    private static Vorstellung[][][] spielplan = new Vorstellung[21][SaalVerwaltung.getSize()][4];

    public static Vorstellung[][][] CreateRandomSpielplan() //TODO: hashcode speicher, um sicherzustellen, dass selber spielplan nicht zweimal auftaucht?
    {
        // Für 21 Tage
        for (int tag = 0; tag <= 20; tag++)
        {
            // Für jeden Saal
            for (int saal = 0; saal < SaalVerwaltung.getSize()-1; saal++)
            {
                // Für jeden Timeslot
                for (int vorstellung = 0; vorstellung < 4; vorstellung++)
                {
                    spielplan[tag][saal][vorstellung] = new Vorstellung(); //TODO: Bei constructor call vorstelung und Spielzeit übergeben
                }
            }
        }
        return spielplan;
    }

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
    public static Vorstellung[][][] getSpielplan() {return spielplan;}
    public static void setSpielplan(Vorstellung[][][] spielplan) {
        Spielplan.spielplan = spielplan;
    }

    public static String toString(Vorstellung[][][] spielplan) {
        return Arrays.deepToString(spielplan);
    }
}
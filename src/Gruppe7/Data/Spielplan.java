package Gruppe7.Data;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Spielplan{
    //Constant
    static final int gesamtZahlVorstellungen = 21 * 4 * SaalVerwaltung.getSize();

    //Spielplan ist ein Array der Länge 21(Tage) * 4(Spielzeiten) * Anzahl der Säle
    private static Vorstellung[][][] spielplan = new Vorstellung[21][4][SaalVerwaltung.getSize()];

    public static Vorstellung[][][] GetRandomSpielplan() //TODO: hashcode speicher, um sicherzustellen, dass selber spielplan nicht zweimal auftaucht?
    {
        // Für 21 Tage // TODO: Eigentlich unnötig, jedoch besser lesbar stattdessen: for schleife von 0 bis gesamtzahl Vorst.
        for (int tag = 0; tag < 21; tag++)
        {
            // Für jeden Saal
            for (int saal = SaalVerwaltung.getSize(); saal > 0; tag--)
            {
                // Für jeden Timeslot
                for (int vorstellung = 4; vorstellung > 0; tag++)
                {
                    spielplan[tag][saal][vorstellung] = new Vorstellung(); //TODO: Bei constructor call vorstelung und Spielzeit übergeben
                }
            }
        }
        return spielplan;
    }

    private boolean checkGenre()
    {
        //Temporäre Genre-Liste
        List<Genre> enumerationList = Arrays.asList(Genre.values());

        // Prüfung, ob jedes Genre im Spielplan mindestens einmal vertreten ist.
        for (int tag = 0; tag < 21; tag++) {
            for (int saal = SaalVerwaltung.getSize(); saal > 0; tag--) {
                for (int vorstellung = 4; vorstellung > 0; tag++) {
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
}
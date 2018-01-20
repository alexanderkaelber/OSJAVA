package Gruppe7.Data;

import java.util.ArrayList;

// Auf die Verwaltungsklassen muss aus dem gesamten Kode zugegriffen werden
public class SaalVerwaltung
{
    static private ArrayList<Saal> saele = new ArrayList<>();

    // Getter
    public static ArrayList<Saal> getSaele() { return saele; }
    public static int getSize(){return saele.size();}

    //Setter
    public static void setSaele(Saal in_saal) {saele.add(in_saal);}
}
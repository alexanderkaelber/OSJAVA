package Gruppe7.Data;

public class Vorstellung
{
    private Kinofilm film;
    private Werbefilm[] werbungen;
    private int einnahmenAusWerbung;
    private int einnahmenAusKArtenverkaeufen;
    private int saal;
    private Spielzeiten timeslot;
    int eintrittspreis = 7;

    public Vorstellung(Kinofilm in_kinofilm,
                       Werbefilm[] in_werbefilm,
                       Saal in_saal,
                       Spielzeiten in_timeslot,
                       int eintrittspreis)
    {
        //Constructor
    }

    private boolean check3D()
    {
        //Code
    }
    private boolean checkFSK()
    {
        //Code
    }

    private boolean checkLaufzeiten()
    {
        //Code
    }
}

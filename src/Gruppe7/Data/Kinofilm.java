package Gruppe7.Data;

public class Kinofilm extends Film
{
    private  boolean threeD;
    private String sprache;
    private String regisseur;
    private int erscheinungsjahr;
    private int beliebtheit;
    private int verleihpreisProWoche;
    private Fsk fsk;
    private Genre genre;

    public Kinofilm(
            String in_Titel,
            int in_Laufzeit,
            boolean in_3d,
            String in_Sprache,
            String in_Regisseur,
            int in_Erscheinungsjahr,
            int in_Beliebtheit,
            int in_Verleipreis,
            Genre.genre in_Genre,
            Fsk.FSK in_Fsk)
    {
        //Constructor
    }

    public boolean get3D()
    {
        //Code
        return false;
    }

    public String getSprache()
    {
        //Code
        return null;
    }

    public String getRegisseur()
    {
        //Code
        return null;
    }

    public int getErscheinungsjahr()
    {
        //Code
        return 0;
    }

    public int getBeliebtheit()
    {
        //Code
        return 0;
    }

    public int getVerleihpreisProWoche()
    {
        //Code
        return 0;
    }

    public Fsk getFsk()
    {
        //Code
        return null;
    }

    public Genre getGenre()
    {
        //Code
        return null;
    }

}

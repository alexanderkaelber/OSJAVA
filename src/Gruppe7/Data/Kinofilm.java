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
            String in_titel,
            int in_laufzeit,
            boolean in_threeD,
            String in_sprache,
            String in_Regisseur,
            int in_erscheinungsjahr,
            int in_beliebtheit,
            int in_verleipreis,
            Fsk in_fsk,
            Genre in_genre)
    {
        super(in_titel, in_laufzeit);
        threeD = in_threeD;
        sprache = in_sprache;
        regisseur = in_Regisseur;
        erscheinungsjahr = in_erscheinungsjahr;
        beliebtheit = in_beliebtheit;
        verleihpreisProWoche = in_verleipreis;
        fsk = in_fsk;
        genre = in_genre;
    }

    // Getter
    public boolean getThreeD()
    {
        return threeD;
    }

    public String getSprache()
    {
        return sprache;
    }

    public String getRegisseur()
    {
        return regisseur;
    }

    public int getErscheinungsjahr()
    {
        return erscheinungsjahr;
    }

    public int getBeliebtheit()
    {
        return beliebtheit;
    }

    public int getVerleihpreisProWoche()
    {
        return verleihpreisProWoche;
    }

    public Fsk getFsk()
    {
      return fsk;
    }

    public Genre getGenre()
    {
       return genre;
    }
}

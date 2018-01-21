package Gruppe7.Data;

public class Werbefilm extends Film
{
    private int umsatzProZuschauer;

    public Werbefilm(String in_titel, int in_laufzeit, int in_umsatzProZuschauer)
    {
        super(in_titel, in_laufzeit);
        umsatzProZuschauer = in_umsatzProZuschauer;

//        System.out.println("  Klasse Werbefilm: Werbefilmm Instanz erzeugt!");
//        System.out.println("  Klasse Werbefilm Bezeichnung: " + this.getTitel());
//        System.out.println("  Klasse Werbefilm Einnahmen: "+ umsatzProZuschauer);
//        System.out.println("  Klasse Lauzeit in min: "+this.getLaufzeit());
//        System.out.println("--------------------------------------------------");
    }

    //Getter
    public int getUmsatzProZuschauer()
    {
       return umsatzProZuschauer;
    }
}

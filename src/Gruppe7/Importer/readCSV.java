package Gruppe7.Importer;

public class readCSV {

    public readCSV() {
        try {
            java.io.BufferedReader FileReader=                      //ein Reader um die Datei Zeilenweise auszulesen
                    new java.io.BufferedReader(
                            new java.io.FileReader(
                                    new java.io.File("C:/import/saele.csv")
                            )
                    );

            String zeile="";

            while(null!=(zeile=FileReader.readLine())){         //lesen jeder Zeile
                String[] split=zeile.split(";");                //hier wird die Zeile zerlegt als Trennzeichen ;
                System.out.print(split[0]);                     //erste Zeit über index 0
                System.out.print(" --> ");

                //wenn du noch trennen willst zwischen h und
                //min wendest du die split Funktion einfach nochmal an mit dem Trennzeichen :
                //Bsp.
                //System.out.println((split[0].split(":"))[0]);  //--> Stunde der ersten Zeit
                //System.out.println((split[0].split(":"))[1]);  //--> min der ersten Zeit

                System.out.println(split[1]);                   //zweite Zeit über index 1
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new readCSV();
    }
}
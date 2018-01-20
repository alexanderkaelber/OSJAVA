package Gruppe7.Logic;

public class FilterBeliebtheit {

//Attribute

    private int filterBeliebtheit;

    //Constructor


     public FilterBeliebtheit (int in_filterBeliebtheit){

         filterBeliebtheit = in_filterBeliebtheit;

     }

    //Getter Setter
    public void setFilterBeliebtheit(int in_filterBeliebtheit) {

         if (in_filterBeliebtheit < 0 || in_filterBeliebtheit>100) {
             System.out.println("Der eingegebene Beliebtheitswert '" + in_filterBeliebtheit + "' ist außerhalb des gültigen Bereich. \nBitte wählen Sie einen Wert zwischen 0-100");
         }else{
             this.filterBeliebtheit = in_filterBeliebtheit;
             System.out.println("Ausgewählte Mindestbeliebtheit: " + filterBeliebtheit);
         }
     }

    public int getFilterBeliebtheit() {
        return filterBeliebtheit;
    }
}

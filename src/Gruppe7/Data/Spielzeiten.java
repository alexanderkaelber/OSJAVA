package Gruppe7.Data;

public enum Spielzeiten {

    SLOT_1500(150),
    SLOT_1730(150),
    SLOT_2000(180),
    SLOT_2300(150);

    private int slotDuration;
    Spielzeiten(int slotDuration){
        this.slotDuration = slotDuration;
    }

    public int getSlotDuration(){
        return this.slotDuration;
    }


}
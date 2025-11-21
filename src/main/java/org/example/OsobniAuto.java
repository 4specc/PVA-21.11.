package org.example;

public class OsobniAuto extends Auto {

    private int pocetMist;
    private int velikostKufru;

    public OsobniAuto(String znacka, String model, int rokVyroby, int rychlost, int pocetMist, int velikostKufru) {
        super(znacka, model, rokVyroby, rychlost);
        this.pocetMist = pocetMist;
        this.velikostKufru = velikostKufru;
    }

    @Override
    public void vypisInfo() {
        System.out.println("Osobní auto značky: " + getZnacka() + ", Model: " + getModel() + ", vyrobeno roku " + getRokVyroby() + ", s rychlostí: " + getRychlost() + ", s " + pocetMist + " místy a velikostí kufru: " + velikostKufru + "l");
    }

    public int getPocetMist() {
        return pocetMist;
    }
}

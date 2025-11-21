package org.example;

public class NakladniAuto extends Auto {

    private int nosnost;
    private int aktualniNaklad;

    public NakladniAuto(String znacka, String model, int rokVyroby, int rychlost, int nosnost, int aktualniNaklad) {
        super(znacka, model, rokVyroby, rychlost);
        this.nosnost = nosnost;
        this.aktualniNaklad = aktualniNaklad;
    }

    public void naloz(int kg) {
        if ((aktualniNaklad + kg) < nosnost )
            aktualniNaklad+=kg;
    }

    public void vyloz(int kg) {
        if ((aktualniNaklad - kg) > 0) aktualniNaklad-=kg;
    }

    @Override
    public void vypisInfo() {
        System.out.println("Nákladní auto značky: " + getZnacka() + ", Model: " + getModel() + ", vyrobeno roku " + getRokVyroby() + ", s rychlostí: " + getRychlost() + ", s nosností: " + nosnost + "kg a aktuálním nákladem: " + aktualniNaklad + "kg");
    }

    public int getAktualniNaklad() {
        return aktualniNaklad;
    }
}

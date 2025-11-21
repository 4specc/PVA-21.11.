package org.example;

public class Auto {
    private String znacka;
    private String model;
    private int rokVyroby;
    private int rychlost;

    public Auto(String znacka, String model, int rokVyroby, int rychlost) {
        this.znacka = znacka;
        this.model = model;
        this.rokVyroby = rokVyroby;
        this.rychlost = rychlost;
    }

    public void zrychli(int oKolik) {
        rychlost+=oKolik;
    }

    public void zpomal(int oKolik) {
        rychlost-=oKolik;
        if (rychlost <= 0) rychlost = 0;
    }

    public void zastav() {
        rychlost=0;
    }

    public void vypisInfo() {
        System.out.println("Auto značky: " + znacka + ", Model: " + model + ", vyrobeno roku " + rokVyroby + ", s rychlostí: " + rychlost);
    }

    @Override
    public String toString() {
        return "Auto{" +
                "znacka='" + znacka + '\'' +
                ", model='" + model + '\'' +
                ", rokVyroby=" + rokVyroby +
                ", rychlost=" + rychlost +
                '}';
    }

    public String getZnacka() {
        return znacka;
    }

    public String getModel() {
        return model;
    }

    public int getRokVyroby() {
        return rokVyroby;
    }

    public int getRychlost() {
        return rychlost;
    }
}

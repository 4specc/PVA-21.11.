package org.example;

import java.util.ArrayList;
import java.util.List;

public class SpravceAut {
    private ArrayList<Auto> seznamAut = new ArrayList<>();

    public void pridejAuto(Auto auto) {
        seznamAut.add(auto);
        System.out.println("Přidáno auto: " + auto.getZnacka() + " " + auto.getModel());
    }

    public void vypisVsechnaAuta() {
        System.out.println("\n=== Všechna auta v seznamu ===");
        for (Auto auto : seznamAut)
            auto.vypisInfo();
    }

    public List<Auto> najdiAutaPodleZnacky(String znacka) {
        System.out.println("\n=== Hledám auta podle značky: " + znacka + " ===");
        List<Auto> nalezenaAuta = new ArrayList<>();
        for (Auto auto : seznamAut) {
            if (auto.getZnacka().equals(znacka)) {
                nalezenaAuta.add(auto);
            }
        }
        System.out.println("Nalezeno " + nalezenaAuta.size() + " aut značky " + znacka);
        for (Auto auto : nalezenaAuta) {
            auto.vypisInfo();
        }
        return nalezenaAuta;
    }

    public List<Auto> najdiAutaPodleRoku(int rokOd, int rokDo) {
        System.out.println("\n=== Hledám auta podle roku výroby " + rokOd + " - " + rokDo + " ===");
        List<Auto> nalezenaAuta = new ArrayList<>();
        for (Auto auto : seznamAut) {
            int rokVyroby = auto.getRokVyroby();
            if (rokVyroby >= rokOd && rokVyroby <= rokDo) {
                nalezenaAuta.add(auto);
            }
        }
        System.out.println("Nalezeno " + nalezenaAuta.size() + " aut v zadaném rozsahu let");
        for (Auto auto : nalezenaAuta) {
            auto.vypisInfo();
        }
        return nalezenaAuta;
    }

    public List<Auto> najdiRychlaAuta(int minRychlost) {
        System.out.println("\n=== Hledám rychlá auta (min. " + minRychlost + " km/h) ===");
        List<Auto> nalezenaAuta = new ArrayList<>();
        for (Auto auto : seznamAut) {
            if (auto.getRychlost() >= minRychlost) {
                nalezenaAuta.add(auto);
            }
        }
        System.out.println("Nalezeno " + nalezenaAuta.size() + " aut s rychlostí nad " + minRychlost + " km/h");
        for (Auto auto : nalezenaAuta) {
            auto.vypisInfo();
        }
        return nalezenaAuta;
    }

    public List<NakladniAuto> najdiNakladniAutaSNakladem() {
        System.out.println("\n=== Hledám nákladní auta s nákladem ===");
        List<NakladniAuto> nalezenaAuta = new ArrayList<>();
        for (Auto auto : seznamAut) {
            if (auto instanceof NakladniAuto) {
                NakladniAuto nakladniAuto = (NakladniAuto) auto;
                if (nakladniAuto.getAktualniNaklad() > 0) {
                    nalezenaAuta.add(nakladniAuto);
                }
            }
        }
        System.out.println("Nalezeno " + nalezenaAuta.size() + " nákladních aut s nákladem");
        for (NakladniAuto auto : nalezenaAuta) {
            auto.vypisInfo();
        }
        return nalezenaAuta;
    }

    public List<OsobniAuto> najdiOsobniAutaSPocetemMist(int minPocetMist) {
        System.out.println("\n=== Hledám osobní auta s min. " + minPocetMist + " místy ===");
        List<OsobniAuto> nalezenaAuta = new ArrayList<>();
        for (Auto auto : seznamAut) {
            if (auto instanceof OsobniAuto) {
                OsobniAuto osobniAuto = (OsobniAuto) auto;
                if (osobniAuto.getPocetMist() >= minPocetMist) {
                    nalezenaAuta.add(osobniAuto);
                }
            }
        }
        System.out.println("Nalezeno " + nalezenaAuta.size() + " osobních aut s " + minPocetMist + "+ místy");
        for (OsobniAuto auto : nalezenaAuta) {
            auto.vypisInfo();
        }
        return nalezenaAuta;
    }

    public double prumerneStariAut() {
        System.out.println("\n=== Výpočet průměrného stáří aut ===");
        int aktualniRok = 2025;
        int soucetStari = 0;

        for (Auto auto : seznamAut) {
            int stari = aktualniRok - auto.getRokVyroby();
            soucetStari += stari;
        }
        double prumer = (double) soucetStari / seznamAut.size();
        System.out.println("Průměrné stáří aut: " + prumer + " let");
        return prumer;
    }

    public int pocetOsobnichAut() {
        int pocet = 0;
        for (Auto auto : seznamAut) {
            if (auto instanceof OsobniAuto) {
                pocet++;
            }
        }
        System.out.println("\nPočet osobních aut: " + pocet);
        return pocet;
    }

    public int pocetNakladnichAut() {
        int pocet = 0;
        for (Auto auto : seznamAut) {
            if (auto instanceof NakladniAuto) {
                pocet++;
            }
        }
        System.out.println("\nPočet nákladních aut: " + pocet);
        return pocet;
    }

    public Auto nejnovejsiAuto() {
        System.out.println("\n=== Hledám nejnovější auto ===");
        if (seznamAut.isEmpty()) {
            System.out.println("Seznam je prázdný");
            return null;
        }
        Auto nejnovejsi = seznamAut.get(0);

        for (Auto auto : seznamAut) {
            if (auto.getRokVyroby() > nejnovejsi.getRokVyroby()) {
                nejnovejsi = auto;
            }
        }
        System.out.println("Nejnovější auto: ");
        nejnovejsi.vypisInfo();
        return nejnovejsi;
    }
}

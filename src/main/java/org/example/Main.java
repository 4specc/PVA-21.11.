package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== VYTVÁŘENÍ AUT ===");

        Auto auto1 = new Auto("Audi", "M4123", 2018, 180);
        Auto auto2 = new Auto("Audi", "REA", 2005, 210);
        Auto auto3 = new Auto("Audi", "REA", 2011, 230);
        Auto auto4 = new Auto("Skoda", "GER", 2025, 205);
        Auto auto5 = new Auto("Skoda", "GER", 2001, 190);

        OsobniAuto osobniAuto1 = new OsobniAuto("Skoda", "TOMSIM", 2005, 190, 5, 20);
        OsobniAuto osobniAuto2 = new OsobniAuto("Skoda", "TOMSIM", 2020, 230, 5, 40);
        OsobniAuto osobniAuto3 = new OsobniAuto("BMW", "AAA", 1998, 310, 2, 30);
        OsobniAuto osobniAuto4 = new OsobniAuto("BMW", "AAA", 2004, 180, 5, 25);

        NakladniAuto nakladniAuto1 = new NakladniAuto("Skoda", "Nakladak", 2004, 120, 5000, 0);
        NakladniAuto nakladniAuto2 = new NakladniAuto("Skoda", "Nakladak", 2004, 120, 5000, 1200);
        NakladniAuto nakladniAuto3 = new NakladniAuto("Skoda", "Nakladak", 2004, 120, 5000, 800);

        SpravceAut spravceAut = new SpravceAut();

        System.out.println("\n=== PŘIDÁVÁNÍ AUT DO SPRÁVCE ===");
        spravceAut.pridejAuto(auto1);
        spravceAut.pridejAuto(auto2);
        spravceAut.pridejAuto(auto3);
        spravceAut.pridejAuto(auto4);
        spravceAut.pridejAuto(auto5);

        spravceAut.pridejAuto(osobniAuto1);
        spravceAut.pridejAuto(osobniAuto2);
        spravceAut.pridejAuto(osobniAuto3);
        spravceAut.pridejAuto(osobniAuto4);

        spravceAut.pridejAuto(nakladniAuto1);
        spravceAut.pridejAuto(nakladniAuto2);
        spravceAut.pridejAuto(nakladniAuto3);

        System.out.println("\n=== TESTOVÁNÍ METOD SPRÁVCE AUT ===");

        spravceAut.vypisVsechnaAuta();

        spravceAut.najdiAutaPodleZnacky("Skoda");

        spravceAut.najdiAutaPodleRoku(2015, 2025);

        spravceAut.najdiRychlaAuta(250);

        spravceAut.najdiNakladniAutaSNakladem();

        spravceAut.najdiOsobniAutaSPocetemMist(5);

        spravceAut.prumerneStariAut();

        spravceAut.pocetOsobnichAut();
        spravceAut.pocetNakladnichAut();

        spravceAut.nejnovejsiAuto();

        System.out.println("\n=== TESTOVÁNÍ METOD AUT ===");

        System.out.println("Test zrychlení:");
        auto1.vypisInfo();
        auto1.zrychli(20);
        auto1.vypisInfo();

        System.out.println("Test zpomalení:");
        auto2.vypisInfo();
        auto2.zpomal(50);
        auto2.vypisInfo();

        System.out.println("Test zastavení:");
        auto3.vypisInfo();
        auto3.zastav();
        auto3.vypisInfo();

        System.out.println("Test nakládání:");
        nakladniAuto1.vypisInfo();
        nakladniAuto1.naloz(1000);
        nakladniAuto1.vypisInfo();

        System.out.println("Test vykládání:");
        nakladniAuto2.vypisInfo();
        nakladniAuto2.vyloz(500);
        nakladniAuto2.vypisInfo();

        System.out.println("\n=== KONEC PROGRAMU ===");
    }
}
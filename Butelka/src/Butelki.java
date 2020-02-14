public class Butelki {

    int maxPojemnosc;
    int obecnaZawartosc;
    String nazwaNapoju;


    Butelki(int maxPjemnosc, int obecnaZawartosc, String nazwaNapoju) {
        this.maxPojemnosc = maxPjemnosc;
        this.obecnaZawartosc = obecnaZawartosc;
        this.nazwaNapoju = nazwaNapoju;


    }

    void przelej(Butelki but, int ile) {
        this.obecnaZawartosc = this.obecnaZawartosc - ile;
        but.obecnaZawartosc = but.obecnaZawartosc + ile;
    }
}
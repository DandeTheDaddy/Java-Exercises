import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        Butelki b1 = new Butelki(2, 1, "Piwo");
        Butelki b2 = new Butelki(2, 0, "Woda");

        System.out.println("ile owdy chcesz przelac");
        int ile = Skaner.skan.nextInt();

        if (b1.obecnaZawartosc + ile <= b1.maxPojemnosc) {
            b1.przelej(b2, ile);
            System.out.println(b2.obecnaZawartosc);}
        else{
                System.out.println("Za malo miejsca w butelce");

        }
    }
}

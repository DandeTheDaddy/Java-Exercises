import java.util.Scanner;

public class Glowna {



    public static void main(String[] args) {
        int a, b;
        char dzialanie;

        System.out.println("podaj a");
        a = Skaner.skanerek.nextInt();
        System.out.println("podaj b");
        b = Skaner.skanerek.nextInt();

        System.out.println("jakie dzialanie chcesz wykonac? wpisz o dla odejmowania, d dla dodawnia, x dla mnozenia, c dla dzielenia");
        dzialanie = Skaner.skanerek.next().charAt(0);

        if (dzialanie == 'o') {
            System.out.println("wynik odejmowania to " + Kalkulator.metodaOdejmowanie(a, b));
        } else if (dzialanie == 'd') {
            System.out.println("wynik dodawania to " + Kalkulator.metodaDodawanie(a, b));
        } else if (dzialanie == 'x') {
            System.out.println("wynik mnozenia to " + Kalkulator.metodaMnozenie(a, b));
        } else if (dzialanie == 'c' && b == 0) {
            System.out.println("Nie dzie przez 0");
            System.out.println("podaj b inne niz 0");
            b = Skaner.skanerek.nextInt();
            while (b == 0) {
                System.out.println("Nie przez 0 baranie!!!!");
                System.out.println("podaj b inne niz 0!!!");
                b = Skaner.skanerek.nextInt();
            }
            System.out.println("wynik dzielenia to " + Kalkulator.metodaDzielenie(a, b));
        }

    }
}


public class Main {
    public static void main(String[] args) {
        char x;
        int y;

        KartaPlatnicza k1 = new KartaPlatnicza(10000, 11112223, "mBank");
        KartaPlatnicza k2 = new KartaPlatnicza(5000, 99998888, "PKO");

        Bankomat b = new Bankomat(1);

        System.out.println("Dzien dobry, jaka operacje chcesz wykonac?");
        System.out.println("Wpisz A dla wplaty srodkow");
        System.out.println("Wpisz B dla wyplaty srodkow");
        System.out.println("Wpisz c dla przelewu");

        x = Skaner.skan.nextLine().toUpperCase().charAt(0); //toUpperCase - zmieni znaki na duze / .charAt rozwiniecie dla char

        switch (x) {
            case 'A':
                System.out.println("Jaka kwote chcesz wplacic?");
                y = Skaner.skan.nextInt();
                b.wplac(k1,y);
                System.out.println(k1.srodki);
                break;

            case 'B':
                System.out.println("Jaka kwote chcesz wyplacic?");
                y = Skaner.skan.nextInt();
                b.wyplac(k1,y);
                System.out.println(k1.srodki);
                break;
            case 'C':
                System.out.println("Jaka kwote chcesz przelac?");
                y = Skaner.skan.nextInt();
                b.przelej(k1,k2,y);
                System.out.println("Srodki na karcie 1 = "+ k1.srodki + " Srodki na karcie 2 = "+ k2.srodki);
                break;
            default:
                break;


        }


    }
}

public class Main {
    public static void main(String[] args) {
        int x1, x2, y1, y2;

        System.out.println(" podaj wartosc x dla punktu p1");
        x1 = Skaner.Skan.nextInt();
        System.out.println(" podaj wartosc y dla punktu p1");
        y1 = Skaner.Skan.nextInt();
        Punkt p1 = new Punkt(x1, y1);

        System.out.println(" podaj wartosc x dla punktu p2");
        x2 = Skaner.Skan.nextInt();
        System.out.println(" podaj wartosc y dla punktu p2");
        y2 = Skaner.Skan.nextInt();
        Punkt p2 = new Punkt(x2, y2);


        Punkt.porownaj(p1, p2);
    }


}

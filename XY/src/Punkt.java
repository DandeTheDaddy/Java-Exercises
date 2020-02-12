public class Punkt {

    int wartoscX;
    int wartoscY;

    Punkt(int wartoscX, int wartoscY) {
        this.wartoscX = wartoscX;
        this.wartoscY = wartoscY;
    }

    static void porownaj(Punkt p1, Punkt p2) {
        if (p1.wartoscX == p2.wartoscX && p1.wartoscY == p2.wartoscY)
            System.out.println("P1 i P2 sa rowne");
        else System.out.println("P1 i P2 nie sa rowne");

    }

}

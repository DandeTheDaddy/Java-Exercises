public class Bankomat {

    Bankomat(int id){ //Konstruktor - przyklad z dana ID. W przypadku braku zadziala jajko pusty

    }

    void wplac(KartaPlatnicza kartaPlatnicza, int ile) {
        kartaPlatnicza.srodki = kartaPlatnicza.srodki + ile;
    }
    void wyplac(KartaPlatnicza kartaPlatnicza, int ile) {
        kartaPlatnicza.srodki = kartaPlatnicza.srodki - ile;
    }
    void przelej(KartaPlatnicza k1,KartaPlatnicza k2, int ile) {
        k1.srodki = k1.srodki - ile;
        k2.srodki = k2.srodki + ile;
    }
}

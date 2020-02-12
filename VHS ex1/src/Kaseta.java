public class Kaseta {

    String nazwaFilmu;
    int dlugoscFilmu;
    int rozmiarKasety;
    boolean czyPusta;

    Kaseta(){

    }
    Kaseta(String nazwaFilmu, int dlugoscFilmu, int rozmiarKasety, boolean czyPusta){
        this.nazwaFilmu=nazwaFilmu;
        this.dlugoscFilmu=dlugoscFilmu;
        this.rozmiarKasety=rozmiarKasety;
        this.czyPusta=czyPusta;
    }
}

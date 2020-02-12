public class Magnetowid {
    boolean czyWlaczony;

    Magnetowid() {
        czyWlaczony = true;
    }



    void nagrywanie(Kaseta kaseta, String tytulFilmu, int dlugoscFilmu) {
        kaseta.czyPusta = false;
        kaseta.nazwaFilmu = tytulFilmu;
        kaseta.dlugoscFilmu = dlugoscFilmu;

    }
    void przegrywanie(Kaseta a, Kaseta b){
        a.nazwaFilmu = b.nazwaFilmu;
        a.dlugoscFilmu = b.dlugoscFilmu;
    }

}

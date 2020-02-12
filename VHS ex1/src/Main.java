public class Main {
    public static void main(String[] args) {



        Kaseta k1 = new Kaseta("brak", 0, 120,true);
        Kaseta k2 = new Kaseta("Top Gun", 120 , 120 ,false);

        Magnetowid m = new Magnetowid();

        m.nagrywanie(k1, "Shrek", 120);
        m.nagrywanie(k2, "Top Gun", 120);

        System.out.println(k1.nazwaFilmu + " i " + k2.nazwaFilmu);

        m.przegrywanie(k1, k2);

        System.out.println(k1.nazwaFilmu);



    }
}

package ba.unsa.etf.rpr;

public class Korpa {
    private final int BROJEL=50;
    private Artikl[] artiklikorpe = new Artikl[BROJEL];
    public boolean dodajArtikl(Artikl a) {
        for(int i = 0; i < BROJEL; i++) {
            if(artiklikorpe[i]==null) artiklikorpe[i] = a;
            return true;
        }
        return false;
    }

    public Artikl[] getArtikli() {
        return artiklikorpe;
    }
}

package ba.unsa.etf.rpr;

public class Supermarket {
    private final int MAXELEMENT = 1000;
    Artikl[] artikli = new Artikl[MAXELEMENT];

    public boolean dodajArtikl(Artikl a) {
        for(int i = 0; i < MAXELEMENT; i++) {
            if(artikli[i]==null) {
                artikli[i] = a;
                return true;
            }
        }
        return false;
    }

    public Artikl[] getArtikli() {
        return artikli;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        Artikl povratna = null;
        for (int i = 0; i < MAXELEMENT; i++){
            if(artikli[i]!=null)
            if(kod.equals(artikli[i].getKod()) == true) {
                povratna = artikli[i];
                artikli[i] = null;
                return povratna;
            }
        }
        return povratna;
    }
}

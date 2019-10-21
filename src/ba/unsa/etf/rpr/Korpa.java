package ba.unsa.etf.rpr;

public class Korpa {
    private final int BROJEL = 50;
    private Artikl[] artiklikorpe = new Artikl[BROJEL];
    public boolean dodajArtikl(Artikl a) {
        for(int i = 0; i < BROJEL; i++) {
            if(artiklikorpe[i]==null) {
                artiklikorpe[i] = a;
                return true;
            }
        }
        return false;
    }

    public Artikl[] getArtikli() {
        return artiklikorpe;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        Artikl povratna = null;
        for (int i = 0; i < BROJEL; i++){
            if(artiklikorpe[i]!=null)
            if(kod.equals(artiklikorpe[i].getKod()) == true) {
                povratna = artiklikorpe[i];
                artiklikorpe[i] = null;
                return povratna;
            }
        }
        return povratna;
    }

    public int dajUkupnuCijenuArtikala() {
        int suma = 0;
        for(int i = 0; i < BROJEL; i++) {
            if (artiklikorpe[i]!=null)
            suma = suma + artiklikorpe[i].getCijena();
        }
        return suma;
    }
}

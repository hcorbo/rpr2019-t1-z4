package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {

    @Test
    void testProba() {
        int i=1;
        assertEquals(1, i);
    }

    @Test
    void testDodavanja() {
        Korpa korpa = new Korpa();
        Artikl a = new Artikl("Biciklo", 1000, "1");
        korpa.dodajArtikl(a);
        assertEquals(("(Biciklo 1 1000)"), korpa.getArtikli()[0].toString());
    }
}
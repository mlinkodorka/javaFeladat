package hu.szamalk.modell;

import static org.junit.jupiter.api.Assertions.*;

class testSzakTargyNevek {

}
    @Test
    void testSzakTargyNevek() throws Exception {
        Tantargy t = new Tantargy();
        Szak sz = new Szak("Informatika");


        Tantargy t = new Tantargy("informatika", 3, "Kovács Imre", "Kovács Imre", 1, nem);
        t.beallit(Szak);

        boolean sikerult = t.beallit(new Tantargy("informatika", 3, "Kovács Imre", "Kovács Imre", 1, nem));
        assertFalse(sikerult, "Nem lehet duplikált tanár!");


    }
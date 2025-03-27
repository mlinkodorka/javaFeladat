package hu.szamalk.modell;

import java.util.List;
import java.util.UUID;

public class Szak {
    private Tantargy tantargy;
    private String nev;
    private UUID id;

    public Szak(Tantargy tantargy, String nev,UUID id)
            throws TanarNeveDuplaException{
        super(Tantargy)
        if(tantargy.getTanar1() == tantargy.getTanar2()){
            throw new TanarNeveDuplaException{"A két tanár nem egyezhet meg!"};
            this.tantargy = tantargy;
            this.nev = nev;
            this.id = UUID.randomUUID();
        }

    public Tantargy getTantargy() {
        return tantargy;
    }

    public String getNev() {
        return nev;
    }

    public UUID getId() {
        return id;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public void setTantargy(Tantargy tantargy) {
        this.tantargy = tantargy;
    }

    public void szakKiirasa(String tantargy) throws IOException {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(tantargy))) {
            out.writeObject(this.tantargy);
        }
    }

    public void szakBeolvasasa(String tantargy) throws IOException, ClassNotFoundException {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(tantargyak))) {
            this.tantargy = (Set<Tantargy>) in.readObject();
        }
    }

    public List<Szak> getTargyakNevSzerint() {
        return tantargy.stream()
                .filter(j -> j instanceof Szak)
                .map(j -> (Szak) j)
                .sorted(Szak.nevRendezo())
                .toList();
    }

    public List<Szak> getTargyakKreditSzerint() {
        return tantargy.stream()
                .filter(j -> j instanceof Szak)
                .map(j -> (Szak) j)
                .sorted(Szak.kreditRendezo())
                .toList();
    }

    @Override
    public String toString(){
        return "Szak: " + nev;
    }

    void szakKiirasa() {
        try {
            Tantargy tantargy = new Tantargy("informatika", 3, "Kovács Imre", "Turán Lajos", 1, nem);
            FileOutputStream fajlKi = new FileOutputStream("targyak.dat");
            ObjectOutputStream objKi = new ObjectOutputStream(fajlKi);
            objKi.writeObject(tantargy);
            objKi.close();
            System.out.println("A tantárgy sikeresen kiírva a fájlba: targyak.dat");

        } catch (IOException e) {
            System.err.println("Hiba az írás során: " + e.getMessage());
            e.printStackTrace();
        }
    }

    p
}

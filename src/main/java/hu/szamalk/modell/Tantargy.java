package hu.szamalk.modell;

import java.util.UUID;

public class Tantargy {
    private String nev;
    private int kredit;
    private String tanar1;
    private String tanar2;
    private String felev;
    private Boolean csakVizsga;

    public String getNev() {
        return nev;
    }

    public int getKredit() {
        return kredit;
    }

    public String getTanar1() {
        return tanar1;
    }

    public String getTanar2() {
        return tanar2;
    }

    public String getFelev() {
        return felev;
    }

    public Boolean getCsakVizsga() {
        return csakVizsga;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public void setKredit(String kredit) {
        this.kredit = kredit;
    }

    public void setTanar1(String tanar1) {
        this.tanar1 = tanar1;
    }

    public void setTanar2(String tanar2) {
        this.tanar2 = tanar2;
    }

    public void setFelev(String felev) {
        this.felev = felev;
    }

    public void setCsakVizsga(Boolean csakVizsga) {
        this.csakVizsga = csakVizsga;
    }

}

package Zaposlenivezbanje;

public class Ucenik {
    private String ime;
    private Dnevnik dnevnik;

    public Ucenik(Dnevnik dnevnik) {
        this.dnevnik =  new Dnevnik();
    }

    public Ucenik(String ime) {
        this.ime = ime;
    }

}

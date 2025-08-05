package Zaposlenivezbanje;

public class Menadzer extends Zaposleni{
    private int brojTimova;

    public Menadzer(String ime, double plata,int brojTimova) {
        super(ime, plata);
        this.brojTimova=brojTimova;
    }

    public int getBrojZaposlenih() {
        return brojTimova;
    }

    public void setBrojZaposlenih(int brojZaposlenih) {
        this.brojTimova = brojTimova;
    }

    @Override
    public void opisiSe() {
        super.opisiSe();
        System.out.println("Broj timova je: " + brojTimova);
    }
}

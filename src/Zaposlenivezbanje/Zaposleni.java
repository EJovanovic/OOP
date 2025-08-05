package Zaposlenivezbanje;

public class Zaposleni {

    private String ime;
    private double plata;

    public Zaposleni(String ime, double plata) {
        this.ime = ime;
        this.plata = plata;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public double getPlata() {
        return plata;
    }

    public void setPlata(double plata) {
        this.plata = plata;
    }
    public void opisiSe(){
        System.out.println("Ime: " + ime + ", Plata "+ plata);
    }
}

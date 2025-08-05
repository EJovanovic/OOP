package Domaci2;

public abstract class Osoba {
    private String ime;
    private int godine;

    public Osoba(String ime, int godine) {
        this.ime = ime;
        this.godine = godine;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public int getGodine() {
        return godine;
    }

    public void setGodine(int godine) {
        this.godine = godine;
    }

    public void predstaviSe() {
        System.out.println("Ime: " + ime + ", godine: " + godine);
    }

    public abstract void opisiSebe();

    public abstract String getUloga();
}


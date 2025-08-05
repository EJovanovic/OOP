package Vezbanje;

public class Ucenici extends Osoba{
    private int razred;

    public Ucenici(String ime, int godine, int razred) {
        super(ime, godine);
        this.razred=razred;
    }

    @Override
    public void predstaviSe() {
        super.predstaviSe();
        System.out.println("razred " + razred);
    }
}

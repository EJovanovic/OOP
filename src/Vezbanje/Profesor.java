package Vezbanje;

public class Profesor extends Osoba{
    private String predmet;

    public Profesor(String ime, int godine, String predmet) {
        super(ime, godine);
        this.predmet = predmet;
    }
    @Override
    public void predstaviSe() {
        super.predstaviSe();
        System.out.println("predmet " + predmet);
    }


    }


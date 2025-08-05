package Domaci2;

public class Direktor extends Osoba{

    public Direktor(String ime, int godine) {
        super(ime, godine);
    }
    public void pregledajProfesora(Profesor profesor){
        System.out.println("Ime profesora je: " + profesor.getIme() + ", predaje: " + profesor.getPredmet());

    }

    @Override
    public void opisiSebe() {
        System.out.println("JA SAM DIREKTOR SKOLE!");

    }

    @Override
    public String getUloga() {
        return "Direktor";
    }
}

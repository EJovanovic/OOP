package Domaci2;

public class Profesor extends Osoba{
    private String predmet;

    public Profesor(String ime, int godine,String predmet) {
        super(ime, godine);
        this.predmet=predmet;
    }

    public String getPredmet() {
        return predmet;
    }

    public void setPredmet(String predmet) {
        this.predmet = predmet;
    }

    public void oceniUcenika(Ucenik ucenik, int ocena){
    ucenik.dodajOcenu(ocena);
}

@Override
public void opisiSebe() {
    System.out.println("Predajem predmet: " + predmet);

}

@Override
public String getUloga() {
    return "Profesor";
}
}




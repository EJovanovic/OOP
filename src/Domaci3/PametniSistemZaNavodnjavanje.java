package Domaci3;

public class PametniSistemZaNavodnjavanje extends UredjajNaGazdinstvu implements Povezivo, Obavestava{
    private String zona;

    public PametniSistemZaNavodnjavanje(String oznaka,String zona) {
        super(oznaka);
        this.zona=zona;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    @Override
    public void opis() {
        System.out.println("Pametni sistem za navodnjavanje u zoni "+ zona + " ,oznaka: "+ getOznaka());

    }

    @Override
    public void posaljiObavestenje(String poruka) {
        System.out.println("Sistem za navodnjavanje u zoni " + zona + " je ukljucen.");
        
    }

    @Override
    public void poveziNaInternet() {
        System.out.println("Sistem za navodnjavanje u zoni "+ zona + " je povezan na internet");

    }

    @Override
    public void diskonektujInternet() {
        System.out.println("Sistem za navodnjavanje u zoni " + zona + " je diskonektovan sa interneta");

    }
}

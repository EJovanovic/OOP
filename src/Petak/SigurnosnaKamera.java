package Petak;

public abstract class SigurnosnaKamera implements Ukljucivo,Povezivo,Obavestava {
  private String naziv;

    public SigurnosnaKamera(String naziv) {
        this.naziv = naziv;
    }

    @Override
    public void ukljuci() {
        System.out.println("Kamera" + naziv + "ukljucena");
    }

    @Override
    public void iskljuci() {
        System.out.println("Kamera" + naziv + "iskljucena");

    }

    @Override
    public void poveziNaInternet() {
        System.out.println("Kamera" + naziv + "povezana na internet");
    }

    @Override
    public void diskonektujInternet() {
        System.out.println("Kamera" + naziv + "diskonektovana");
    }

    @Override
    public void posaljiNotifikaciju(String poruka) {
        System.out.println("Kamera " +naziv+ poruka);
    }
}


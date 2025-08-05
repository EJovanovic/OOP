package Petak;

public abstract class PametnaSijalica implements Ukljucivo,Povezivo{
    private String naziv;

    public PametnaSijalica(String naziv) {
        this.naziv = naziv;
    }

    @Override
    public void ukljuci() {
        System.out.println("Sijalica XYZ" + naziv + "ukljucena");
    }

    @Override
    public void iskljuci() {
        System.out.println("Sijalica XYZ" + naziv + "iskljucena");
    }

    @Override
    public void poveziNaInternet() {
        System.out.println("Sijalica XYZ" + naziv +"povezana na internet");
    }

    @Override
    public void diskonektujInternet() {
        System.out.println("Sijalica XYZ" + naziv+ "diskonektovana");
    }
}



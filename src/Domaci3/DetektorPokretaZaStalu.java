package Domaci3;

public class DetektorPokretaZaStalu extends UredjajNaGazdinstvu implements Obavestava{

    public DetektorPokretaZaStalu(String oznaka) {
        super(oznaka);
    }

    @Override
    public void opis() {
        System.out.println("Detektor pokreta za stalu,oznaka: " + getOznaka());

    }

    @Override
    public void posaljiObavestenje(String poruka) {
        System.out.println("Kretanje u stali detektovano!");
    }
}

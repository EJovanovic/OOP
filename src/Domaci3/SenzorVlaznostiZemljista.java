package Domaci3;

public class SenzorVlaznostiZemljista extends UredjajNaGazdinstvu implements Meri{
    private double trenutnaVlaznost;

    public SenzorVlaznostiZemljista(String oznaka, double trenutnaVlaznost) {
        super(oznaka);
        this.trenutnaVlaznost=trenutnaVlaznost;
    }

    public double getTrenutnaVlaznost() {
        return trenutnaVlaznost;
    }

    public void setTrenutnaVlaznost(double trenutnaVlaznost) {
        this.trenutnaVlaznost = trenutnaVlaznost;
    }

    @Override
    public void opis() {
        System.out.println("Senzor vlaznosti zemljista,oznaka: " + getOznaka() + " ,trenutna vlaznost: " + trenutnaVlaznost);

    }

    @Override
    public double ocitaj() {
        System.out.println("Trenutna vlaznost je: " + trenutnaVlaznost);
        return trenutnaVlaznost;

    }
}

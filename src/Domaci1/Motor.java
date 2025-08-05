package Domaci1;

public class Motor extends Vozilo{
    private int zapremina;

    public Motor(String proizvodjac, int godiste, int zapremina) {
        super(proizvodjac, godiste);
        this.zapremina = zapremina;
    }

    public int getZapremina() {
        return zapremina;
    }

    public void setZapremina(int zapremina) {
        this.zapremina = zapremina;
    }

    @Override
    public void opisiMe() {
        System.out.println("Motor marke: " + getProizvodjac() + ",zapremina " + zapremina
        +" cc, godiste: " + getGodiste());
    }
}



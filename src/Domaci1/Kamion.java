package Domaci1;

public class Kamion  extends Vozilo{
    private int nosivost;

    public int getNosivost() {
        return nosivost;
    }

    public void setNosivost(int nosivost) {
        this.nosivost = nosivost;
    }

    public Kamion(String proizvodjac, int godiste, int nosivost) {
        super(proizvodjac, godiste);
        this.nosivost=nosivost;
    }

    @Override
    public void opisiMe() {
        System.out.println("Kamion " + getProizvodjac() + ",nosivost: " + getNosivost()+ " kg,godiste: " + getGodiste());
    }
}

package Zivotinje;

public class Svinja extends Zivotinja{


    public Svinja(String ime, int brojNogu, String proizvod) {
        super(ime, 4, "meso");

    }

    @Override
    public void oglasiSe() {
        System.out.println(getIme() + "grok");

    }
}

package Zivotinje;

public class Ovca extends Zivotinja{


    public Ovca(String ime, int brojNogu, String proizvod) {
        super(ime, 4, "vuna");
    }

    @Override
    public void oglasiSe() {
        System.out.println(getIme()+"bee");

    }
}

package Zivotinje;

public class Krava extends Zivotinja{


    public Krava(String ime, int brojNogu, String proizvod) {
        super(ime, 4, "mleko");
    }


    @Override
    public void oglasiSe() {
        System.out.println(getIme() + "muu");

    }
}

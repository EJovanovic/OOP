package Zivotinje;

public class Kokoska extends Zivotinja {

    public Kokoska(String ime, int brojNogu, String proizvod) {
        super(ime, 2,"jaje");
    }

    @Override
    public void oglasiSe() {
        System.out.println(getIme() + "kokoda");

    }
}

package Zivotinje;

public abstract class Zivotinja {
    private String ime;
    private int brojNogu;
    private String proizvod;

    public Zivotinja(String ime, int brojNogu, String proizvod) {
        this.ime = ime;
        this.brojNogu = brojNogu;
        this.proizvod = proizvod;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public int getBrojNogu() {
        return brojNogu;
    }

    public void setBrojNogu(int brojNogu) {
        this.brojNogu = brojNogu;
    }

    public String getProizvod() {
        return proizvod;
    }

    public void setProizvod(String proizvod) {
        this.proizvod = proizvod;
    }
    public abstract void oglasiSe();
}

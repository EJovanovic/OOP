package Domaci;

public class Vozilo {

    private String marka;
    private int godiste;
    private double potrosnja;

    public Vozilo(String marka, int godiste, double potrosnja) {
        this.marka = marka;
        this.godiste = godiste;
        this.potrosnja = potrosnja;
    }

    public Vozilo(Vozilo drugi) {
        this.marka = drugi.marka;
        this.godiste = drugi.godiste;
        this.potrosnja = drugi.potrosnja;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getGodiste() {
        return godiste;
    }

    public void setGodiste(int godiste) {
        this.godiste = godiste;
    }

    public double getPotrosnja() {
        return potrosnja;
    }

    public void setPotrosnja(double potrosnja) {
        this.potrosnja = potrosnja;
    }

    @Override
    public String toString() {
        return "Vozilo: " + marka + ", godiste: " + godiste + " ,potrosnja " + potrosnja + " L/100km ";
    }
}

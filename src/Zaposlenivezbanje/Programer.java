package Zaposlenivezbanje;

public class Programer extends Zaposleni{
    private String programskiJezik;

    public Programer(String ime, double plata, String programskiJezik) {
        super(ime, plata);
        this.programskiJezik=programskiJezik;
    }

    public String getProgramskiJezik() {
        return programskiJezik;
    }

    public void setProgramskiJezik(String programskiJezik) {
        this.programskiJezik = programskiJezik;
    }

    @Override
    public void opisiSe() {
        super.opisiSe();//poziv opis iz roditeljske klase
        System.out.println("Programski jezik: " +  programskiJezik);
    }
}

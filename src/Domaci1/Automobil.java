package Domaci1;

public class Automobil extends Vozilo{
    private int brojVrata;

    public Automobil(String proizvodjac, int godiste, int brojVrata) {
        super(proizvodjac, godiste);
        this.brojVrata=brojVrata;
    }

    public int getBrojVrata() {
        return brojVrata;
    }

    public void setBrojVrata(int brojVrata) {
        this.brojVrata = brojVrata;
    }

    @Override
    public void opisiMe() {
        System.out.println("Automobil proizvodjaca:"+ getProizvodjac()  + " , broj vrata: " + brojVrata+ " ,godiste: "+ getGodiste());
    }
}

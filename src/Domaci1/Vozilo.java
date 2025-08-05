package Domaci1;

public class Vozilo {
    private String proizvodjac;
    private int godiste;

    public Vozilo(String proizvodjac, int godiste) {
        this.proizvodjac = proizvodjac;
        this.godiste = godiste;
    }

    public String getProizvodjac() {
        return proizvodjac;
    }

    public void setProizvodjac(String proizvodjac) {
        this.proizvodjac = proizvodjac;
    }

    public int getGodiste() {
        return godiste;
    }

    public void setGodiste(int godiste) {
        this.godiste = godiste;
    }

    public void opisiMe(){
        System.out.println ("Vozilo proizvodjaca: " + proizvodjac + " ,godiste: " +  godiste);
}

}

package Domaci1;

public class SportskiAutomobil extends Automobil {
    private int maximalnaBrzina;

    public SportskiAutomobil(String proizvodjac, int godiste, int brojVrata, int maximalnaBrzina) {
        super(proizvodjac, godiste, brojVrata);
        this.maximalnaBrzina = maximalnaBrzina;
    }

    public int getMaximalnaBrzina() {
        return maximalnaBrzina;
    }

    public void setMaximalnaBrzina(int maximalnaBrzina) {
        this.maximalnaBrzina = maximalnaBrzina;
    }

    @Override
    public void opisiMe() {
        System.out.println(" Sportski automobil: " + getProizvodjac()+ " vrata: "+
                getBrojVrata()+ " ,max brzina: " + maximalnaBrzina+ " km/h, "+ "godiste " + getGodiste());
    }
}


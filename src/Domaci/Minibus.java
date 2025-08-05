package Domaci;

public class Minibus extends Vozilo{
    int brojMesta;


    public Minibus(String marka, int godiste, double potrosnja,int brojMesta) {
        super(marka, godiste, potrosnja);
        this.brojMesta=brojMesta;
    }
    public Minibus(Minibus drugi){
        super(drugi);
        this.brojMesta = drugi.brojMesta;

    }

    public int getBrojMesta() {
        return brojMesta;
    }

    public void setBrojMesta(int brojMesta) {
        this.brojMesta = brojMesta;
    }

    @Override
    public String toString() {
        return super.toString() + " ,broj mesta:" + brojMesta;
    }
}

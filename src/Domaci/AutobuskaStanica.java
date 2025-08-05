package Domaci;

import java.util.ArrayList;

public class AutobuskaStanica {
    private ArrayList<Vozilo> vozila;

public AutobuskaStanica(ArrayList<Vozilo>vozila) {
    this.vozila = new ArrayList<>();//prazna lista
    for (Vozilo v : vozila) {//za svako vozilo pravim kopiju
        if (v instanceof Autobus) {//ako je autobus onda pravim kopiju kao autobus
            this.vozila.add(new Autobus((Autobus) v));
        } else if (v instanceof Minibus) {//ako je minibus onda kopija kao minibus
            this.vozila.add(new Minibus((Minibus) v));
        } else {//ako nije ni autobus ni minibus
            this.vozila.add(new Vozilo(v));
        }
    }
}
public void dodajVozilo(Vozilo v) {
    if (v instanceof Autobus) {
        vozila.add(new Autobus((Autobus) v));
    } else if (v instanceof Minibus) {
        vozila.add(new Minibus((Minibus) v));
    } else {
        vozila.add(new Vozilo(v));

    }
}
    public void ispisiVozila() {
        for (Vozilo v : vozila) {
            System.out.println(v);
        }
    }
    public int brojMedjugradskihAutobusa(){
    int brojac=0;
    for(Vozilo v:vozila) {
        if (v instanceof Autobus) {//da li je vozilo autobus
            Autobus x = (Autobus) v;//prebacujem ga da mogu da mu pristupim
            if (x.isMedjugradski()) {//da li je medjugradski
                brojac++;//ako jeste ti dodaj
            }
        }
    }
        return brojac;

}
        public double prosecnaPotrosnja(){
    if(vozila.isEmpty())// ako nema vozila
        return -1;

    double suma=0;
    for(Vozilo v:vozila) {
        suma += v.getPotrosnja();//sabiram potrosnju svakog vozila
    }
    return suma/vozila.size();//da bih dobila prosek


    }

        }















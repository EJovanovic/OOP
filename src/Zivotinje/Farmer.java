package Zivotinje;

import java.util.ArrayList;
import java.util.List;

public class Farmer {
    List<Zivotinja> sveZivotinje=new ArrayList<>();
    public void dodajSveZivotinje(Zivotinja x){
        sveZivotinje.add(x);
    }
    public int ukupanBrojNogu(){
        int suma=0;
        for(Zivotinja x: sveZivotinje){
            suma+= x.getBrojNogu();
        }
        return suma;
    }
    public void oglasiSe(Zivotinja z){
        z.oglasiSe();

    }
    public void oglasiSve() {
        for (Zivotinja z : sveZivotinje) {
            z.oglasiSe();
        }
    }
        public void ispisiProizvode(){
        int brojJaja=0;
        int brojMleka=0;
        int brojVune=0;
        int brojMesa=0;

        for(Zivotinja z: sveZivotinje){
            if(z instanceof Kokoska) {
                brojJaja++;
            } else if(z instanceof Krava) {
                brojMleka++;
            } else if(z instanceof Ovca) {
                brojVune++;

            }


        }
    }

}

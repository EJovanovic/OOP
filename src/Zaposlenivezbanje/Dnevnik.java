package Zaposlenivezbanje;

import java.util.ArrayList;
import java.util.List;

public class Dnevnik {
    private List<Integer>ocene;//atribut koji ce cuvati ocene

    public Dnevnik() {
        this.ocene = new ArrayList<>();//kada napravimo novi dnevnik on pravi praznu listu
    }
    public void dodajOcenu(int ocena){
        ocene.add(ocena);
    }
    public void prikaziOcene(){
        System.out.println("Ocene: " + ocene);
    }
}

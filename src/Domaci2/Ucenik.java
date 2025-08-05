package Domaci2;

import java.util.ArrayList;
import java.util.List;

public class Ucenik extends Osoba {
    private int razred;
    private List<Integer> ocene;


    public Ucenik(String ime, int godine, int razred) {
        super(ime, godine);
        this.razred = razred;
        this.ocene = new ArrayList<>();

    }
        public void dodajOcenu(int ocena) {
            ocene.add(ocena);
        }
        public double prosecnaOcena(){
        if(ocene.isEmpty()){
            return 0.0;//ako je lista prazna vrati nulu
        }
        int suma=0;
        for(Integer ocena:ocene){
            suma+=ocena;

        }
        return (double) suma/ocene.size();

    }

    @Override
    public void opisiSebe() {
        System.out.println("Prosecna ocena ucenika je: " + prosecnaOcena());

    }

    @Override
    public String getUloga() {
        return "Ucenik";
    }
}

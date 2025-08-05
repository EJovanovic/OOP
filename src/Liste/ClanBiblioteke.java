package Liste;

import java.util.ArrayList;

public class ClanBiblioteke extends Osoba1{
    private ArrayList<String>pozajmljeneKnjige;

    public ClanBiblioteke(String ime, String prezime, int godine) {
        super(ime, prezime, godine);
        this.pozajmljeneKnjige=new ArrayList<>();
    }

    public ArrayList<String> getPozajmljeneKnjige() {
        return pozajmljeneKnjige;
    }
    public void dodajKnjigu(String naziv) {
        pozajmljeneKnjige.add(naziv);
    }
    public void izbrisiKnjigu(int index) {
        if (index >= 0 && index < pozajmljeneKnjige.size()) {//ne trazi knjigu ispod indeksa nula i mora biti u pozajmljenim knjigama
            pozajmljeneKnjige.remove(index);
        }
    }
        public int brojKnjige() {
            return pozajmljeneKnjige.size();
        }
        public void kaziStaRadis() {
            System.out.println("Ja citam knjigu");
        }
        public String toString(){
        return "Ime" + getIme()+ "\n"+
        "prezime" + getPrezime() + "\n"+
                "godine" + getGodine() + "\n"+
                "Pozajmljene knjige" + getPozajmljeneKnjige()+ "\n";





        }


    }

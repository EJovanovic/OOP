package Liste;

import java.util.ArrayList;

public class UcenikVezbanje extends OsobaVezbanje {

    private ArrayList<Integer>ocene;//prvo deklarisemo ocene gde cemo ih smestiti
    private void postaviOcene(ArrayList<Integer>ocene){//ovo je metoda koja prima kao argument listu ocena
        this.ocene=new ArrayList<>();//inicijalizujem prazno polje, kreiramo novu praznu listu
        this.ocene.addAll(ocene);//dodajemo ocene,pravimo duboku kopiju
    }



    public UcenikVezbanje(String ime, String prezime, int brojGodina) {
        super(ime, prezime, brojGodina);
        postaviOcene(ocene);

    }

    public ArrayList<Integer> getOcene() {
        return ocene;
    }

    public void setOcene(ArrayList<Integer> ocene) {
        this.ocene = ocene;
    }
    public double prosek() {
        int suma = 0;
        for (Integer ocena : ocene) {
            suma += ocena;
        }
        return (double) suma / ocene.size();
    }
    private boolean ValidirajOcenu(int ocena) {
        return 1 <= ocena && ocena <= 5;
    }
    public void DodajOcenu(int ocena) {
        if (ValidirajOcenu(ocena)) {
            this.ocene.add(ocena);
        }
    }
        private boolean validirajIndex(int index) {
            return 0 <= index && index <= ocene.size() - 1;
        }
        public void izbrisiOcenu(int index) {
            if (validirajIndex(index)) {
                this.ocene.remove(index);
            }
        }
        public void kaziStaRadis() {
            System.out.println("Ja ucim");
        }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append("\n");
        // sb.append(super.getIme()).append(" ").append(super.getPrezime())
        //        .append(" (").append(super.getBrojGodina()).append(")\n");
        sb.append(ocene.toString());

        return sb.toString();
    }
}




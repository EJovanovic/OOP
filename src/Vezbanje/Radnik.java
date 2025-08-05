package Vezbanje;

public class Radnik {
    private String ime;
    private double plata;

    public Radnik(String ime, double plata) {
        this.ime = ime;
        this.plata = plata;
    }
    public void ispisiPodatke(){
        System.out.println("Ime: " + ime+ "plata " + plata);
    }
    public double izracunajBonus() {
        if (this.plata < 70000) {
            return this.plata * 0.15;
        } else {
            return this.plata * 0.10;
        }
    }
        public void povecajPlatu(double procenat) {
            this.plata += this.plata * procenat / 100;
        }

        public boolean daLiJePlataVisoka(double prag){
      return this.plata>prag;
        }
        public String dajOpisRadnika(){
            return("Radnik " + ime + " ima platu " + plata + " i bonus " + izracunajBonus());



    }
}

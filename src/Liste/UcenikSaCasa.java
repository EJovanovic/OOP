package Liste;


import java.util.ArrayList;

/*2. Ucenik - prosiruje klasu Osoba sa ArrayList<Integer> `ocene` poljem. Prilikom unosa ocena u polje `ocene` paziti da je ocena validna! (Razmislite dobro gde sve treba ova provera da se vrsi!)
Kreirati metode:
- double prosek() - racuna prosek ucenika na standardan nacin. Paziti da je uceniku prosek 1.0 ukoliko ima barem jednu jedinicu!
- void unesiOcenu(int ocena) - unosi ocenu u listu ocena
- void izbaciOcenu(int index) - izbacuje ocenu

 */
public class UcenikSaCasa extends OsobaSaCasa {
    ArrayList<Integer>ocene;

    public boolean daLiJeOcenaUOpsegu(int ocena){
        return 1<= ocena && ocena<=5;
    }
    public void postaviOcene(ArrayList<Integer>ocene){
        this.ocene=new ArrayList<>();
        for(Integer ocena:ocene){
            if(daLiJeOcenaUOpsegu(ocena)){
                this.ocene.add(ocena);
            }
        }

    }

    public UcenikSaCasa(String ime, String prezime, int godine) {
        super(ime, prezime, godine);
    }
}

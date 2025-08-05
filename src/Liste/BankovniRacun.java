package Liste;

public class BankovniRacun {
//staticko polje
    public static String imeBanke = "OTP Banka";
    private int brojRacuna;
    private String imeVlasnika;
    private double stanjeNaRacunu;

//konstruktor
    public BankovniRacun(int brojRacuna, String imeVlasnika, double stanjeNaRacunu) {
        this.brojRacuna = brojRacuna;
        this.imeVlasnika = imeVlasnika;
        this.stanjeNaRacunu = stanjeNaRacunu;
    }

    public BankovniRacun(int brojRacuna,String imeVlasnika) {
        this.brojRacuna = brojRacuna;
        this.imeVlasnika = imeVlasnika;
        this.stanjeNaRacunu = 0.0;
    }
//geteri i seteri
    public int getBrojRacuna() {
        return brojRacuna;
    }

    public void setBrojRacuna(int brojRacuna) {
        this.brojRacuna = brojRacuna;
    }

    public String getImeVlasnika() {
        return imeVlasnika;
    }

    public void setImeVlasnika(String imeVlasnika) {
        this.imeVlasnika = imeVlasnika;
    }

    public double getStanjeNaRacunu() {
        return stanjeNaRacunu;
    }

    public void setStanjeNaRacunu(double stanjeNaRacunu) {
        this.stanjeNaRacunu = stanjeNaRacunu;
    }


    //Metode
    public void uplata(double iznos) {
        if (iznos > 0) {
            this.stanjeNaRacunu += iznos;
            System.out.println("Uplata je izvrsena. Novo stanje na racunu je: " + stanjeNaRacunu);
        } else {
            System.out.println("Greska! Iznos za uplatu mora biti veci od nule.");

        }
    }
        public void isplata ( double iznos){
            if (iznos <= 0) {
                System.out.println("Greska! Iznos za isplatu mora biti veci od nule.");
            } else if (iznos > stanjeNaRacunu) {
                System.out.println("Greska! Nedovoljno sredstava na racunu");
            } else {
                this.stanjeNaRacunu-=iznos;
                System.out.println("Isplata je izvrsena.Novo stanjena racunu je:"+ stanjeNaRacunu);
            }
        }

        @Override
    public String toString(){
            return imeBanke + " Broj racuna: " + brojRacuna + ", Ime vlasnika: " + imeVlasnika + ", Stanje na racunu: " + stanjeNaRacunu;


        }
    }



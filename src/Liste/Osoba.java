package Liste;
/*1. Osoba - standardno. Paziti na unos godina. Ukoliko prilikom konstrukcije osobe je unet negativan broj, postaviti ga na 0. U set metodi zabraniti postavljanje godina uopste ako unos nije validan.

 */
public class Osoba {

    private String ime;
    private int godine;

    public Osoba(String ime, int godine) {
        this.ime = ime;
        this.godine = 0;
        if (godine < 0)
            this.godine = godine;
        else
            this.godine = godine;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public int getGodine() {
        return godine;
    }

    public void setGodine(int godine) {
        this.godine = godine;
    }




        }



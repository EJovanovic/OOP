package Liste;
/*. Osoba - standardno. Paziti na unos godina. Ukoliko prilikom konstrukcije osobe je unet negativan broj, postaviti ga na 0.
U set metodi zabraniti postavljanje godina uopste ako unos nije validan.
 */
public class OsobaSaCasa {
    String ime;
    String prezime;
    int godine;

    public OsobaSaCasa(String ime, String prezime, int godine) {
        this.ime = ime;
        this.prezime = prezime;
        this.godine = Math.max(godine,0);

    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getGodine() {
        return godine;
    }

    public void setGodine(int godine) {
        if(godine>=0){
            this.godine=godine;
        }
        this.godine = godine;
    }
}

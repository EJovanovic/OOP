package Liste;

import java.util.ArrayList;

public class Knjizara {
    private String naziv;
    private String adresa;
    private ArrayList<Knjiga>knjige;
//konstruktor
    public Knjizara(String naziv, String adresa, ArrayList<Knjiga> knjige) {
        this.naziv = naziv;
        this.adresa = adresa;
        this.knjige = knjige;
    }
//geteri i seteri
    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public ArrayList<Knjiga> getKnjige() {
        return knjige;
    }

    public void setKnjige(ArrayList<Knjiga> knjige) {
        this.knjige = knjige;
    }
    //Metode
    public void dodajKnjigu(Knjiga k) {
        for (Knjiga trenutna : knjige) {
            if (trenutna.getNaslov().equalsIgnoreCase(k.getNaslov())
                    && trenutna.getAutor().equalsIgnoreCase(k.getAutor())) {
                System.out.println("Knjiga vec postoji.");
                return;
            }
        }
        knjige.add(k);
        System.out.println("Knjiga je dodata");
    }

        public void izbrisiKnjigu(Knjiga k){
        for(int i=0;i<knjige.size();i++) {
            Knjiga trenutna = knjige.get(i);
            if (trenutna.getNaslov().equalsIgnoreCase(k.getNaslov())
                    && trenutna.getAutor().equalsIgnoreCase(k.getAutor())) {
                knjige.remove(trenutna);
                System.out.println("Knjiga je izbrisana.");
                return;
            }
        }

        }
          public void ispisiKnjige() {
              for (Knjiga trenutna : knjige) {
                  System.out.println(trenutna.getNaslov() + " - " + trenutna.getAutor() + " (" +
                          trenutna.getGodinaIzdanja() + ") - " + trenutna.getCena() + " RSD");


              }
          }
          public Knjiga najskupljaKnjiga(){
        if (knjige.isEmpty()) return null;
        Knjiga najskuplja=knjige.get(0);
        for(Knjiga trenutna:knjige) {
            if (trenutna.getCena() > najskuplja.getCena()) {
                najskuplja = trenutna;
            }
        }
                return najskuplja;
            }
            public ArrayList<Knjiga>knjigePreGodine(int godina) {
                ArrayList<Knjiga> rezultat = new ArrayList<>();
                for (Knjiga trenutna : knjige) {
                    if (trenutna.getGodinaIzdanja() < godina) {
                        rezultat.add(trenutna);
                    }
                }
                return rezultat;
            }
                @Override
                public String toString() {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Knjizara:").append(naziv).append("\n");
                    sb.append("Adresa:").append(adresa).append("\n");
                    sb.append("Knjige:");

                    for (Knjiga trenutna : knjige) {
                        sb.append(trenutna.getNaslov());
                        sb.append(" - ");
                        sb.append(trenutna.getAutor());
                        sb.append(" (");
                        sb.append(trenutna.getGodinaIzdanja());
                        sb.append(") - ");
                        sb.append(trenutna.getCena());
                        sb.append(" rsd\n");


                    }
                    return sb.toString();
                }
    }




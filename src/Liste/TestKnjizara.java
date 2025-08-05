package Liste;

import java.util.ArrayList;

public class TestKnjizara {
    public static void main(String[] args) {
        ArrayList<Knjiga>knjige=new ArrayList<>();
        Knjiga a=new Knjiga("Stranac","Albert Kami",1978,1200.0);
        Knjiga b=new Knjiga("Atomske navike", "Dzejms Klir",2000,1500.0);
        knjige.add(a);
        knjige.add(b);
        Knjizara novaKnjizara=new Knjizara("Delfi","Milutina Milankovica",knjige);

        novaKnjizara.ispisiKnjige();
        System.out.println();
        Knjiga novaKnjiga= new Knjiga("Covek po imenu Uve", "Fredrik Backman",2004,980.0);
        novaKnjizara.dodajKnjigu(novaKnjiga);
        novaKnjizara.izbrisiKnjigu(a);
        System.out.println();
        Knjiga najskuplja=novaKnjizara.najskupljaKnjiga();
        System.out.println();

        ArrayList<Knjiga> stareKnjige=novaKnjizara.knjigePreGodine(2000);
        System.out.println("Knjige izdate pre 2000 godine:");
        for(Knjiga trenutna: stareKnjige){
            System.out.println(trenutna.getNaslov() +" ("+ trenutna.getGodinaIzdanja()+  ")");

        }
    }
}

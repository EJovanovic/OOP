package Domaci3;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        PametniSistemZaNavodnjavanje sistem = new PametniSistemZaNavodnjavanje("Navodnjavanje", "juzna zona");
        SenzorVlaznostiZemljista senzor = new SenzorVlaznostiZemljista("Senzor", 50.0);
        DetektorPokretaZaStalu detektor = new DetektorPokretaZaStalu("Detektor");
        List<UredjajNaGazdinstvu> uredjaji = new ArrayList<>();
        uredjaji.add(sistem);
        uredjaji.add(senzor);
        uredjaji.add(detektor);

        for (UredjajNaGazdinstvu uredjaj : uredjaji) {
            uredjaj.aktiviraj();

            if (uredjaj instanceof Povezivo) {
                ((Povezivo) uredjaj).poveziNaInternet();
            }

            if (uredjaj instanceof Obavestava) {
                ((Obavestava) uredjaj).posaljiObavestenje("test poruka");

            }
            if (uredjaj instanceof SenzorVlaznostiZemljista) {
                ((SenzorVlaznostiZemljista) uredjaj).ocitaj();
            }

            uredjaj.opis();
        }

    }
}






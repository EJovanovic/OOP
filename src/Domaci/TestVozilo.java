package Domaci;

import java.util.ArrayList;

public class TestVozilo {
    public static void main(String[] args) {
        Vozilo a1 = new Vozilo("Audi", 2000, 15.5);
        System.out.println(a1);

        Minibus b1 = new Minibus("Ford", 2005, 20.0, 25);
        System.out.println(b1);

        Autobus c1=new Autobus("Canos",1998,70.0,true);
        System.out.println(c1);
        Autobus c2=new Autobus("Punto",1998, 120.0,false);
        System.out.println(c2);

        ArrayList<Vozilo>svaVozila= new ArrayList<>();
        svaVozila.add(a1);
        svaVozila.add(b1);
        svaVozila.add(c1);
        svaVozila.add(c2);

        AutobuskaStanica Lasta= new AutobuskaStanica(svaVozila);
        Lasta.ispisiVozila();
        Autobus c3=new Autobus("Honda",2004,12.0,false);
        Lasta.dodajVozilo(c3);
        Lasta.ispisiVozila();

        int brojMedjugradskih= Lasta.brojMedjugradskihAutobusa();
        System.out.println("Broj medjugradskih je  " + brojMedjugradskih);

        double potrosnja=Lasta.prosecnaPotrosnja();
        System.out.println("Potrosnja svih vozila je  " + potrosnja);


    }
}


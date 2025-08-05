package Domaci1;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Vozilo> svihVozila= new ArrayList<>();
        svihVozila.add(new Vozilo("Punto", 2005));
        svihVozila.add(new Automobil("Mazda",2001,4));
        svihVozila.add(new SportskiAutomobil("Ferrari",2005,2,350));
        svihVozila.add(new Kamion("Volvo",1997,1500));
        svihVozila.add(new Motor("Suzuki", 2006,500));

        for(Vozilo x: svihVozila){
            x.opisiMe();
        }
    }
}

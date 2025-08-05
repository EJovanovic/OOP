package Zaposlenivezbanje;

import java.util.ArrayList;
import java.util.List;

public class TestZaposlenih {
    public static void main(String[] args) {
        List<Zaposleni>zaposleni=new ArrayList<>();
        zaposleni.add( new Programer("Marko",5000,"Python"));
        zaposleni.add(new Menadzer("Ivan", 8500., 5));
        for(Zaposleni x:zaposleni){
            x.opisiSe();
            System.out.println(x);

        }




    }
}

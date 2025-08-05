package Domaci2;


import java.util.ArrayList;
import java.util.List;

public class Skola {

    public static void main(String[] args) {
        List<Osoba> osobe = new ArrayList<>();//pravim novu listu
        Ucenik marko = new Ucenik("Marko", 14, 3);
        Ucenik srki = new Ucenik("Srdjan", 16, 5);
        Ucenik mira = new Ucenik("Mira", 17, 7);
        Ucenik viki = new Ucenik("Violeta", 14, 4);
        //dodajem ucenike
        osobe.add(marko);
        osobe.add(srki);
        osobe.add(mira);
        osobe.add(viki);

        Profesor kosa = new Profesor("Kosana", 44, "Matematika");
        Profesor gaga = new Profesor("Dragana", 55, "Muzicko");
        Profesor goran = new Profesor("Goran", 36, "Hemija");
        Profesor daca = new Profesor("Daca", 45, "Fizika");
        //dodajem profesore
        osobe.add(kosa);
        osobe.add(gaga);
        osobe.add(goran);
        osobe.add(daca);


        Direktor direktor = new Direktor("Nikola", 51);
        osobe.add(direktor);//dodajem direktora

        //profesori ocenjuju ucenike
        gaga.oceniUcenika(marko, 4);
        kosa.oceniUcenika(marko, 1);
        kosa.oceniUcenika(viki, 5);
        goran.oceniUcenika(mira, 5);
        goran.oceniUcenika(srki, 4);
        daca.oceniUcenika(srki, 2);
        daca.oceniUcenika(mira, 1);
        gaga.oceniUcenika(viki, 3);

        //direktor pregleda profesore
        direktor.pregledajProfesora(goran);
        direktor.pregledajProfesora(kosa);
        direktor.pregledajProfesora(gaga);

        //prolazim kroz listu i pozivam metode

        for (Osoba osoba : osobe) {
            osoba.predstaviSe();
            osoba.opisiSebe();
        }
    }
}











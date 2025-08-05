package Vezbanje;

public class TestRadnik {
    public static void main(String[] args) {
        Radnik a=new Radnik("Milan",33000);
        Radnik b=new Radnik("Ana", 100000);
        System.out.println("Podaci o radnicima: ");
        a.ispisiPodatke();
        b.ispisiPodatke();
        System.out.println("Bonus za Anu: " + b.izracunajBonus());
        System.out.println("Bonus za Milana" + a.izracunajBonus());
        a.povecajPlatu(10);
        b.povecajPlatu(20);
        System.out.println(a.daLiJePlataVisoka(75000));
        System.out.println("Opis radnika " + a.dajOpisRadnika());
        }
    }

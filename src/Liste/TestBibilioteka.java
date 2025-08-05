package Liste;

public class TestBibilioteka {
    public static void main(String[] args) {
        ClanBiblioteke a = new ClanBiblioteke("Pera", "Mikic", 33);
        a.dodajKnjigu("Lepa Lukic");
        a.dodajKnjigu("Ceca");
        a.dodajKnjigu("Nela");
        System.out.println(a.getPozajmljeneKnjige());
        a.izbrisiKnjigu(0);
        System.out.println(a.getPozajmljeneKnjige());
        a.brojKnjige();
        System.out.println(a.brojKnjige());
        a.kaziStaRadis();
        System.out.println(a);

    }
}

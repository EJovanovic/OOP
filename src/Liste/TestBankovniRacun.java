package Liste;

public class TestBankovniRacun {
    public static void main(String[]args){
        BankovniRacun racun1=new BankovniRacun(320113684,"Milica Markovic",32000.0);
        System.out.println(racun1);
        BankovniRacun racun2=new BankovniRacun(340808080,"Darko Glisic",50000.0);
        System.out.println(racun2);
        racun1.uplata(1000);
        System.out.println(racun1.getStanjeNaRacunu());
        racun1.isplata(100);
        System.out.println(racun1.getStanjeNaRacunu());

        racun2.uplata(1200);
        System.out.println(racun2.getStanjeNaRacunu());
        racun2.isplata(0);
        System.out.println(racun2.getStanjeNaRacunu());

        racun1.uplata(-50);
        System.out.println(racun1.getStanjeNaRacunu());

    }

}

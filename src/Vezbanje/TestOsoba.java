package Vezbanje;

public class TestOsoba {
    public static void main(String[] args) {
        Ucenici a=new Ucenici("Marko",15,3);
        Profesor b=new Profesor("Marko",44,"Matematika");
        a.predstaviSe();
        System.out.println(a);
        b.predstaviSe();
        System.out.println(b);

    }
}

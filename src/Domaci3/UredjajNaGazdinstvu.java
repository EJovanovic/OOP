package Domaci3;

public abstract class UredjajNaGazdinstvu {
    private String oznaka;
    private boolean aktivan;

    public UredjajNaGazdinstvu(String oznaka) {
        this.oznaka = oznaka;
        this.aktivan = false;
    }

    public String getOznaka() {
        return oznaka;
    }

    public void setOznaka(String oznaka) {
        this.oznaka = oznaka;
    }

    public void aktiviraj(){
        this.aktivan=true;
    }
    public void deaktiviraj(){
        this.aktivan=false;
    }
    public boolean jeAktivan(){
        return aktivan;
    }
    public abstract void opis();
}

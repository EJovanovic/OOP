package Domaci;

public class Autobus extends Vozilo {
    private boolean medjugradski;

    public Autobus(String marka, int godiste, double potrosnja, boolean medjugradski) {
        super(marka, godiste, potrosnja);
        this.medjugradski = medjugradski;
    }
    public Autobus(Autobus drugi){
        super(drugi);
        this.medjugradski=drugi.medjugradski;

    }

    public boolean isMedjugradski() {
        return medjugradski;
    }

    public void setMedjugradski(boolean medjugradski) {
        this.medjugradski = medjugradski;
    }


    @Override
    public String toString() {
        String tip;
        if (isMedjugradski()) {
            tip = "medjugradski";
        } else {
            tip = "gradski";
        }
            return super.toString() + " ,Tip: " + tip;
        }
    }




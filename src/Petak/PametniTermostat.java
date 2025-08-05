package Petak;

public abstract class PametniTermostat implements Ukljucivo,Obavestava {
public void proveriTemperaturu(double temperatura){
    if(temperatura<20){
        posaljiNotifikaciju("Temperatura je ispod vrednosti");

    }
}
}

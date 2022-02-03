package com.company;

public class Uplata extends Transakcija{
    private String vrstaUsluge;

    public Uplata(double iznos, int brojRacuna){
        super(iznos, brojRacuna);
        this.vrstaUsluge = "Uplata na racun";
    }

    public String toString(){
        return ("\nIznos : " + this.iznos +  " | Datum : " + this.datumTransakcije + " | Vrsta usluge : " + this.vrstaUsluge);

    }
}

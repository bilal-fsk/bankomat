package com.company;

public class Isplata extends Transakcija {

    private String vrstaUsluge;

    public Isplata(double iznos, int brojRacuna){
        super(iznos, brojRacuna);
        this.vrstaUsluge = "Isplata sa racuna";
    }

    public String toString(){
        return ("\nIznos : " + this.iznos +  " | Datum : " + this.datumTransakcije + " | Vrsta usluge : " + this.vrstaUsluge);

    }
}

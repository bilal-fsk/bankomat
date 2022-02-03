package com.company;

public class Transfer extends Transakcija{
    private int brojRacunaPrimaoca;
    private String vrstaUsluge;


    public Transfer(double iznos, int brojRacunaPosiljaoca, int brojRacunaPrimaoca){
        super(iznos, brojRacunaPosiljaoca);
        this.brojRacunaPrimaoca = brojRacunaPrimaoca;
        this.vrstaUsluge = "Transfer sa racuna na racun";
    }

    public String toString(){
        return ("\nIznos : " + this.iznos + " | Broj racuna posiljaoca : " + this.brojRacunaKorisnika + " | Broj racuna primaoca : " + this.brojRacunaPrimaoca + " | Datum : " + this.datumTransakcije + " | Vrsta usluge : " + this.vrstaUsluge);

    }

}

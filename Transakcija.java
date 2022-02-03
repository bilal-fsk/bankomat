package com.company;
import java.util.Date;

public class Transakcija {
    protected double iznos;
    protected int brojRacunaKorisnika;
    protected Date datumTransakcije;

    public Transakcija(double iznos, int brojRacunaKorisnika){
        this.iznos = iznos;
        this.brojRacunaKorisnika = brojRacunaKorisnika;
        datumTransakcije = new Date();
    }


}

package com.company.lab01.zadanie6;

public class Pracownik {
    public Dojezdzac dojezdzac;
    public Pracowac pracowac;
    public SpedzanieWolnegoCzasu spedzanieWolnegoCzasu;
    public String zawod;

    public Pracownik(String zawod, Dojezdzac dojezdzac, Pracowac pracowac, SpedzanieWolnegoCzasu spedzanieWolnegoCzasu){
        this.zawod = zawod;
        this.dojezdzac = dojezdzac;
        this.pracowac = pracowac;
        this.spedzanieWolnegoCzasu = spedzanieWolnegoCzasu;
    }

    public void printZawod(){
        System.out.println(this.zawod);
    }

}

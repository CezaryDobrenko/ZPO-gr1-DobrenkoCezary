package com.company.lab01.zadanie5;

public class Shop {
    Tax tax;

    public Shop(Tax tax){
        this.tax = tax;
    }

    public void changeTaxSystem(Tax tax){
        this.tax = tax;
    }

}

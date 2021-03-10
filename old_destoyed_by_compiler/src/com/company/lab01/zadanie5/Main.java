package com.company.lab01.zadanie5;

public class Main {

    public static void main(String[] args) {
        PolishTax pt = new PolishTax();
        GermanTax gt = new GermanTax();
        GreatBritainTax gbt = new GreatBritainTax();

        Shop shop = new Shop(pt);
        System.out.println(shop.tax.calculateTax(100));

        shop.changeTaxSystem(gt);
        System.out.println(shop.tax.calculateTax(100));

        shop.changeTaxSystem(gbt);
        System.out.println(shop.tax.calculateTax(100));
    }

}

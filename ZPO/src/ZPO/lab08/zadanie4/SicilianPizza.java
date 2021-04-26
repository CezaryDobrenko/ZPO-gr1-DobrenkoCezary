package ZPO.lab08.zadanie4;

public class SicilianPizza extends Pizza {

    @Override
    void getPizzaDough() {
        System.out.println("Get thick pizza dough ");
    }

    @Override
    void addPizzaToppings() {
        System.out.println("Add olives and capers");
    }

    @Override
    void addSpices() {
        System.out.println("Add sicilian pizza spices");
    }

    @Override
    void setBakingTime() { System.out.println("Baking time set to 20 min"); }

    @Override
    void bakePizza() {
        System.out.println("Baking Sicilian pizza");
    }

}
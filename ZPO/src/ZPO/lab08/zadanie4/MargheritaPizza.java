package ZPO.lab08.zadanie4;

public class MargheritaPizza extends Pizza {

    @Override
    void getPizzaDough() {
        System.out.println("Get thin pizza dough");
    }

    @Override
    void addPizzaToppings() {
        System.out.println("Add 2x mozzarella cheese");
    }

    @Override
    void addSpices() {
        System.out.println("Add basil and olive oil");
    }

    @Override
    void bakePizza() {
        System.out.println("Baking Margherita pizza");
    }

}
package ZPO.lab08.zadanie4;

public abstract class Pizza {
    abstract void getPizzaDough();
    abstract void addPizzaToppings();
    abstract void addSpices();
    abstract void bakePizza();

    //template method
    public final void prepare(){
        getPizzaDough();
        addTomatoSauce();
        addPizzaToppings();
        addSpices();
        setBakingTime();
        bakePizza();
    }

    void addTomatoSauce() {
        System.out.println("Add Tomato Sauce");
    }
    void setBakingTime() { System.out.println("Baking time set to 15 min"); }
}

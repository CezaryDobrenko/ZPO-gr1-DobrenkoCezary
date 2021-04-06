package ZPO.lab05.zadanie3;

public abstract class PizzaDecorator implements Pizza {
    protected Pizza ingredient;

    public PizzaDecorator(Pizza newPizza){
        this.ingredient = newPizza;
    }

    public void removeDecorator(PizzaDecorator toRemove) {
        if (ingredient == null) {
            return;
        } else if (ingredient.equals(toRemove)) {
            ingredient = ingredient.getSubject();
        } else {
            ingredient.removeDecorator(toRemove);
        }
    }

    public String getDescription(){
        return ingredient.getDescription();
    }

    public double getCost(){
        return ingredient.getCost();
    }

    public Pizza getSubject() {
        return ingredient;
    }

}

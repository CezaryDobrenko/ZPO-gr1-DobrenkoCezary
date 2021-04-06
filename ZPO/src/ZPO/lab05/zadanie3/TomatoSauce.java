package ZPO.lab05.zadanie3;

public class TomatoSauce extends PizzaDecorator {

    public TomatoSauce(Pizza newPizza) {
        super(newPizza);
        System.out.println("Adding TomatoSauce");
    }

    public String getDescription(){
        return ingredient.getDescription() + ", tomato sauce";
    }

    public double getCost(){
        return ingredient.getCost() + 0.35;
    }

}

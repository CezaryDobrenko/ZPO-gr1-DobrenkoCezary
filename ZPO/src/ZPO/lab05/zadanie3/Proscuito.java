package ZPO.lab05.zadanie3;

public class Proscuito extends PizzaDecorator {

    public Proscuito(Pizza newPizza) {
        super(newPizza);
        System.out.println("Adding Proscuito");
    }

    public String getDescription(){
        return ingredient.getDescription() + ", ham and chesse";
    }

    public double getCost(){
        return ingredient.getCost() + 0.50;
    }

}

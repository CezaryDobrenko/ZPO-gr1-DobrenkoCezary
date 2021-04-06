package ZPO.lab05.zadanie3;

public class PlainPizza extends PizzaDecorator{

    public PlainPizza() {
        super(null);
        System.out.println("Add plain pizza");
    }

    @Override
    public String getDescription() {
        return "pizza";
    }

    @Override
    public double getCost() {
        return 4.00;
    }

}

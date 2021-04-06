package ZPO.lab05.zadanie3;

public class Main {
    public static void main(String[] args) {

        PizzaDecorator plainPizza = new PlainPizza();
        PizzaDecorator PizzaTomatoSauce = new TomatoSauce(plainPizza);
        PizzaDecorator Proscuito = new Proscuito(PizzaTomatoSauce);

        System.out.println("Ingridients: " + Proscuito.getDescription());
        System.out.println("Price: " + Proscuito.getCost());

        Proscuito.removeDecorator(PizzaTomatoSauce);

        System.out.println("Ingridients: " + Proscuito.getDescription());
        System.out.println("Price: " + Proscuito.getCost());

    }
}

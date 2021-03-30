package ZPO.lab04.zadanie2;

import ZPO.lab04.zadanie1.Command;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private double balance = 0.0;
    private double intrestValue = 0.0;
    private List<Operation> operations = new ArrayList<Operation>();
    private Intrest intrest;

    public Account(double balance, Intrest intrest){
        this.balance = balance;
        this.intrest = intrest;
    }

    public void addToBalance(Double value){
        this.balance += value;
    }

    public void subtractFromBalance(Double value){
        this.balance += value;
    }

    public void changeIntrest(Intrest intrest){
        this.intrest = intrest;
    }

    public void doOperation(Operation o){
        o.execute();
    }

    public void addToOperations(Operation o) {
        operations.add(o);
    }

    public void doOperations(){
        for (Operation operation : operations) {
            operation.execute();
        }
        operations.clear();
    }

    public void doCalculation(){
        this.intrest.calculate();
    }

}

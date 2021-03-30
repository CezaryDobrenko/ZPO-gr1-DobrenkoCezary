package ZPO.lab04.zadanie2;

public class Transfer implements Operation{
    Account from;
    Account to;
    Double amount;

    public Transfer(Account from, Account to, Double amount){
        this.from = from;
        this.to = to;
        this.amount = amount;
    }

    public void execute(){
        from.subtractFromBalance(amount);
        to.addToBalance(amount);
    }
}

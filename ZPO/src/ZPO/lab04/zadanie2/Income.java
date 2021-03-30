package ZPO.lab04.zadanie2;

public class Income implements Operation{
    Account account;
    Double amount;

    public Income(Account account, Double amount){
        this.account = account;
        this.amount = amount;
    }

    public void execute(){
        account.addToBalance(amount);
    }
}
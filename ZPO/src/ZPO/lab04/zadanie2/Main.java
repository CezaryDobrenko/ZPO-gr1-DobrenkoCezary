package ZPO.lab04.zadanie2;


public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Intrest intrestA = new IntrestA();
        Intrest intrestB = new IntrestB();
        Intrest intrestC = new IntrestC();

        Account acc1 = new Account(500, intrestA);
        Account acc2 = new Account(1500, intrestA);
        Account acc3 = new Account(3500, intrestB);

        //Add clients to bank

        bank.addClient(acc1);
        bank.addClient(acc2);
        bank.addClient(acc3);

        //Remove client from bank

        bank.removeClient(acc3);

        //Operation executed after call

        acc1.doOperation(new Income(acc1, 500.0));
        acc1.doOperation(new Transfer(acc1, acc2, 500.0));
        acc1.doOperation(new IntrestChange(acc1, intrestC));
        acc2.doOperation(new IntrestChange(acc2, intrestB));

        //Add multiple operations to queue and execute them on method call

        acc1.addToOperations(new Income(acc1, 500.0));
        acc1.addToOperations(new Income(acc1, 500.0));
        acc1.addToOperations(new Transfer(acc1, acc2, 500.0));

        acc1.doOperations();

        //Calculating intrest of Account1

        acc1.doCalculation();

        //Bank global actions on all accounts

        bank.income(300);
        bank.changeIntrest(intrestA);
        bank.transfer(acc1, 100);

    }
}

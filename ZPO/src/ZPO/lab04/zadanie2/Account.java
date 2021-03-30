package ZPO.lab04.zadanie2;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private List<Operation> operations = new ArrayList<Operation>();

    public void addOperation(Operation o){
        operations.add(o);
    }

}

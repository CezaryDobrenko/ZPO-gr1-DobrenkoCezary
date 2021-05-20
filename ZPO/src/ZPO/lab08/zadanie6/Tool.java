package ZPO.lab08.zadanie6;

public class Tool implements IToolbar {
    private String name;

    public Tool(String name){
        this.name = name;
    }

    public void printSubmenusAndTools() {
        System.out.println(this.name);
    }

}

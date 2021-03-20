package ZPO.lab03.zadanie3;

public class EvenNumber implements Observer{
    int value;

    @Override
    public void update(int value){
        if(value % 2 == 0){
            this.value = value;
            printResult();
        }
    }

    public void printResult(){
        System.out.println("Obserwator obserwuje liczby parzyste");
        System.out.println("EvenNumber wykrył " + this.value);
    }
}

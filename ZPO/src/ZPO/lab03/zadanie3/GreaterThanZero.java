package ZPO.lab03.zadanie3;

public class GreaterThanZero implements Observer {
    int value;

    @Override
    public void update(int value){
        if(value > 0){
            this.value = value;
            printResult();
        }
    }

    public void printResult(){
        System.out.println("Obserwator obserwuje liczby większe od zero");
        System.out.println("GreaterThanZero wykrył " + this.value);
    }
}

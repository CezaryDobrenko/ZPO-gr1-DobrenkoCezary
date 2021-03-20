package ZPO.lab03.zadanie3;

public class EqualsThreeNumber implements Observer{
    int value;

    @Override
    public void update(int value){
        if(value == 3){
            this.value = value;
            printResult();
        }
    }

    public void printResult(){
        System.out.println("Obserwator obserwuje liczby 3");
        System.out.println("EqualsThree wykrył " + this.value);
    }
}

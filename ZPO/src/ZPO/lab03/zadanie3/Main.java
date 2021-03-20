package ZPO.lab03.zadanie3;


import java.util.Scanner;

public class Main {

    public static void printStartMessage(){
        System.out.println("Aby rozpocząć wpisz 0: ");
    }

    public static void printNextMessage(){
        System.out.println("Gratulację wybrałeś 0: ");
        System.out.println("Wybierz jakie liczby ma obserwować program: ");
        System.out.println("1. Większe od 0.");
        System.out.println("2. Równe 3");
        System.out.println("3. Podzielne przez 2");
        System.out.println("Wprowadź wybraną liczbę: ");
    }

    public static void printLastMessage(int value){
        System.out.println("Wybrałeś " + value);
        System.out.println("Wybrany obserwator jest w gotowości: ");
    }

    public static int getValueZero(){
        Scanner sc= new Scanner(System.in);
        int value = sc.nextInt();
        while(value != 0){
            value = sc.nextInt();
        }
        return value;
    }

    public static int getValueBetween1And3(int value){
        Scanner sc= new Scanner(System.in);
        while(value <= 0 || value >= 4){
            value = sc.nextInt();
        }
        return value;
    }

    public static void main(String[] args) {

        Program program = new Program();
        Scanner sc= new Scanner(System.in);
        printStartMessage();
        int value = getValueZero();
        printNextMessage();
        value = getValueBetween1And3(value);
        program.selectObserver(value);
        printLastMessage(value);
        while(true){
            value = sc.nextInt();
            program.addValue(value);
        }
    }
}

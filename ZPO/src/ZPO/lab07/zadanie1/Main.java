package ZPO.lab07.zadanie1;

public class Main {
    public static void main(String[] args) {
        FileFacade file = new FileFacade(5);
        file.PrintArray();
        file.getValuesFromKeyboard();
        file.PrintArray();
        file.getValuesFromFile();
        file.PrintArray();
        file.sortArray();
        file.PrintArray();
    }
}
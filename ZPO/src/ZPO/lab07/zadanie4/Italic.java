package ZPO.lab07.zadanie4;

public class Italic implements FontStyle{
    @Override
    public void useFontStyle(String text) {
        System.out.println("Add Italic effect on " + text);
    }
}

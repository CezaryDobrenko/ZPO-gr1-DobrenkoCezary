package ZPO.lab07.zadanie4;

public class Bold implements FontStyle{
    @Override
    public void useFontStyle(String text) {
        System.out.println("Add Bold effect on " + text);
    }
}

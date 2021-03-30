package ZPO.lab04.zadanie3;

import java.util.Random;
import java.awt.*;

public class SetColorCommand implements Command {
    private Editor editor;

    public SetColorCommand(Editor e) {
        this.editor = e;
    }

    public void execute() {
        Random rand = new Random();

        int r = rand.nextInt(255);
        int g = rand.nextInt(255);
        int b = rand.nextInt(255);
        Color color = new Color(r,g,b);

        editor.saveColorState(editor.getRectColor());
        editor.setRectColor(color);
    }
}
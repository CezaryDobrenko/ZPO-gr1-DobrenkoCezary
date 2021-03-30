package ZPO.lab04.zadanie3;

import java.util.Random;

public class SetWidthCommand implements Command {
    private Editor editor;

    public SetWidthCommand(Editor e) {
        this.editor = e;
    }

    public void execute() {
        Random rand = new Random();

        editor.saveWidthState(editor.getRectWidth());
        editor.setRectWidth(rand.nextInt(600));
    }
}
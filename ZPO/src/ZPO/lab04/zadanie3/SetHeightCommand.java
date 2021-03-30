package ZPO.lab04.zadanie3;

import java.util.Random;

public class SetHeightCommand implements Command {
    private Editor editor;

    public SetHeightCommand(Editor e) {
        this.editor = e;
    }

    public void execute() {
        Random rand = new Random();

        editor.saveHeightState(editor.getRectHeight());
        editor.setRectHeight(rand.nextInt(400));
    }
}
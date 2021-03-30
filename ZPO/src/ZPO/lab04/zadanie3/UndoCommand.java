package ZPO.lab04.zadanie3;

public class UndoCommand implements Command {
    private Editor editor;

    public UndoCommand(Editor e) {
        this.editor = e;
    }

    public void execute() {
        editor.undoLastChange();
    }
}
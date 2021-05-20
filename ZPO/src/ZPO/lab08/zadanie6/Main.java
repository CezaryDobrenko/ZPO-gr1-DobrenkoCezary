package ZPO.lab08.zadanie6;

public class Main {
    public static void main(String[] args) {
        //Create editor
        Menu EditorProgram = new Menu("VIM (how to exit it???)");

        //Create toolbars
        Menu MovingToolbar = new Menu("Moving toolbar");
        Menu EditingToolbar = new Menu("Editing toolbar");
        Menu OptionToolbar = new Menu("Option toolbar");

        //Assign toolbars to editor
        EditorProgram.addSubmenusAndTools(MovingToolbar);
        EditorProgram.addSubmenusAndTools(EditingToolbar);
        EditorProgram.addSubmenusAndTools(OptionToolbar);

        //Create moving tools
        Tool MoveTool = new Tool("Move tool");
        Tool SelectTool = new Tool("Select tool");

        //Assign moving tools to MovingToolbar
        MovingToolbar.addSubmenusAndTools(MoveTool);
        MovingToolbar.addSubmenusAndTools(SelectTool);

        //Create editing tools
        Tool CopyTool = new Tool("Copy tool");
        Tool CutTool = new Tool("Cut tool");

        //Assign editing tools to EditingToolbar
        EditingToolbar.addSubmenusAndTools(CopyTool);
        EditingToolbar.addSubmenusAndTools(CutTool);

        //Create option tools
        Tool SaveTool = new Tool("Save tool");
        Tool OpenTool = new Tool("Open tool");

        //Assign option tools to OptionToolbar
        OptionToolbar.addSubmenusAndTools(SaveTool);
        OptionToolbar.addSubmenusAndTools(OpenTool);

        //Print all tools
        EditorProgram.printSubmenusAndTools();
    }
}
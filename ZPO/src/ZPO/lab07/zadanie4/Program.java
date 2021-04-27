package ZPO.lab07.zadanie4;

import java.util.Arrays;

public class Program {
    String text;
    String[] operations;
    FontStyleFacade fontStyle;

    public Program(String[] args){
        if(args.length > 0){
            this.text = args[0];
            this.operations = subArray(args, 1, args.length);
            this.fontStyle = new FontStyleFacade();
        }
    }

    public static<T> T[] subArray(T[] array, int beg, int end) {
        return Arrays.copyOfRange(array, beg, end);
    }

    public void exec(){
        System.out.println("Text from args: "+text);
        System.out.println("Performing operations:");
        for (int i = 0; i < operations.length; i++) {
            if(operations[i].equals("bold")){
                fontStyle.useBold(text);
            } else if (operations[i].equals("italic")){
                fontStyle.useItalic(text);
            } else {
                System.out.println("invalid argument");
            }
        }
    }

}

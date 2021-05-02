package ZPO.lab07.zadanie1;

import java.util.Arrays;

public class FileFacade {
    private final IFile sort;
    private final IFile getFromKeyboard;
    private final IFile getFromFile;

    private int[] outputArray;

    public FileFacade(int n) {
        this.sort = new Sort();
        this.getFromKeyboard = new Keyboard();
        this.getFromFile = new File();
        this.outputArray = new int[n];
    }

    public void sortArray(){
        this.outputArray = sort.executeOperation(outputArray);
    }

    public void getValuesFromKeyboard(){
        this.outputArray = getFromKeyboard.executeOperation(outputArray);
    }

    public void getValuesFromFile(){
        this.outputArray = getFromFile.executeOperation(outputArray);
    }

    public void PrintArray(){
        System.out.println(Arrays.toString(this.outputArray));
    }

}

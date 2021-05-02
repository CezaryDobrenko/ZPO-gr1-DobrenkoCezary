package ZPO.lab07.zadanie1;

import java.util.Arrays;

public class Sort implements IFile{

    @Override
    public int[] executeOperation(int[] array) {
        System.out.println("---START SORTING VALUES---");
        Arrays.sort(array);
        System.out.println("---VALUES HAS BEEN SORTED---");
        return array;
    }

}

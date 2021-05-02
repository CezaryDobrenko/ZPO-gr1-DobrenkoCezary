package ZPO.lab07.zadanie1;

import java.util.Scanner;

public class Keyboard implements IFile{

    @Override
    public int[] executeOperation(int[] array) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("----------ENTER VALUES----------");
        for(int i = 0; i < array.length; i++){
            System.out.print("Add value:");
            int myint = keyboard.nextInt();
            array[i] = myint;
        }
        System.out.println("---VALUES HAS BEEN ADDED FROM KEYBOARD---");
        return array;
    }

}

package ZPO.lab07.zadanie1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class File implements IFile{

    @Override
    public int[] executeOperation(int[] array) {
        try {
            String path = File.class.getResource("data.txt").toString().substring(6);
            BufferedReader br = new BufferedReader(new FileReader(path));
            String line;
            int i = 0;
            System.out.println("----------GET VALUES FROM FILE----------");
            while ((line = br.readLine()) != null) {
                if(array.length != i){
                    System.out.println(line);
                    array[i] = Integer.parseInt(line);
                    i++;
                }
            }
            System.out.println("---VALUES HAS BEEN ADDED FROM FILE---");
        } catch (IOException e) {
            System.out.println("An error occured during operation execution.");
            e.printStackTrace();
        }
        return array;
    }

}

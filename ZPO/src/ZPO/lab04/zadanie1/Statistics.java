package ZPO.lab04.zadanie1;


import java.util.ArrayList;

public class Statistics {
    ArrayList<Double> stats = new ArrayList<Double>();

    public void addToStats(double value){
        this.stats.add(value);
    }

    public void printStats(){
        for (Double statRow : stats)
        {
            System.out.println(statRow);
        }
    }

}

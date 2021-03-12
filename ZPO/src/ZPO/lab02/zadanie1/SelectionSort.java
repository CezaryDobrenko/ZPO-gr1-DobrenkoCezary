package ZPO.lab02.zadanie1;

import java.util.ArrayList;

public class SelectionSort implements SortingBehavior {

    public ArrayList<Duck> Sort (ArrayList<Duck> arrayList) {
        for ( int j=0; j < arrayList.size()-1; j++ )
        {
            int min = j;
            for ( int k=j+1; k < arrayList.size(); k++ )
                if ( arrayList.get(k).getName().compareTo( arrayList.get(min).getName() ) < 0 ) min = k;

            Duck temp = arrayList.get(j);
            arrayList.set(j, arrayList.get(min));
            arrayList.set(min, temp);
        }
        return arrayList;
    }

    public Duck[] Sort (Duck[] array) {
        for ( int j=0; j < array.length-1; j++ )
        {
            int min = j;
            for ( int k=j+1; k < array.length; k++ )
                if ( array[k].getName().compareTo( array[min].getName() ) < 0 ) min = k;

            Duck temp = array[j];
            array[j] = array[min];
            array[min] = temp;
        }
        return array;
    }
}

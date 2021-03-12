package ZPO.lab02.zadanie1;

import java.util.ArrayList;

public class BubbleSort implements SortingBehavior {
    public ArrayList<Duck> Sort (ArrayList<Duck> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = i; j < arrayList.size() - 1; j++) {
                if (arrayList.get(i).getName().compareTo(arrayList.get(j + 1).getName()) > 0) {
                    Duck temp = arrayList.get(j + 1);
                    arrayList.set(j + 1, arrayList.get(i));
                    arrayList.set(i, temp);
                }
            }
        }
        return arrayList;
    }

    public Duck[] Sort (Duck[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length - 1; j++) {
                if (array[i].getName().compareTo(array[j + 1].getName()) > 0) {
                    Duck temp = array[j + 1];
                    array[j+1] = array[i];
                    array[i] = temp;
                }
            }
        }
        return array;
    }
}

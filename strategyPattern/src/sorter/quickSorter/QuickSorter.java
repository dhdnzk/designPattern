package sorter.quickSorter;

import sorter.Sorter;

import java.util.ArrayList;

/**
 * Created by Loui on 2017. 6. 8..
 */
public class QuickSorter implements Sorter {


    @Override
    public ArrayList<String> sorting(ArrayList<String> arrayList) {

        return upperQuickSort(arrayList, 0, arrayList.size() - 1);

    }

    @Override
    public ArrayList<String> reverseSorting(ArrayList<String> arrayList) {

        return lowerQuickSort(arrayList, 0, arrayList.size() - 1);

    }

    private ArrayList<String> upperQuickSort(ArrayList<String> arr, int low,
                                             int high) {

        if (arr == null || arr.size() == 0)

            return arr;

        if (low >= high)

            return arr;

        // pick the pivot
        int middle = low + (high - low) / 2;
        String pivot = arr.get(middle);

        // make left < pivot and right > pivot
        int i = low, j = high;
        while (i <= j) {
            while (arr.get(i).compareTo(pivot) < 0) {
                i++;
            }

            while (arr.get(j).compareTo(pivot) > 0) {
                j--;
            }

            if (i <= j) {
                String temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
                i++;
                j--;
            }
        }

        // recursively sort two sub parts
        if (low < j)
            upperQuickSort(arr, low, j);

        if (high > i)
            upperQuickSort(arr, i, high);

        return arr;
    }

    private ArrayList<String> lowerQuickSort(ArrayList<String> arr, int low,
                                             int high) {

        if (arr == null || arr.size() == 0)

            return arr;

        if (low >= high)

            return arr;

        // pick the pivot
        int middle = low + (high - low) / 2;
        String pivot = arr.get(middle);

        // make left < pivot and right > pivot
        int i = low, j = high;
        while (i <= j) {
            while (arr.get(i).compareTo(pivot) > 0) {
                i++;
            }

            while (arr.get(j).compareTo(pivot) < 0) {
                j--;
            }

            if (i <= j) {
                String temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
                i++;
                j--;
            }
        }

        // recursively sort two sub parts
        if (low < j)
            lowerQuickSort(arr, low, j);

        if (high > i)
            lowerQuickSort(arr, i, high);

        return arr;
    }

}

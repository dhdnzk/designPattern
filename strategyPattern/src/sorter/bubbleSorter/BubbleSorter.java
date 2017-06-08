package sorter.bubbleSorter;

import sorter.Sorter;

import java.util.ArrayList;

/**
 * Created by Loui on 2017. 6. 8..
 */
public class BubbleSorter implements Sorter {

    @Override
    public ArrayList<String> sorting(ArrayList<String> arrayList) {

        for (int i = 0; i < arrayList.size() - 1; i++) {

            for (int j = 0; j < arrayList.size() - 1 - i; j++) {

                if (arrayList.get(j).compareTo(arrayList.get(j + 1)) > 0) {

                    String temp = arrayList.get(j);

                    arrayList.set(j, arrayList.get(j + 1));

                    arrayList.set(j + 1, temp);

                }

            }

        }

        return arrayList;

    }

    @Override
    public ArrayList<String> reverseSorting(ArrayList<String> arrayList) {

        for (int i = 0; i < arrayList.size() - 1; i++) {

            for (int j = 0; j < arrayList.size() - 1 - i; j++) {

                if (arrayList.get(j).compareTo(arrayList.get(j + 1)) < 0) {

                    String temp = arrayList.get(j);

                    arrayList.set(j, arrayList.get(j + 1));

                    arrayList.set(j + 1, temp);

                }

            }

        }

        return arrayList;

    }

}

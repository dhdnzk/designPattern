import sorter.Sorter;
import sorter.bubbleSorter.BubbleSorterFactory;
import sorter.quickSorter.QuickSorterFactory;

import java.util.ArrayList;

/**
 * Created by Loui on 2017. 6. 8..
 */
public class Main {
    public static void main(String[] args) {

        ArrayList<String> str = new ArrayList<>();

        str.add("a");

        str.add("z");

        str.add("k");

        str.add("v");

        // If you want to change algorithm(=strategy), just change here.
//        Sorter sorter = BubbleSorterFactory.create();
        Sorter sorter = QuickSorterFactory.create();

        System.out.print("original:\n");

        for (String i: str) {

            System.out.print(i);

        }

        System.out.print("\n\nsorting:\n");

        sorter.sorting(str);

        for (String i: str) {

            System.out.print(i);

        }

        System.out.print("\n\nreverse:\n");

        sorter.reverseSorting(str);

        for (String i: str) {

            System.out.print(i);

        }

    }

}

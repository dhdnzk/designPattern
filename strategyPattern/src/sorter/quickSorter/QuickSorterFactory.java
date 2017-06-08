package sorter.quickSorter;

import sorter.Sorter;
import sorter.SorterFactory;

/**
 * Created by Loui on 2017. 6. 8..
 */
public class QuickSorterFactory extends SorterFactory {

    public static Sorter create() {

        Sorter quickSorter = new QuickSorter();

        init();

        return quickSorter;

    }

    private static void init() {

    }

}

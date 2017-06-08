package sorter.bubbleSorter;

import sorter.Sorter;
import sorter.SorterFactory;

/**
 * Created by Loui on 2017. 6. 8..
 */
public class BubbleSorterFactory extends SorterFactory {

    public static Sorter create() {

        Sorter bubbleSorter = new BubbleSorter();

        init();

        return bubbleSorter;

    }

    private static void init() {

    }

}

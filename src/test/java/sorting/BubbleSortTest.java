package sorting;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static helpers.TestHelper.printArray;
import static org.junit.Assert.assertArrayEquals;

public class BubbleSortTest {

    private static final String SEPERATOR = "===============================";

    @Before
    public void before() {
        System.out.println(SEPERATOR);
    }

    @After
    public void after() {
        System.out.println(SEPERATOR);
    }

    private void displayArray(int[] a, boolean isSorted) {
        System.out.print((isSorted) ? "S" : "Un");
        System.out.println("orted array : ");
        printArray(a);
        System.out.println();
    }

    @Test
    public void test_one() {
        int[] actual = new int[] {2, -1};
        int[] expected = new int[] {-1, 2};
        displayArray(actual, false);

        BubbleSort.sort(actual);
        displayArray(actual, true);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test_two() {
        int[] actual = new int[] {-1, 5, 9, 2, 100, -11};
        int[] expected = new int[] {-11, -1, 2, 5, 9, 100};
        displayArray(actual, false);

        BubbleSort.sort(actual);
        displayArray(actual, true);
        assertArrayEquals(expected, actual);
    }
}

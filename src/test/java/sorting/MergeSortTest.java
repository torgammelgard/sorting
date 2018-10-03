package sorting;

import helpers.BasicSortTest;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MergeSortTest extends BasicSortTest {

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

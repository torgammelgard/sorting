package sorting;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class BasicSorterTest {

    private static final String SEPARATOR = "===============================";

    private Sorter sorter;

    public BasicSorterTest() {}
    BasicSorterTest(Sorter sorter) {
        this.sorter = sorter;
    }

    @Before
    public void before() {
        if (sorter == null) return;
        System.out.println(SEPARATOR);
        System.out.printf("Starting sort with %s.%n", sorter.toString());
    }

    @After
    public void after() {
        System.out.println(SEPARATOR);
    }

    private void displayArray(int[] a, boolean isSorted) {
        System.out.print((isSorted) ? "S" : "Un");
        System.out.println("orted array : ");
        printArray(a);
        System.out.println();
    }

    void printArray(int[] array) {
        System.out.print("[ ");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.print("]");
    }

    @Test
    public void test_one() {
        if (sorter == null) return;
        int[] actual = new int[] {2, -1};
        int[] expected = new int[] {-1, 2};
        displayArray(actual, false);

        sorter.sort(actual);
        displayArray(actual, true);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test_two() {
        if (sorter == null) return;
        int[] actual = new int[] {-1, 5, 9, 2, 100, -11};
        int[] expected = new int[] {-11, -1, 2, 5, 9, 100};
        displayArray(actual, false);

        sorter.sort(actual);
        displayArray(actual, true);
        assertArrayEquals(expected, actual);
    }
}

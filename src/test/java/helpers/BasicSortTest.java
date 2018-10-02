package helpers;

import org.junit.After;
import org.junit.Before;

import static helpers.TestHelper.printArray;

public class BasicSortTest {

    private static final String SEPARATOR = "===============================";

    @Before
    public void before() {
        System.out.println(SEPARATOR);
    }

    @After
    public void after() {
        System.out.println(SEPARATOR);
    }

    protected void displayArray(int[] a, boolean isSorted) {
        System.out.print((isSorted) ? "S" : "Un");
        System.out.println("orted array : ");
        printArray(a);
        System.out.println();
    }
}

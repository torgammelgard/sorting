import org.junit.Test;

public class InsertionSortTest {

    @Test
    public void test_One() {
        int[] testArray = new int[] {-1, 5, 9, 2, 100, -11};
        InsertionSort.sort(testArray);
        for (int i : testArray) System.out.print(i + ", ");
    }
}

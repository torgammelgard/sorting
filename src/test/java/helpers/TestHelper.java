package helpers;

public class TestHelper {

    public static void printArray(int[] array) {
        System.out.print("[ ");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.print("]");
    }
}

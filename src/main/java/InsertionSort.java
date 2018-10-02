public class InsertionSort {

    private static void swap(int[] a, int i, int j) {
        int buff = a[i];
        a[i] = a[j];
        a[j] = buff;
    }

    static void sort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int j = i;
            while (j > 0 && a[j] < a[j-1]) {
                swap(a, j,--j);
            }
        }
    }
}

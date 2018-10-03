package sorting;

public class MergeSort {

    private static void swap(int[] a, int i, int j) {
        int buff = a[i];
        a[i] = a[j];
        a[j] = buff;
    }

    static void sort(int[] a) {
        sort(a, 0, a.length);
    }

    private static void sort(int[] a, int left, int right) {

    }
}

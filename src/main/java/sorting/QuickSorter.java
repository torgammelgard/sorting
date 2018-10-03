package sorting;

import static sorting.Sorter.*;

public class QuickSorter implements Sorter {

    private int partition(int[] a, int lo, int hi) {
        int pivot = a[hi];
        int i = lo;
        for (int j = lo; j < hi - 1; j++) {
            if (a[j] < pivot) {
                swap(a, i++, j);
            }
        }
        swap(a, i, hi);
        return i;
    }

    private void quickSort(int[] a, int lo, int hi) {
        if (lo < hi) {
            int p = partition(a, lo, hi);
            quickSort(a, lo, p - 1);
            quickSort(a, p + 1, hi);
        }
    }

    @Override
    public void sort(int[] a) {
        quickSort(a, 0, a.length - 1);
    }

    @Override
    public String toString() {
        return "Quick sorter";
    }

}

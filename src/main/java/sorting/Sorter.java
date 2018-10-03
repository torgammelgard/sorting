package sorting;

public interface Sorter {

    void sort(int[] unsortedInts);

    static void swap(int[] a, int i, int j) {
        int buff = a[i];
        a[i] = a[j];
        a[j] = buff;
    }
}

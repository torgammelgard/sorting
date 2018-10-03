package sorting;

public class InsertionSorter implements Sorter {

    private static void swap(int[] a, int i, int j) {
        int buff = a[i];
        a[i] = a[j];
        a[j] = buff;
    }

    public void sort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int j = i;
            while (j > 0 && a[j] < a[j-1]) {
                swap(a, j,--j);
            }
        }
    }

    @Override
    public String toString() {
        return "Insertion sorter";
    }
}

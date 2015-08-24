package tree;

import java.util.Arrays;

/**
 * Created by gsantoro on 19/05/15.
 */
public class BinarySearch<T extends Comparable> {
    public int binarySearch(T[] data, T key) {
        int low = 0;
        int high = data.length - 1;

        while (low <= high) {
            int middle = low + (high - low) / 2;

            int cmp = key.compareTo(data[middle]);
            if (cmp < 0) {
                high = middle - 1;
            }
            else if (cmp > 0) {
                low = middle + 1;
            }
            else {
                return middle;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Integer[] array = new Integer[] { 1, 5, 6, 2, 3, 10 };
        Arrays.sort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();

        BinarySearch bs = new BinarySearch();
        int key = 2;
        int found = bs.binarySearch(array, key);

        System.out.println(String.format("Key: %d found @ %d", key, found));
    }
}

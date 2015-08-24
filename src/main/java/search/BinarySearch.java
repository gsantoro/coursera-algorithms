package search;

/**
 * Created by gsantoro on 17/05/15.
 */
public class BinarySearch {
    public static int binarySearch(int[] a, int key) {
        int low = 0, high = a.length - 1;
        while (low <= high) {
            int middle = low + (high - low) / 2;
            System.out.println(String.format("Iteration l: %d m: %d h: %d", low, middle, high));
            if (key < a[middle]) {
                high = middle - 1;
            }
            else if (key > a[middle]) {
                low = middle + 1;
            }
            else {
                return middle;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = new int[] {1, 2, 3, 6, 7, 9, 11};

        int numberToFind = 4;

        int index = binarySearch(a, numberToFind);

        System.out.println(String.format("%d Found @ %d", numberToFind, index));
    }
}

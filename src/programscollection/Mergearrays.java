package programscollection;

import java.util.Arrays;

public class Mergearrays {
    public static void main(String[] args) {
        int[] arr1 = {5, 3, 2};
        int[] arr2 = {9, 0, 1};

        int[] mergedArray = mergeArrays(arr1, arr2);

        System.out.println("Merged Array: " + Arrays.toString(mergedArray));
    }

    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        // Create a new array with the combined length of arr1 and arr2
        int[] merged = new int[arr1.length + arr2.length];

        // Copy elements from arr1 to the merged array
        System.arraycopy(arr1, 0, merged, 0, arr1.length);

        // Copy elements from arr2 to the merged array
        System.arraycopy(arr2, 0, merged, arr1.length, arr2.length);

        return merged;
    }
}

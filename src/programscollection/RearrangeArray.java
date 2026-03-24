package programscollection;

import java.util.Arrays;

public class RearrangeArray {
    public static void main(String[] args) {
        int[] arr = {2, 0, 4, 0, 3, 0, 5, 0};
        rearrangeEvenOdd(arr);
        System.out.println("Rearranged Array: " + Arrays.toString(arr));
    }

    public static void rearrangeEvenOdd(int[] arr) {
        int left = 0; // Pointer starting from the beginning
        int right = arr.length - 1; // Pointer starting from the end

        while (left < right) {
            // Move the left pointer until an odd number is found
            while (left < right && arr[left] % 2 == 0) {
                left++;
            }

            // Move the right pointer until an even number is found
            while (left < right && arr[right] % 2 != 0) {
                right--;
            }

            // Swap the odd number at 'left' with the even number at 'right'
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
    }
}

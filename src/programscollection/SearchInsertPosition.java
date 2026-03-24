package programscollection;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 6};
        int target1 = 5;
        int target2 = 2;
        int target3 = 7;

        System.out.println("Insert position for " + target1 + ": " + searchInsert(numbers, target1));
        System.out.println("Insert position for " + target2 + ": " + searchInsert(numbers, target2));
        System.out.println("Insert position for " + target3 + ": " + searchInsert(numbers, target3));
    }

    public static int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid; // Target found
            } else if (nums[mid] < target) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }

        // If not found, return the position where it would be inserted
        return left;
    }
}

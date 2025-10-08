package utils;

import java.util.Arrays;

public class NumberUtils {
    /**
     * Throws an exception Illegal Argument if arr is null
     * @param arr, an array to verify
     *
     */
    private static void nullValidateArray(int[] arr) {
        if (arr == null) {
            throw new NullPointerException("Array is null!");
        }
    }

    /**
     * Returns first found position of a number specified within supplied array.
     * @param arr, an array in which to look for
     * @param num, the number to find in an array
     * @return int index, returns the index of num in arr. Returns -1 if not found. Example:
     * Input: ([0,5,3,1], 5)
     * Output: 1
     */
    public static int getPos(int[] arr, int num) {
        nullValidateArray(arr);
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Returns last found position of a number specified within supplied array.
     * @param arr, an array in which to look for
     * @param num, the number to find in an array
     * @return int index, returns the index of num in arr. Returns -1 if not found. Example:
     * Input: ([0,5,3,1,5], 5)
     * Output: 4
     */
    public static int getLastPos(int[] arr, int num) {
        nullValidateArray(arr);
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                index = i;
            }
        }
        return index;
    }

    /**
     * Takes in two integer arrays and verifies if they are completely identical.
     * Verifies the length of both first, then loops through first and verifies the
     * values on each arrays in the specific looped index. If they are same the loop finishes and returns true.
     * Otherwise, the loop would break by returning false.
     * @param arr1, array to compare
     * @param arr2, array to compare to the first one
     * @return boolean
     */
    public static boolean isIdentical(int[] arr1, int[] arr2) {
        // checks if both are null returns true
        if (arr1 == null && arr2 == null) {return true;}

        // checks if only one was null, if so returns false using a xor statement
        if ((arr1 == null) ^ (arr2 == null)) {return false;}

        // looping through each element to compare the value of arrays
        if (notEqualLength(arr1, arr2)) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    /**
     * Sorts arrays and uses isIdentical
     * @param arr1 array to compare
     * @param arr2 array to compare
     * @return boolean if they are equal or not
     */
    public static boolean isEqual(int[] arr1, int[] arr2) {
        nullValidateArray(arr1);
        nullValidateArray(arr2);

        if (notEqualLength(arr1, arr2)) return false;

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return isIdentical(arr1, arr2);
    }

    /**
     * Returns true if two arrays have same length otherwise false
     * @param arr1 array to compare
     * @param arr2 array to compare
     * @return boolean to whether it is equal or not
     */
    private static boolean notEqualLength(int[] arr1, int[] arr2) {
        return arr1.length != arr2.length;
    }

    /**
     * Verifies if subset is subset of arr.
     * @param arr an array in which to look out for the subset
     * @param subset the array which is the subset of arr
     * @return boolean true if subset is a subset of arr otherwise false
     * Performs boolean validation of input first as it is near instant. Validates the null values and 0 lengths of the
     * arrays. Than sorts the arrays and uses a loop in a loop to find out if it is a subset.
     * */
    public static boolean isSubset(int[] subset, int[] arr) {
        // checks if any of the is null to return false using or statement
        if ((subset == null) || (arr == null)) {return false;}

        if (subset.length == 0 || arr.length == 0) {
            return false;
        }

        Arrays.sort(arr);
        Arrays.sort(subset);

        if (!notEqualLength(arr, subset)) return false;

        for (int i = 0; i < arr.length; i++) {
            if (subset.length >= arr.length-i) return false;
            if (arr[i] == subset[0]) {
                for (int j = 0; j < subset.length; j++) {
                    if (arr[i+j] != subset[j]) return false;
                }
                return true;
            }
        }
        return false;
    }

    /**
     * Loops through the loop and finds the highest value
     * @param nums array of int
     * @return the highest value in an array
     */
    public static int getMax(int[] nums) {
        nullValidateArray(nums);

        if (nums.length == 0) {
            throw new IllegalArgumentException("Array must not be empty.");
        }

        int max = nums[0];
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }

        return max;
    }

    static void main() {
        System.out.println(getMax(new int[]{}));
    }
}

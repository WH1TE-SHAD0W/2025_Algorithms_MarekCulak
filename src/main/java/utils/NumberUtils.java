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
            throw new IllegalArgumentException("Array is null!");
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
     *
     * Verifies the length of both first, then loops through first and verifies the
     * values on each arrays in the specific looped index. If they are same the loop finishes and returns true.
     * Otherwise, the loop would break by returning false.
     * @param arr1, array to compare
     * @param arr2, array to compare to the first one
     * @return boolean
     */
    public static boolean isIdentical(int[] arr1, int[] arr2) {
        nullValidateArray(arr1);
        nullValidateArray(arr2);
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
     */
    public static boolean isSubset(int[] subset, int[] arr) {
        nullValidateArray(arr);
        nullValidateArray(subset);

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
        int max = 0;
        if  (nums.length > 0) {
            max = nums[0];
        for (int num : nums) {
            if (num > max)  {
                max = num;
            }
            }
        }
        return max;
    }

    static void main() {
        System.out.println(getLastPos(new int[]{0,5,3,1,5}, 5));
    }
}

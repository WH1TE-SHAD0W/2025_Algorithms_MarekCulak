package utils;

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
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    static void main() {
        System.out.println(getLastPos(new int[]{0,5,3,1,5}, 5));
    }
}

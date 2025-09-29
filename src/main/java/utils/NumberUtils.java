package utils;

public class NumberUtils {
    /**
     * Returns first found position of a number specified within supplied array.
     * @param arr, an array in which to look for
     * @param num, the number to find in an array
     * @return int index, returns the index of num in arr. Returns -1 if not found. Example:
     * Input: ([0,5,3,1], 5)
     * Output: 1
     */
    public static int getPos(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                return i;
            }
        }
        return -1;
    }
}

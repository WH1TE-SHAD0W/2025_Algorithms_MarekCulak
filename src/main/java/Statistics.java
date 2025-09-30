import utils.DataGenerator;
import utils.NumberUtils;

import java.util.Arrays;

public class Statistics {
    static void main() {
        int[] stats = {10, 20, 10, 20, 60, 10, 5, 60, 5, 60};
        int[] rand_array = DataGenerator.getRandomArray(6);

        System.out.println(Arrays.toString(rand_array));
        System.out.println(Arrays.toString(stats));

        int max = NumberUtils.getMax(rand_array);
        System.out.println("The biggest number is: " + max);

        int max_index_first = NumberUtils.getPos(rand_array, max);
        System.out.println("The biggest number first found number is at index: " + max_index_first);

        int max_index_last = NumberUtils.getLastPos(rand_array, max);
        System.out.println("The biggest number last found number is at index: " + max_index_last);

        if (NumberUtils.isIdentical(rand_array, stats)) {
            System.out.println("The arrays are identical");
        } else {
            System.out.println("The arrays are not identical");
        }

        if (NumberUtils.isEqual(rand_array, stats)) {
            System.out.println("The arrays are equal by their values");
        } else {
            System.out.println("The arrays are not equal by their values");
        }

        if (NumberUtils.isSubset(rand_array, stats)) {
            System.out.println("The random array is a subset of the stats written");
        } else if (NumberUtils.isSubset(stats, rand_array)) {
            System.out.println("The array of hard-coded stats is a subset of random array");
        } else  {
            System.out.println("The random array is not a subset of the stats written");
        }
    }
}

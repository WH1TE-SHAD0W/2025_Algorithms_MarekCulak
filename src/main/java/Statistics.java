import utils.DataGenerator;
import utils.NumberUtils;

import java.util.Arrays;

public class Statistics {
    static void main() {
        int[] stats = {10, 20, 10, 20, 60, 10, 5, 60, 5, 60};
        int[] rand_array = DataGenerator.getRandomArray(10);

        System.out.println(Arrays.toString(rand_array));
        System.out.println(Arrays.toString(stats));
    }
}

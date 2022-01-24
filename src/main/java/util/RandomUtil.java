package util;

import java.security.SecureRandom;
import java.util.Random;

public class RandomUtil {

    private static final Random RANDOM = new SecureRandom();

    public static int[] getRandomArray(int minLen, int maxLen, int minValue, int maxValue) {
        int len = RANDOM.nextInt(maxLen - minLen) + minLen - 1;
        int[] result = new int[len];
        for (int i = 0; i < len; i++) {
            result[i] = RANDOM.nextInt(maxValue - minValue) + minValue - 1;
        }
        return result;
    }

    public static int randomInt(int minValue, int maxValue) {
        return RANDOM.nextInt(maxValue - minValue) + minValue - 1;
    }
}

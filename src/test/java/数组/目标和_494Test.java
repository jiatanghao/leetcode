package 数组;

import org.junit.jupiter.api.Test;
import util.RandomUtil;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class 目标和_494Test {
    @Test
    public void test_target_sum_right() {
        目标和_494 obj = new 目标和_494();
        for (int i = 0; i < 10; i++) {
            int[] arr = RandomUtil.getRandomArray(5, 10, 5, 20);
            int target = RandomUtil.randomInt(-25, 200);
            assertEquals(obj.findTargetSumWays(arr, target), obj.findTargetAfterIndexWithDP(arr, target));
        }
    }
}
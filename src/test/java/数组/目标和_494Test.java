package 数组;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class 目标和_494Test {
    @Test
    public void test_target_sum_right() {
        int[] arr = {1, 2, 3, 6};
        目标和_494 obj = new 目标和_494();
        assertEquals(2, obj.findTargetSumWays(arr, 6));
    }
}
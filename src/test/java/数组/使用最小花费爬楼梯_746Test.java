package 数组;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 使用最小花费爬楼梯_746Test {

    @Test
    void minCostClimbingStairs() {
        使用最小花费爬楼梯_746 obj = new 使用最小花费爬楼梯_746();
        Assertions.assertEquals(15, obj.minCostClimbingStairs(new int[] {10, 15, 20}));
        Assertions.assertEquals(6, obj.minCostClimbingStairs(new int[] {1, 100, 1, 1, 1, 100, 1, 1, 100, 1}));
    }
}
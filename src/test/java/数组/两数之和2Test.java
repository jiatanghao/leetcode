package 数组;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class 两数之和2Test {

    @Test
    void twoSum() {
        两数之和2 obj = new 两数之和2();
        Assertions.assertArrayEquals(new int[] {1, 2} ,obj.twoSum(new int[] {2, 7, 11, 15}, 9));
        Assertions.assertArrayEquals(new int[] {1, 3} ,obj.twoSum(new int[] {2, 3, 4}, 6));
        Assertions.assertArrayEquals(new int[] {1, 2} ,obj.twoSum(new int[] {-1, 0}, -1));
    }
}
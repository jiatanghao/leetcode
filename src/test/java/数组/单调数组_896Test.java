package 数组;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class 单调数组_896Test {

    @Test
    void isMonotonic() {
        int[] arr1 = new int[] {1, 2, 2, 3};
        int[] arr2 = new int[] {6, 5, 4, 4};
        int[] arr3 = new int[] {1, 3, 2};
        int[] arr4 = new int[] {1, 2, 4, 5};
        int[] arr5 = new int[] {1, 1, 1};
        单调数组_896 单调数组 = new 单调数组_896();
        Assertions.assertTrue(单调数组.isMonotonic(arr1));
        Assertions.assertTrue(单调数组.isMonotonic(arr2));
        Assertions.assertFalse(单调数组.isMonotonic(arr3));
        Assertions.assertTrue(单调数组.isMonotonic(arr4));
        Assertions.assertTrue(单调数组.isMonotonic(arr5));
    }
}
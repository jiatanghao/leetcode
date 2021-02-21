package 数组;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class 第k个缺失的正整数_1539Test {

    @Test
    void findKthPositive() {
        int[] arr1 = {2, 3, 4, 7, 11};
        int[] arr2 = {1, 2, 3, 4};
        第k个缺失的正整数_1539 obj = new 第k个缺失的正整数_1539();
        Assertions.assertEquals(9, obj.findKthPositive(arr1, 5));
        Assertions.assertEquals(6, obj.findKthPositive(arr2, 2));
    }
}
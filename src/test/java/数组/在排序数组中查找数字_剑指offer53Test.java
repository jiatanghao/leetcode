package 数组;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 在排序数组中查找数字_剑指offer53Test {

    @Test
    void search() {
        在排序数组中查找数字_剑指offer53 offer = new 在排序数组中查找数字_剑指offer53();
        int[] nums = {5, 7, 7, 8, 8, 10};
        Assertions.assertEquals(2, offer.search(nums, 8));
        Assertions.assertEquals(0, offer.search(nums, 6));
    }
}
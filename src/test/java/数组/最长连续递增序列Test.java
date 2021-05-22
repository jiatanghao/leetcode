package 数组;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 最长连续递增序列Test {

    @Test
    void findLengthOfLCIS() {
        Assertions.assertEquals(4, new 最长连续递增序列().findLengthOfLCIS(new int[] {1, 3, 5, 7}));
    }
}
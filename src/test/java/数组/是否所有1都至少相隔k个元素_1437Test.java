package 数组;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 是否所有1都至少相隔k个元素_1437Test {

    @Test
    void kLengthApart() {
        是否所有1都至少相隔k个元素_1437 obj = new 是否所有1都至少相隔k个元素_1437();
        Assertions.assertTrue(obj.kLengthApart(new int[]{1, 0, 0, 0, 1, 0, 0, 1}, 2));
        Assertions.assertFalse(obj.kLengthApart(new int[]{1, 0, 0, 1, 0, 1}, 2));
        Assertions.assertTrue(obj.kLengthApart(new int[]{1, 1, 1, 1, 1}, 0));
        Assertions.assertTrue(obj.kLengthApart(new int[]{0, 1, 0, 1}, 1));
    }
}
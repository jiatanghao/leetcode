package 位运算;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class 配对交换Test {

    @Test
    void exchangeBits() {
        Assertions.assertEquals(287504137, new 配对交换().exchangeBits(571603718));
    }
}
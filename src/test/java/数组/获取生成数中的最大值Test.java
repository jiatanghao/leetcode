package 数组;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class 获取生成数中的最大值Test {

    @Test
    void getMaximumGenerated() {
        获取生成数中的最大值 obj = new 获取生成数中的最大值();
        Assertions.assertEquals(3, obj.getMaximumGenerated(7));
        Assertions.assertEquals(1, obj.getMaximumGenerated(2));
        Assertions.assertEquals(2, obj.getMaximumGenerated(3));
    }
}
package 数组;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class 多数元素_169Test {

  @Test
  void majorityElement() {
    多数元素_169 obj = new 多数元素_169();
    Assertions.assertEquals(3, obj.majorityElement(new int[] {3, 2, 3}));
    Assertions.assertEquals(2, obj.majorityElement(new int[] {2, 2, 1, 1, 1, 2, 2}));
  }
}

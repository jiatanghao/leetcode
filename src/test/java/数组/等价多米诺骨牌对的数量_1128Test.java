package 数组;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class 等价多米诺骨牌对的数量_1128Test {

  @Test
  void numEquivDominoPairs() {
    int[][] array = new int[][] {{1, 2}, {2, 1}, {3, 4}, {5, 6}};
    Assertions.assertEquals(1, new 等价多米诺骨牌对的数量_1128().numEquivDominoPairs(array));
  }
}

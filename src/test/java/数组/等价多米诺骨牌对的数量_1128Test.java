package 数组;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class 等价多米诺骨牌对的数量_1128Test {

  @Test
  void numEquivDominoPairs() {
    int[][] array = new int[][] {{1, 2}, {2, 1}, {3, 4}, {5, 6}};
    Assertions.assertEquals(1, new 等价多米诺骨牌对的数量_1128().numEquivDominoPairs(array));
    Map<int[], int[]> map = new HashMap<>();
    map.put(new int[] {1, 2}, new int[] {3, 4});
    System.out.println(Arrays.toString(map.get(new int[]{1, 2})));
  }
}

package 数组;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class 可被5整除的二进制前缀_1018Test {

  @Test
  void prefixesDivBy5() {
    int[] arr1 = {0, 1, 1};
    int[] arr2 = {1, 1, 1};
    int[] arr3 = {0, 1, 1, 1, 1, 1};
    int[] arr4 = {1, 1, 1, 0, 1};
    int[] arr5 = {
      1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0,
      1, 1, 0, 1, 0, 0, 0, 1
    };
    可被5整除的二进制前缀_1018 obj = new 可被5整除的二进制前缀_1018();
        Assertions.assertEquals(
            List.of(Boolean.TRUE, Boolean.FALSE, Boolean.FALSE), obj.prefixesDivBy5(arr1));
        Assertions.assertEquals(
            List.of(Boolean.FALSE, Boolean.FALSE, Boolean.FALSE), obj.prefixesDivBy5(arr2));
        Assertions.assertEquals(
            List.of(
                Boolean.TRUE, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, Boolean.TRUE,
     Boolean.FALSE),
            obj.prefixesDivBy5(arr3));
        Assertions.assertEquals(
            List.of(Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE),
            obj.prefixesDivBy5(arr4));
    List<Boolean> expected5 =
        List.of(
            false, false, false, false, false, false, false, false, false, false, false, false,
            false, false, false, false, false, false, false, false, false, false, false, false,
            false, false, false, false, false, false, false, true, false, false, true, true, true,
            true, false);
    List<Boolean> actual5 = obj.prefixesDivBy5(arr5);
    Assertions.assertEquals(expected5.size(), actual5.size());
    for (int i = 0; i < expected5.size(); i++) {
      Assertions.assertEquals(expected5.get(i), actual5.get(i));
    }
  }
}

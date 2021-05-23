package 数组;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class 数组形式的整数加法Test {

    @Test
    void addToArrayForm() {
        int[] a = {2, 7, 4};
        List<Integer> integers = new 数组形式的整数加法().addToArrayForm(a, 181);
        Assertions.assertEquals(3, integers.size());
        Assertions.assertEquals(4, integers.get(0));
        Assertions.assertEquals(5, integers.get(1));
        Assertions.assertEquals(5, integers.get(2));
    }
}
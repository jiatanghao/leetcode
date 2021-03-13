package 数组;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class 圆形赛道上经过次数最多的扇区Test {

    @Test
    void mostVisited() {
        圆形赛道上经过次数最多的扇区 obj = new 圆形赛道上经过次数最多的扇区();
        List<Integer> result1 = obj.mostVisited(4, new int[]{1, 3, 1, 2});
        Assertions.assertEquals(1, result1.get(0));
        Assertions.assertEquals(2, result1.get(1));
        Assertions.assertEquals(2, result1.size());

        List<Integer> result2 = obj.mostVisited(2, new int[]{2, 1, 2, 1, 2, 1, 2, 1, 2});
        Assertions.assertEquals(1, result2.size());
        Assertions.assertEquals(2, result2.get(0));

        List<Integer> result3 = obj.mostVisited(7, new int[]{1, 3, 5, 7});
        Assertions.assertEquals(7, result3.size());
        Assertions.assertEquals(1, result3.get(0));
        Assertions.assertEquals(2, result3.get(1));
        Assertions.assertEquals(3, result3.get(2));
        Assertions.assertEquals(4, result3.get(3));
        Assertions.assertEquals(5, result3.get(4));
        Assertions.assertEquals(6, result3.get(5));
        Assertions.assertEquals(7, result3.get(6));
    }
}
package 数组;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class 找到所有数组中消失的数字_448Test {

    @Test
    void findDisappearedNumbers() {
        找到所有数组中消失的数字_448 obj = new 找到所有数组中消失的数字_448();
        List<Integer> numbers = obj.findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1});
        Assertions.assertEquals(5, numbers.get(0));
        Assertions.assertEquals(6, numbers.get(1));
    }
}
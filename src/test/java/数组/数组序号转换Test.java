package 数组;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class 数组序号转换Test {

    private final 数组序号转换 object = new 数组序号转换();

    @Test
    void arrayRankTransform() {
        int[] arr = {37, 12, 28, 9, 100, 56, 80, 5, 12};
        System.out.println(Arrays.toString(object.arrayRankTransform(arr)));
    }
}
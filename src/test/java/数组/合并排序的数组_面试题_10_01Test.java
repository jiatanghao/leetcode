package 数组;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class 合并排序的数组_面试题_10_01Test {

    @Test
    void merge() {
        int[] a = new int[] {1, 2, 3, 0, 0, 0};
        int[] b = new int[] {2, 5, 6};
        new 合并排序的数组_面试题_10_01().merge(a, 3, b, 3);
        System.out.println(Arrays.toString(a));
    }
}
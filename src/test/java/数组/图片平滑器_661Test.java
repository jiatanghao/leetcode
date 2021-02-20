package 数组;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class 图片平滑器_661Test {

    @Test
    void imageSmoother() {
        int[][] matrix = new int[][] {{1,1,1},{1,0,1},{1,1,1}};
        int[][] result = new 图片平滑器_661().imageSmoother(matrix);
        int[][] standard = new int[][] {{0,0,0},{0,0,0},{0,0,0}};
        Assertions.assertArrayEquals(standard[0], result[0]);
        Assertions.assertArrayEquals(standard[1], result[1]);
        Assertions.assertArrayEquals(standard[2], result[2]);
    }
}
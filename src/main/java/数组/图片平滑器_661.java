package 数组;

/**
 * @author 贾唐浩
 * @version 1.0
 * @since 2021-02-20
 * link:  https://leetcode-cn.com/problems/image-smoother/
 */
public class 图片平滑器_661 {
    public int[][] imageSmoother(int[][] M) {
        int[][] result = new int[M.length][M[0].length];
        for (int i = 0; i < M.length; i++) {
            int minRow = Math.max(i - 1, 0);
            int maxRow = Math.min(i + 1, M.length - 1);
            for (int j = 0; j < M[i].length; j++) {
                int minCol = Math.max(j - 1, 0);
                int maxCol = Math.min(j + 1, M[i].length - 1);
                int tmp = 0;
                for (int k = minRow; k <= maxRow; k++) {
                    for (int l = minCol; l <= maxCol; l++) {
                        tmp += M[k][l];
                    }
                }
                tmp /= (maxCol - minCol + 1) * (maxRow - minRow + 1);
                result[i][j] = tmp;
            }
        }
        return result;
    }
}

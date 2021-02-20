package 数组;

/**
 * @author 贾唐浩
 * @version 1.0
 * @since 2021-02-20
 * https://leetcode-cn.com/problems/sorted-merge-lcci/
 */
public class 合并排序的数组_面试题_10_01 {
    public void merge(int[] A, int m, int[] B, int n) {
        int len = m + n;
        for (int i = len - 1; i >= 0; i--) {
            if (m > 0 && n > 0) {
                if (A[m - 1] > B[n - 1]) {
                    A[i] = A[m - 1];
                    m--;
                } else {
                    A[i] = B[n - 1];
                    n--;
                }
            } else if (n > 0) {
                System.arraycopy(B, 0, A, 0, n);
                break;
            }
        }
    }
}

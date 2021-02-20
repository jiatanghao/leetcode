package 数组;

/**
 * @author 贾唐浩
 * @version 1.0
 * @since 2021-02-20
 * https://leetcode-cn.com/problems/min-cost-climbing-stairs/
 */
public class 使用最小花费爬楼梯_746 {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int prev = 0, current = 0;
        for (int i = 2; i <= n; i++) {
            int next = Math.min(prev + cost[i - 2], current + cost[i - 1]);
            prev = current;
            current = next;
        }
        return current;
    }
}

package 数组;

/**
 * https://leetcode-cn.com/problems/target-sum/
 */
public class 目标和_494 {
    public int findTargetSumWays(int[] nums, int target) {
        return findTargetAfterIndex(nums, 0, target);
    }
    private int findTargetAfterIndex(int[] arr, int index, int target) {
        if (index == arr.length) {
            return target == 0 ? 1 : 0;
        }
        return findTargetAfterIndex(arr, index + 1, target - arr[index]) + findTargetAfterIndex(arr, index + 1, target + arr[index]);
    }
}

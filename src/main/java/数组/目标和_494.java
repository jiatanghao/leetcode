package 数组;

import java.util.HashMap;
import java.util.Map;

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

    public int findTargetAfterIndexWithDP(int[] arr, int target) {
        return findTargetAfterIndexWithDP(arr,0, target, new HashMap<>());
    }

    private int findTargetAfterIndexWithDP(int[] arr, int index, int target, Map<Integer, Map<Integer, Integer>> dp) {
        if (dp.containsKey(index) && dp.get(index).containsKey(target)) {
            return dp.get(index).get(target);
        }
        int ans;
        if (index == arr.length) {
            ans = target == 0 ? 1 : 0;
        } else {
            ans = findTargetAfterIndexWithDP(arr, index + 1, target - arr[index], dp) +
                    findTargetAfterIndexWithDP(arr, index + 1, target + arr[index], dp);
        }
        if (!dp.containsKey(index)) {
            dp.put(index, new HashMap<>());
        }
        dp.get(index).put(target, ans);
        return ans;
    }
}

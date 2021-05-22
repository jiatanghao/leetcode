package 数组;

public class 最长连续递增序列 {
    public int findLengthOfLCIS(int[] nums) {
        int start = 0;
        int end = 0;
        int maxLength = 1;
        while (end < nums.length) {
            if (end < nums.length - 1 && nums[end] < nums[end+1]) {
                end++;
            } else {
                int currentLength = end - start + 1;
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                }
                start = end + 1;
                end = start;
            }
        }
        return maxLength;
    }
}

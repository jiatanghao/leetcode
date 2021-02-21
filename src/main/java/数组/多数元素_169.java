package 数组;

public class 多数元素_169 {
    public int majorityElement(int[] nums) {
        int candidate = nums[0], count = 0;
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }
        return candidate;
    }
}

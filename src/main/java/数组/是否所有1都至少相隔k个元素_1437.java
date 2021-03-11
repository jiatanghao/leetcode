package 数组;

import java.util.ArrayList;
import java.util.List;

public class 是否所有1都至少相隔k个元素_1437 {
    public boolean kLengthApart(int[] nums, int k) {
        List<Integer> locations = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                locations.add(i);
            }
        }
        if (locations.size() <= 1) {
            return false;
        }
        for (int i = 0; i < locations.size() - 1; i++) {
            if (locations.get(i + 1) - locations.get(i) < k + 1) {
                return false;
            }
        }
        return true;
    }
}

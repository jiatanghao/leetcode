package 数组;

public class 两数之和2 {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while (target != numbers[left] + numbers[right]) {
            if (target < numbers[left] + numbers[right]) {
                right--;
            } else {
                left++;
            }
        }
        return new int[] {left + 1, right + 1};
    }
}

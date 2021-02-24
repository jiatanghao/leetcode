package 数组;

public class 买卖股票的最佳时机_121 {
    public int maxProfit(int[] prices) {
        int[] changes = new int[prices.length - 1];
        for (int i = 0; i < prices.length - 1; i++) {
            changes[i] = prices[i + 1] - prices[i];
        }
        int max = 0;
        int current = 0;
        for (int change : changes) {
            current += change;
            if (current > max) {
                max = current;
            } else if (current < 0) {
                current = 0;
            }
        }
        return max;
    }
}

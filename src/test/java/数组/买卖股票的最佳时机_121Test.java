package 数组;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class 买卖股票的最佳时机_121Test {

  @Test
  void maxProfit() {
    买卖股票的最佳时机_121 obj = new 买卖股票的最佳时机_121();
    Assertions.assertEquals(5, obj.maxProfit(new int[] {7, 1, 5, 3, 6, 4}));
    Assertions.assertEquals(0, obj.maxProfit(new int[] {7, 6, 4, 3, 1}));
  }
}

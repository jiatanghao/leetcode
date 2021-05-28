package 数组;

public class 人口最多的年份 {
    public int maximumPopulation(int[][] logs) {
        int[] count = new int[101];
        for (int[] log : logs) {
            for (int j = log[0]; j < log[1]; j++) {
                count[j - 1950]++;
            }
        }
        int max = 0;
        for (int i = 1; i < 101; i++) {
            if (count[i] > count[max]) {
                max = i;
            }
        }
        return max + 1950;
    }
}

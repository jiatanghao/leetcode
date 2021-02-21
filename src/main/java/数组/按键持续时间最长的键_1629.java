package 数组;

public class 按键持续时间最长的键_1629 {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int[] times = new int[26];
        int costTime;
        for (int i = 0 ; i < keysPressed.length(); i++) {
            costTime = i == 0 ? releaseTimes[0] : releaseTimes[i] - releaseTimes[i - 1];
            int position = keysPressed.charAt(i) - 'a';
            if (costTime > times[position]) {
                times[position] = costTime;
            }
        }
        int max = 0;
        for (int i = 1; i < 26; i++) {
            if (times[i] >= times[max]) {
                max = i;
            }
        }
        return (char)('a' + max);
    }
}

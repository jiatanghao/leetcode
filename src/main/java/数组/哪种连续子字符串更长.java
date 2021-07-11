package 数组;

public class 哪种连续子字符串更长 {
    public boolean checkZeroOnes(String s) {
        int len0 = 0;
        int max0 = 0;
        int i = 0;
        int len1 = 0;
        int max1 = 0;
        while (i < s.length()) {
            if (s.charAt(i) == '0') {
                len0++;
                if (len0 > max0) {
                    max0 = len0;
                }
                len1 = 0;
            } else {
                len1++;
                if (len1 > max1) {
                    max1 = len1;
                }
                len0 = 0;
            }
            i++;
        }
        return max0 < max1;
    }
}
